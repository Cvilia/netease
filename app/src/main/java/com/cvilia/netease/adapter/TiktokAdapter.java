package com.cvilia.netease.adapter;

import android.app.Activity;
import android.net.Uri;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cvilia.netease.R;
import com.cvilia.netease.bean.TiktokBean;
import com.cvilia.netease.bean.TiktokBean.VideoDatasBean;
import com.cvilia.netease.player.SingleExoplayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * author: v_lizhenyu
 * email: v_lizhenyu@tal.com
 * date: 2021-07-28-15:31
 * describe：描述
 */
public class TiktokAdapter extends BaseQuickAdapter<VideoDatasBean, TiktokAdapter.TiktokViewHolder> {
    private WeakReference<Activity> weak;

    public TiktokAdapter(@Nullable List<VideoDatasBean> data, Activity activity) {
        super(R.layout.tiktok_item_layout, data);
        weak = new WeakReference<>(activity);
    }

    @Override
    protected void convert(@NotNull TiktokViewHolder holder, VideoDatasBean bean) {
        SimpleExoPlayer player = new SimpleExoPlayer.Builder(weak.get()).build();
        holder.playerView.setPlayer(player);
        MediaItem mediaItem = MediaItem.fromUri(Uri.parse(bean.getData().getUrlInfo().getUrl()));
        player.addMediaItem(mediaItem);
        player.prepare();
        player.play();
    }

    static class TiktokViewHolder extends BaseViewHolder {

        ConstraintLayout leftConstraint;
        ConstraintLayout rightConstraint;
        StyledPlayerView playerView;

        public TiktokViewHolder(@NotNull View view) {
            super(view);
            leftConstraint = view.findViewById(R.id.leftConstraint);
            rightConstraint = view.findViewById(R.id.rightConstraint);
            playerView = view.findViewById(R.id.exoPlayerView);
        }
    }
}
