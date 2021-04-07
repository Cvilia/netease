package com.cvilia.netease.activity.discovery;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.ActivityRecommendPerdayBinding;
import com.cvilia.netease.entity.RecommendPerDayEntity;
import com.cvilia.netease.framework.BaseActivity;
import com.cvilia.netease.mvp.c.RecommendPerDayContact;
import com.cvilia.netease.mvp.p.RecommendPerDayPresenter;

import java.util.List;

@Route(path = PageUrlConfig.RECOMMEND_PER_DAY)
public class RecommendPerDayActivity extends BaseActivity<RecommendPerDayPresenter> implements RecommendPerDayContact.View {

    private ActivityRecommendPerdayBinding mViewBind;

    @Override
    protected void onViewCreated() {

    }

    @Override
    protected View getRootView() {
        mViewBind = ActivityRecommendPerdayBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected void initWidgetEvent() {

    }

    @Override
    protected void initData() {
        mPresenter.getRecommendSongs();
    }

    @Override
    protected RecommendPerDayPresenter getPresenter() {
        return new RecommendPerDayPresenter();
    }

    @Override
    public void loading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void getRecommendSuccess(List<RecommendPerDayEntity> songs) {

    }

    @Override
    public void getRecommendFailed() {

    }
}