package com.cvilia.netease.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cvilia.netease.R;
import com.cvilia.netease.adapter.ViewPagerAdapter;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.mvp.c.MainContact;
import com.cvilia.netease.databinding.ActivityMainBinding;
import com.cvilia.netease.fragment.CloudFragment;
import com.cvilia.netease.fragment.DiscoverFragment;
import com.cvilia.netease.fragment.MyFragment;
import com.cvilia.netease.framework.BaseActivity;
import com.cvilia.netease.mvp.p.MainPresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 首页
 */
@Route(path = PageUrlConfig.MAIN_PAGE)
public class MainActivity extends BaseActivity<MainPresenter> implements MainContact.View, ViewPager.OnPageChangeListener,
        TabLayout.OnTabSelectedListener, View.OnClickListener {

    private ActivityMainBinding mBinding;
    private static final String[] tabTitles = {"发现", "云村", "我的"};
    private static final int[] tabImgs = {R.drawable.main_tab_img_discovery, R.drawable.main_tab_img_cloud, R.drawable.main_tab_img_my};


    @Override
    protected void onViewCreated() {

    }

    @Override
    protected View getRootView() {
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }


    @Override
    protected void initWidgetEvent() {
        mBinding.actionbar.actionLeft.setOnClickListener(v -> mBinding.rootDrawer.openDrawer(GravityCompat.START));
    }

    @Override
    protected void initData() {
        mBinding.viewPager.addOnPageChangeListener(this);
        mBinding.viewPager.setCurrentItem(0);
        List<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new DiscoverFragment());
        mFragments.add(new CloudFragment());
        mFragments.add(new MyFragment());
        ViewPagerAdapter mAdapter = new ViewPagerAdapter(mFragments, getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mBinding.viewPager.setAdapter(mAdapter);
        mBinding.viewPager.setOffscreenPageLimit(mFragments.size());
        mBinding.tabLayout.setupWithViewPager(mBinding.viewPager);
        for (int i = 0; i < mFragments.size(); i++) {
            TabLayout.Tab tab = mBinding.tabLayout.getTabAt(i);
            if (tab != null) {
                tab.setCustomView(getTabView(i));
            }
        }
        mBinding.tabLayout.addOnTabSelectedListener(this);
    }

    private View getTabView(int index) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab_item, null);
        TextView title = view.findViewById(R.id.tabTitle);
        title.setText(tabTitles[index]);
        ImageView img = view.findViewById(R.id.tabImg);
        img.setImageResource(tabImgs[index]);
        return view;
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

    /*******************************************OnPageChangeListener********************************/
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Objects.requireNonNull(mBinding.tabLayout.getTabAt(position)).select();
    }

    @Override
    public void onPageScrollStateChanged(int state) {

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