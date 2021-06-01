package com.cvilia.netease.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.cvilia.netease.R;
import com.cvilia.netease.bean.BannerEntity.BannersBean;
import com.cvilia.netease.utils.DimenUtil;
import com.youth.banner.adapter.BannerAdapter;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * author: lzy
 * email: v_lizhenyu@tal.com
 * date: 2021-04-02-6:39 PM
 * describe：描述
 */
public class DiscoveryBannerAdapter extends BannerAdapter<BannersBean, DiscoveryBannerAdapter.BannerHolder> {
    private WeakReference<Activity> weak;
    private Activity activity;
    private RequestOptions options;

    public DiscoveryBannerAdapter(List<BannersBean> banners, Context context) {
        super(banners);
        weak = new WeakReference<Activity>((Activity) context);
        activity = weak.get();
        options = RequestOptions.bitmapTransform(new MultiTransformation(new CenterCrop(),new RoundedCorners(DimenUtil.dp2px(activity, 10))));
    }

    @Override
    public BannerHolder onCreateHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.discovery_banner_item, parent, false);
        return new BannerHolder(view);
    }

    @Override
    public void onBindView(BannerHolder holder, BannersBean data, int position, int size) {
        holder.bannerType.setText(data.getTypeTitle());
        Glide.with(activity).applyDefaultRequestOptions(options).load(data.getImageUrl()).into(holder.bannerImg);
    }

    static class BannerHolder extends RecyclerView.ViewHolder {
        public TextView bannerType;
        public ImageView bannerImg;

        public BannerHolder(@NonNull View itemView) {
            super(itemView);
            bannerType = itemView.findViewById(R.id.bannerType);
            bannerImg = itemView.findViewById(R.id.bannerImg);
        }
    }

}


