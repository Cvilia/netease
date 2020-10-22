package com.cvilia.netease.fragment;

import android.util.Log;
import android.view.View;

import com.cvilia.netease.databinding.FragmentVideoFragmentBinding;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.framework.BasePresenter;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class VideoFragment extends BaseFragment {

    private FragmentVideoFragmentBinding mViewBind;

    @Override
    protected void onViewCreated() {

        Log.e("fragment","视频");
    }

    @Override
    protected View getContentView() {
        mViewBind = FragmentVideoFragmentBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
