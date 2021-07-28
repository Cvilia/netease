package com.cvilia.netease.component;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

import com.cvilia.netease.databinding.ProgressDialogBinding;
import com.cvilia.netease.utils.DimenUtil;

/**
 * author: lzy
 * date: 2020/10/20
 * describe：描述
 */
public class ProgressDialog extends Dialog {

    private final Context context;

    public ProgressDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProgressDialogBinding mViewBind = ProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(mViewBind.getRoot());
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(Gravity.CENTER);
            WindowManager.LayoutParams params = window.getAttributes();
            params.width = DimenUtil.dp2px(context, 240);
            params.height = DimenUtil.dp2px(context, 130);
            window.setAttributes(params);
        }
    }
}
