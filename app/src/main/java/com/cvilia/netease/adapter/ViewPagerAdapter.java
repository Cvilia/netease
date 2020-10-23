package com.cvilia.netease.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/22
 * describe：首页ViewPager  Adapter
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments;

    public ViewPagerAdapter(List<Fragment> fragments,  @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.mFragments = fragments;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return mTitles.get(position);
//    }
}
