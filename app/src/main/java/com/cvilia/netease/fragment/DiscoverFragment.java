package com.cvilia.netease.fragment;

import android.view.View;

import com.cvilia.netease.databinding.FragmentDiscoverLayoutBinding;
import com.cvilia.netease.entity.Banner;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.mvp.c.DiscoverContact;
import com.cvilia.netease.mvp.p.DiscoveryPresenter;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class DiscoverFragment extends BaseFragment<DiscoveryPresenter> implements DiscoverContact.View {

    private static final String TAG = DiscoverFragment.class.getSimpleName();

    private FragmentDiscoverLayoutBinding mViewBind;

    @Override
    protected void onViewCreated() {
        mPresenter.getBanners();
    }

    @Override
    protected void initWidgetEvent() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected View getContentView() {
        mViewBind = FragmentDiscoverLayoutBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected DiscoveryPresenter getPresenter() {
        return new DiscoveryPresenter();
    }


    @Override
    public void getBannerSuccess(List<Banner.BannersBean> bean) {
//        for (Banner banner : banners) {
//            Log.d(TAG, banner.getImageUrl());
//        }
    }

    @Override
    public void getBannerFail() {

    }

    @Override
    public void loadingSuccess() {

    }

    @Override
    public void loadingFailed() {

    }
}
