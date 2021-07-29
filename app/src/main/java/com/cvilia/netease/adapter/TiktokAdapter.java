package com.cvilia.netease.adapter;

import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cvilia.netease.R;
import com.cvilia.netease.bean.TiktokBean;
import com.cvilia.netease.bean.TiktokBean.VideoDatasBean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * author: v_lizhenyu
 * email: v_lizhenyu@tal.com
 * date: 2021-07-28-15:31
 * describe：描述
 */
public class TiktokAdapter extends BaseQuickAdapter<VideoDatasBean, TiktokAdapter.TiktokViewHolder> {
    public TiktokAdapter(@Nullable List<VideoDatasBean> data) {
        super(R.layout.tiktok_item_layout, data);
    }

    @Override
    protected void convert(@NotNull TiktokViewHolder tiktokViewHolder, VideoDatasBean videoDatasBean) {
    }

    static class TiktokViewHolder extends BaseViewHolder {

        ConstraintLayout leftConstraint;
        ConstraintLayout rightConstraint;

        public TiktokViewHolder(@NotNull View view) {
            super(view);
            leftConstraint =view.findViewById(R.id.leftConstraint);
            rightConstraint = view.findViewById(R.id.rightConstraint);
        }
    }
}
