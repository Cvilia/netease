package com.cvilia.netease.activity.discovery;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cvilia.netease.R;
import com.cvilia.netease.adapter.RecommendSongsPerDayAdapter;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.ActivityRecommendPerdayBinding;
import com.cvilia.netease.entity.DayRecommendEntity;
import com.cvilia.netease.framework.BaseActivity;
import com.cvilia.netease.mvp.c.RecommendPerDayContact;
import com.cvilia.netease.mvp.p.RecommendPerDayPresenter;
import com.cvilia.netease.utils.DimenUtil;

@Route(path = PageUrlConfig.RECOMMEND_PER_DAY)
public class RecommendPerDayActivity extends BaseActivity<RecommendPerDayPresenter> implements RecommendPerDayContact.View {

    private ActivityRecommendPerdayBinding mViewBind;
    private RecommendSongsPerDayAdapter adapter;

    @Override
    protected void onViewCreated() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mViewBind.recyclerView.setLayoutManager(linearLayoutManager);
        mViewBind.recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top = DimenUtil.dp2px(RecommendPerDayActivity.this, 8);
                outRect.bottom = DimenUtil.dp2px(RecommendPerDayActivity.this, 8);
            }
        });
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
    protected boolean transparentStatusBar() {
        return super.transparentStatusBar();
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
    public void getRecommendSuccess(DayRecommendEntity entity) {
        adapter = new RecommendSongsPerDayAdapter(entity.getData().getDailySongs(), this);
        mViewBind.recyclerView.setAdapter(adapter);
        View header = LayoutInflater.from(this).inflate(R.layout.activity_recommend_list_header, null, true);
        adapter.addHeaderView(header);
    }

    @Override
    public void getRecommendFailed() {

    }
}