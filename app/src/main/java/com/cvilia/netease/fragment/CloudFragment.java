package com.cvilia.netease.fragment;

import android.view.View;

import com.cvilia.netease.databinding.FragmentCloudLayoutBinding;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.framework.BasePresenter;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class CloudFragment extends BaseFragment {

    private FragmentCloudLayoutBinding mViewBind;

    @Override
    protected void onViewCreated() {

    }

    @Override
    protected View getContentView() {
        mViewBind = FragmentCloudLayoutBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
