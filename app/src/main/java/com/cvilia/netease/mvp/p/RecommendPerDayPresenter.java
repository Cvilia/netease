package com.cvilia.netease.mvp.p;

import com.cvilia.netease.entity.RecommendPerDayEntity;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.mvp.c.RecommendPerDayContact;
import com.cvilia.netease.net.ApiService;
import com.cvilia.netease.net.NetSubscribe;
import com.cvilia.netease.net.RetrofitUtils;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-04-05-21:34
 * describe:RecommendPerDayActivity 每日推荐歌曲
 */
public class RecommendPerDayPresenter extends BasePresenter<RecommendPerDayContact.View> implements RecommendPerDayContact.Presenter {
    @Override
    public void getRecommendSongs() {
        RetrofitUtils.getInstance().getRecommendSongs().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new NetSubscribe<RecommendPerDayEntity>() {
                    @Override
                    public void onNext(@NonNull RecommendPerDayEntity recommendPerDayEntity) {

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        super.onError(e);
                    }
                });
    }
}
