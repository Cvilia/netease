package com.cvilia.netease.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.cvilia.netease.adapter.TiktokAdapter;
import com.cvilia.netease.bean.TiktokBean;
import com.cvilia.netease.databinding.FragmentDiscoverLayoutBinding;
import com.cvilia.netease.bean.BannerEntity.BannersBean;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.mvp.c.TiktokContact;
import com.cvilia.netease.mvp.p.TiktokPresenter;

import java.util.ArrayList;
import java.util.List;


/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class TiktokFragment extends BaseFragment<TiktokPresenter> implements TiktokContact.View {

    private FragmentDiscoverLayoutBinding mViewBind;
    private TiktokAdapter mAdapter;
    private int mOffset = 0;

    @Override
    protected void onViewCreated() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(mViewBind.tiktokRecyclerView);
        mViewBind.tiktokRecyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected void initWidgetEvent() {
    }

    @Override
    protected void initData() {
        mPresenter.getRecommendVideo(mOffset);
    }

    @Override
    protected View getContentView() {
        mViewBind = FragmentDiscoverLayoutBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected TiktokPresenter getPresenter() {
        return new TiktokPresenter();
    }


    @Override
    public void showSuccess(TiktokBean bean) {
        if (bean!=null&&bean.getVideoDatas()!=null&&!bean.getVideoDatas().isEmpty()){
            List<TiktokBean.VideoDatasBean> list = new ArrayList<>();
            list.add(bean.getVideoDatas().get(0));
            mAdapter = new TiktokAdapter(list,getActivity());
            mViewBind.tiktokRecyclerView.setAdapter(mAdapter);
        }
    }

    @Override
    public void showFailed() {

    }
}
