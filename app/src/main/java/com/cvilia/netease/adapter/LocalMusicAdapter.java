package com.cvilia.netease.adapter;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cvilia.netease.R;
import com.cvilia.netease.sqlmodel.LocalMusic;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-03-06-22:26
 * describe:
 */
public class LocalMusicAdapter extends BaseQuickAdapter<LocalMusic, BaseViewHolder> {

    public LocalMusicAdapter(@Nullable List<LocalMusic> data) {
        super(R.layout.item_local_music, data);
    }


    @Override
    protected void convert(@NotNull BaseViewHolder holder, LocalMusic localMusic) {
        holder.setText(R.id.indexTv, holder.getLayoutPosition() + 1 + "");
        setMarquee(holder.itemView.findViewById(R.id.musicName));
        setMarquee(holder.itemView.findViewById(R.id.artistName));
        holder.setText(R.id.musicName, TextUtils.isEmpty(localMusic.getName()) ? "未知" : localMusic.getName())
                .setText(R.id.artistName, TextUtils.isEmpty(localMusic.getArtist()) ? "未知艺术家" : localMusic.getArtist());


    }

    private void setMarquee(TextView textView) {
        if (textView != null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setSelected(true);
            textView.setFocusable(true);
            textView.setFocusableInTouchMode(true);
        }
    }
}
