package com.cvilia.netease.mvp.p;

import android.util.Log;

import com.cvilia.netease.bean.BannerEntity;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.mvp.c.DiscoverContact;
import com.cvilia.netease.net.NetSubscribe;
import com.cvilia.netease.net.RetrofitUtils;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * author: lzy
 * email: v_lizhenyu@tal.com
 * date: 2021-04-02-4:59 PM
 * describe：DiscoveryFragment presenter
 */
public class DiscoveryPresenter extends BasePresenter<DiscoverContact.View> implements DiscoverContact.Presenter {
    @Override
    public void getBanners() {
        RetrofitUtils.getInstance()
                .getBanners()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new NetSubscribe<BannerEntity>() {
                    @Override
                    public void onNext(@NonNull BannerEntity banner) {
                        Log.d("DiscoverFragment", banner.getCode() + "\n" + banner.toString());
                        if (banner.getCode()==200&&banner.getBanners()!=null&&banner.getBanners().size()>0){
                            mView.getBannerSuccess(banner.getBanners());
                        }else {
                            mView.getBannerFail();
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        super.onError(e);
                        mView.getBannerFail();
                    }
                });
    }
}
