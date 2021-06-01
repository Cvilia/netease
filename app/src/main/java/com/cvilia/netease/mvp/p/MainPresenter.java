package com.cvilia.netease.mvp.p;

import android.util.Log;

import com.cvilia.netease.config.Constants;
import com.cvilia.netease.bean.login.UserLoginBean;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.mvp.c.MainContact;
import com.cvilia.netease.net.NetSubscribe;
import com.cvilia.netease.net.RetrofitUtils;
import com.cvilia.netease.sp.MMKVUtil;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class MainPresenter extends BasePresenter<MainContact.View> implements MainContact.Presenter {
    @Override
    public void show() {

    }

    @Override
    public void refreshLogin() {
        boolean loginType = MMKVUtil.getBool(Constants.LOGIN_TYPE);
        String account = MMKVUtil.getString(Constants.LOGIN_ACCOUNT);
        String password = MMKVUtil.getString(Constants.LOGIN_PASSWORD);
        if (loginType) {
            RetrofitUtils.getInstance()
                    .loginByPhone(account, password)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new NetSubscribe<UserLoginBean>() {
                        @Override
                        public void onNext(@NonNull UserLoginBean user) {}

                        @Override
                        public void onError(@NonNull Throwable e) {
                            super.onError(e);
                            Log.e("MainPresenter", "onError loginByEmail=" + e.toString());
                        }
                    });
        } else {
            RetrofitUtils.getInstance()
                    .loginByEmail(account, password)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new NetSubscribe<UserLoginBean>() {
                        @Override
                        public void onNext(@NonNull UserLoginBean user) {}

                        @Override
                        public void onError(@NonNull Throwable e) {
                            super.onError(e);
                            Log.e("MainPresenter", "onError loginByEmail=" + e.toString());
                        }
                    });
        }

    }
}
