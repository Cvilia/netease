package com.cvilia.netease.fragment;

import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cvilia.netease.adapter.DiscoveryBannerAdapter;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.FragmentDiscoverLayoutBinding;
import com.cvilia.netease.bean.BannerEntity.BannersBean;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.mvp.c.DiscoverContact;
import com.cvilia.netease.mvp.p.DiscoveryPresenter;
import com.youth.banner.indicator.CircleIndicator;

import java.util.Calendar;
import java.util.List;


/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class DiscoverFragment extends BaseFragment<DiscoveryPresenter> implements DiscoverContact.View {

//    private static final String TAG = DiscoverFragment.class.getSimpleName();

    private FragmentDiscoverLayoutBinding mViewBind;

    @Override
    protected void onViewCreated() {
        mPresenter.getBanners();
    }

    @Override
    protected void initWidgetEvent() {
        mViewBind.discoverySecondModule.recommendRoot.setOnClickListener(v -> ARouter.getInstance().build(PageUrlConfig.RECOMMEND_PER_DAY).navigation());
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mViewBind.discoverySecondModule.dayNum.setText(String.valueOf(day));
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


    @SuppressWarnings("unchecked")
    @Override
    public void getBannerSuccess(List<BannersBean> banners) {
        mViewBind.bannerView
                .addBannerLifecycleObserver(this)
                .setAdapter(new DiscoveryBannerAdapter(banners, getActivity()))
                .setIndicator(new CircleIndicator(getActivity()));
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
