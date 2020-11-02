package com.cvilia.netease.activity.login;

import android.util.Log;

import com.cvilia.netease.NeteaseApplication;
import com.cvilia.netease.bean.User;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.net.NetSubscribe;
import com.cvilia.netease.net.RetrofitUtils;

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
                        if (user != null) {
                            mView.loginSuccess(user);
                            NeteaseApplication.app.setUser(user);
                        }
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
                        if (user != null) {
                            mView.loginSuccess(user);
                            NeteaseApplication.app.setUser(user);
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        super.onError(e);
                        Log.e("LoginPresenter", "onError loginByEmail=" + e.toString());
                        mView.loginFailed();
                    }
                });
    }
}
