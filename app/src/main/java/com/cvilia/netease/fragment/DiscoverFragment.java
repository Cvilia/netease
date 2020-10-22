package com.cvilia.netease.fragment;

import android.view.View;

import com.cvilia.netease.databinding.FragmentDiscoverLayoutBinding;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.framework.BasePresenter;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class DiscoverFragment extends BaseFragment {

    private FragmentDiscoverLayoutBinding mViewBind;

    @Override
    protected void onViewCreated() {

    }

    @Override
    protected View getContentView() {
        mViewBind = FragmentDiscoverLayoutBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
