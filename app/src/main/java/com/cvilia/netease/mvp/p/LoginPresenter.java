package com.cvilia.netease.mvp.p;

import android.util.Log;

import com.cvilia.netease.config.Constants;
import com.cvilia.netease.bean.login.UserLoginBean;
import com.cvilia.netease.mvp.c.LoginContact;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.net.NetSubscribe;
import com.cvilia.netease.net.RetrofitUtils;
import com.cvilia.netease.sp.MMKVUtil;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
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
                .subscribe(new NetSubscribe<UserLoginBean>() {

                    @Override
                    public void onSuccess(UserLoginBean userLoginBean) {
                        saveLoginInfo(false, email, password, userLoginBean.getCookie(),userLoginBean);
                        mView.loginSuccess(userLoginBean);
                    }

                    @Override
                    public void onFailed(Throwable throwable) {
                        super.onError(throwable);
                        Log.e("LoginPresenter", "onError loginByEmail=" + throwable.toString());
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
                .subscribe(new NetSubscribe<UserLoginBean>() {

                    @Override
                    public void onSuccess(UserLoginBean userLoginBean) {
                        saveLoginInfo(true, phone, password, userLoginBean.getCookie(), userLoginBean);
                        mView.loginSuccess(userLoginBean);
                    }

                    @Override
                    public void onFailed(Throwable throwable) {
                        Log.e("LoginPresenter", "onError loginByEmail=" + throwable.toString());
                        mView.loginFailed();
                    }
                });
    }

    private void saveLoginInfo(boolean isPhone, String account, String password, String cookie, UserLoginBean user) {
        MMKVUtil.saveBool(Constants.LOGIN_TYPE, isPhone);
        MMKVUtil.saveString(Constants.LOGIN_ACCOUNT, account);
        MMKVUtil.saveString(Constants.LOGIN_PASSWORD, password);
        MMKVUtil.saveString(Constants.USER_COOKIE, cookie);
        MMKVUtil.saveString(Constants.USER_ID, user.getAccount().getId());
        MMKVUtil.saveString(Constants.USER_NAME, user.getAccount().getUserName());
        MMKVUtil.saveString(Constants.USER_NICK_NAME, user.getProfile().getNickname());
        MMKVUtil.saveString(Constants.USER_TOKEN, user.getToken());
    }

}
