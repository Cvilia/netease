package com.cvilia.netease.mvp.p;

import android.util.Log;

import com.cvilia.netease.bean.BannerEntity;
import com.cvilia.netease.bean.TiktokBean;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.mvp.c.TiktokContact;
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
public class TiktokPresenter extends BasePresenter<TiktokContact.View> implements TiktokContact.Presenter {

    @Override
    public void getRecommendVideo(int offset) {
        RetrofitUtils.getInstance().getRecommendVideos(offset).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new NetSubscribe<TiktokBean>() {
                    @Override
                    public void onSuccess(TiktokBean bean) {
                        mView.showSuccess(bean);
                    }

                    @Override
                    public void onFailed(Throwable throwable) {
                        mView.showFailed();
                    }
                });
    }
}
