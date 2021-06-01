package com.cvilia.netease.adapter;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cvilia.netease.R;
import com.cvilia.netease.entity.DayRecommendEntity.DataBean.DailySongsBean;
import com.cvilia.netease.utils.DimenUtil;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-04-07-23:59
 * describe:
 */
public class RecommendSongsPerDayAdapter extends BaseQuickAdapter<DailySongsBean, BaseViewHolder> {

    private RequestOptions options;
    private Activity activity;
    private WeakReference<Activity> weak;

    public RecommendSongsPerDayAdapter(@Nullable List<DailySongsBean> data, Context context) {
        super(R.layout.recommend_songs_item_layout, data);
        weak = new WeakReference<>((Activity) context);
        activity = weak.get();
        options = RequestOptions.bitmapTransform(new MultiTransformation<>(new CenterCrop(), new RoundedCorners(DimenUtil.dp2px(activity, 5))));
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, DailySongsBean bean) {
        holder.setText(R.id.songName, bean.getName());
        List<DailySongsBean.ArBean> ars = bean.getAr();
        String singer = ars.get(0).getName();
        for (int i = 0; i < ars.size(); i++) {
            if (i > 0) {
                singer = singer + "/" + ars.get(i).getName();
            }
        }
        singer = singer + "--" + bean.getAl().getName();
        holder.setText(R.id.singerName, singer);
        Glide.with(activity).applyDefaultRequestOptions(options).load(bean.getAl().getPicUrl()).into((ImageView) Objects.requireNonNull(holder.findView(R.id.songImg)));
    }
}
