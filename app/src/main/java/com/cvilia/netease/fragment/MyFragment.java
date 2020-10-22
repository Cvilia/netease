package com.cvilia.netease.fragment;

import android.view.View;

import com.cvilia.netease.databinding.FragmentMyLayoutBinding;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.framework.BasePresenter;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class MyFragment extends BaseFragment {

    private FragmentMyLayoutBinding mViewBind;

    @Override
    protected void onViewCreated() {

    }

    @Override
    protected View getContentView() {
        mViewBind = FragmentMyLayoutBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
