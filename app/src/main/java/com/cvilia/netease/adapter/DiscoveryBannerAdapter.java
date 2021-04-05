package com.cvilia.netease.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cvilia.netease.entity.Banner;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

/**
 * author: lzy
 * email: v_lizhenyu@tal.com
 * date: 2021-04-02-6:39 PM
 * describe：描述
 */
public class DiscoveryBannerAdapter extends BannerAdapter<Banner.BannersBean, DiscoveryBannerAdapter.BannerHolder> {


    public DiscoveryBannerAdapter(List<Banner.BannersBean> datas) {
        super(datas);
    }

    @Override
    public BannerHolder onCreateHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindView(BannerHolder holder, Banner.BannersBean data, int position, int size) {

    }

    static class BannerHolder extends RecyclerView.ViewHolder {
        public BannerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}


