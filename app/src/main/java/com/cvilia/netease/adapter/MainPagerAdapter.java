package com.cvilia.netease.adapter;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.cvilia.netease.activity.MainActivity;
import com.cvilia.netease.fragment.CloudFragment;
import com.cvilia.netease.fragment.DiscoverFragment;
import com.cvilia.netease.fragment.MyFragment;

import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-07-27-2:05
 * describe:
 */
public class MainPagerAdapter extends FragmentStateAdapter {
    private static final int PAGE_COUNT = 3;
    private WeakReference<Activity> weak;

    public MainPagerAdapter(@NonNull @NotNull MainActivity activity) {
        super(activity);
        weak = new WeakReference<>(activity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new DiscoverFragment();
            case 1:
                return new CloudFragment();
            case 2:
            default:
                return new MyFragment();
        }
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }
}
