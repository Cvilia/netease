package com.cvilia.netease.mvp.p;

import android.util.Log;

import com.cvilia.netease.NeteaseApplication;
import com.cvilia.netease.config.Constants;
import com.cvilia.netease.mvp.c.LoginContact;
import com.cvilia.netease.bean.User;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.net.NetSubscribe;
import com.cvilia.netease.net.RetrofitUtils;
import com.cvilia.netease.sp.MMKVUtil;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public class LoginPresenter extends BasePresenter<LoginContact.View> implements LoginContact.Presenter {

    @Override
    public void loginByEmail(String email, String password) {
        RetrofitUtils.getInstance()
                .loginByEmail(email, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new NetSubscribe<User>() {
                    @Override
                    public void onNext(@NonNull User user) {
                        saveLoginInfo(false, email, password, user.getCookie());
                        mView.loginSuccess(user);
                        NeteaseApplication.app.setUser(user);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        super.onError(e);
                        Log.e("LoginPresenter", "onError loginByEmail=" + e.toString());
                        mView.loginFailed();
                    }
                });
    }

    @Override
    public void loginByPhone(String phone, String password) {
        RetrofitUtils.getInstance()
                .loginByPhone(phone, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new NetSubscribe<User>() {
                    @Override
                    public void onNext(@NonNull User user) {
                        saveLoginInfo(true, phone, password, user.getCookie());
                        mView.loginSuccess(user);
                        NeteaseApplication.app.setUser(user);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        super.onError(e);
                        Log.e("LoginPresenter", "onError loginByEmail=" + e.toString());
                        mView.loginFailed();
                    }
                });
    }

    private void saveLoginInfo(boolean isPhone, String account, String password, String cookie) {
        MMKVUtil.saveBool(Constants.LOGIN_TYPE, isPhone);
        MMKVUtil.saveString(Constants.LOGIN_ACCOUNT, account);
        MMKVUtil.saveString(Constants.LOGIN_PASSWORD, password);
        MMKVUtil.saveString(Constants.USER_COOKIE, cookie);
    }

}
