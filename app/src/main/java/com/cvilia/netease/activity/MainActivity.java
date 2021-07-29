package com.cvilia.netease.activity;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cvilia.netease.adapter.MainPagerAdapter;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.ActivityMainBinding;
import com.cvilia.netease.framework.BaseActivity;
import com.cvilia.netease.mvp.c.MainContact;
import com.cvilia.netease.mvp.p.MainPresenter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * 首页
 */
@Route(path = PageUrlConfig.MAIN_PAGE)
public class MainActivity extends BaseActivity<MainPresenter> implements MainContact.View,
        TabLayout.OnTabSelectedListener, View.OnClickListener {

    private ActivityMainBinding mBinding;
    private static final String[] tabTitles = {"发现", "云村", "我的"};


    @Override
    protected void onViewCreated() {
        View child = mBinding.viewPager.getChildAt(0);
        if(child instanceof RecyclerView){
            child.setOverScrollMode(View.OVER_SCROLL_NEVER);
        }
    }

    @Override
    protected View getRootView() {
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }


    @Override
    protected void initWidgetEvent() {
    }

    @Override
    protected void initData() {
        mBinding.viewPager.setCurrentItem(0);
        mBinding.viewPager.setAdapter(new MainPagerAdapter(this));
        mBinding.tabLayout.addOnTabSelectedListener(this);
        new TabLayoutMediator(mBinding.tabLayout, mBinding.viewPager, true, (tab, position) -> tab.setText(tabTitles[position])).attach();
    }

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    public void loadingSuccess() {

    }

    @Override
    public void loadingFailed() {

    }

    @Override
    public void loading() {

    }

    @Override
    public void dismissLoading() {

    }

    /*******************************************OnTabSelectedListener********************************/

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        //todo 重复点击tab理论上是刷新页面，使用eventbus发送点击刷新事件
    }

    /*******************************************OnClickListener********************************/

    @Override
    public void onClick(View v) {

    }
}