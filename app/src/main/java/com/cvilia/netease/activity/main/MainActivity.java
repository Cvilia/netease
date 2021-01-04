package com.cvilia.netease.activity.main;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cvilia.netease.R;
import com.cvilia.netease.adapter.ViewPagerAdapter;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.ActivityMainBinding;
import com.cvilia.netease.fragment.CloudFragment;
import com.cvilia.netease.fragment.DiscoverFragment;
import com.cvilia.netease.fragment.MyFragment;
import com.cvilia.netease.fragment.VideoFragment;
import com.cvilia.netease.framework.BaseActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 首页
 */
@Route(path = PageUrlConfig.MAIN_PAGE)
public class MainActivity extends BaseActivity<MainPresenter> implements MainContact.View, ViewPager.OnPageChangeListener,
        TabLayout.OnTabSelectedListener {

    private ActivityMainBinding mViewBind;
    private List<Fragment> mFragments;
    private ViewPagerAdapter mAdapter;
    private static final String[] tabs = {"我的", "发现", "云村", "视频"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setContentView() {
        mViewBind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mViewBind.getRoot());
    }

    @Override
    protected void initWidgetEvent() {

    }

    @Override
    protected void initData() {
        mViewBind.viewPager.addOnPageChangeListener(this);
        mViewBind.viewPager.setCurrentItem(0);
        mFragments = new ArrayList<>();
        mFragments.add(new MyFragment());
        mFragments.add(new DiscoverFragment());
        mFragments.add(new CloudFragment());
        mFragments.add(new VideoFragment());
        mAdapter = new ViewPagerAdapter(mFragments, getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewBind.viewPager.setAdapter(mAdapter);
        mViewBind.tabLayout.setupWithViewPager(mViewBind.viewPager);
        for (int i = 0; i < 4; i++) {
            TabLayout.Tab tab = mViewBind.tabLayout.getTabAt(i);
            tab.setCustomView(R.layout.tab_item);
            if (i == 0) {
                tab.getCustomView().findViewById(R.id.tabTv).setSelected(true);
            }
            TextView textView = tab.getCustomView().findViewById(R.id.tabTv);
            textView.setText(tabs[i]);
            ImageView itemIv = tab.getCustomView().findViewById(R.id.tabItemIv);
            if (i == 0) {
                itemIv.setImageResource(R.drawable.icon_my);
            } else if (i == 1) {
                itemIv.setImageResource(R.drawable.icon_discover);
            } else if (i == 2) {
                itemIv.setImageResource(R.drawable.icon_cloud);
            } else if (i == 3) {
                itemIv.setImageResource(R.drawable.icon_video);
            }
        }
        mViewBind.tabLayout.addOnTabSelectedListener(this);
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
        Objects.requireNonNull(mViewBind.tabLayout.getTabAt(position)).select();
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /*******************************************OnTabSelectedListener********************************/

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        TextView textView = Objects.requireNonNull(tab.getCustomView()).findViewById(R.id.tabTv);
        textView.setSelected(true);
        textView.setTextColor(getColor(R.color.app_main));
        textView.getPaint().setFakeBoldText(true);

        ImageView itemIv = Objects.requireNonNull(tab.getCustomView()).findViewById(R.id.tabItemIv);
        itemIv.setColorFilter(getColor(R.color.app_main));
        itemIv.setSelected(true);

        mViewBind.viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        TextView textView = Objects.requireNonNull(tab.getCustomView()).findViewById(R.id.tabTv);
        textView.setSelected(false);
        textView.setTextColor(getColor(R.color.text_323232));
        textView.getPaint().setFakeBoldText(false);

        ImageView itemIv = Objects.requireNonNull(tab.getCustomView()).findViewById(R.id.tabItemIv);
        itemIv.setSelected(false);
        itemIv.setColorFilter(getColor(R.color.text_323232));
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        //todo 重复点击tab理论上是刷新页面，使用eventbus发送点击刷新事件
    }
    /*******************************************OnTabSelectedListener********************************/
}