package com.cvilia.netease.component;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

import com.cvilia.netease.R;
import com.cvilia.netease.databinding.PermissionDialogBinding;
import com.cvilia.netease.listener.IDialogClickListener;
import com.cvilia.netease.utils.DimenUtil;

/**
 * author: lzy
 * date: 2020/10/9
 * describe：自定义权限说明Dialog
 */
public class PermissionDialog extends Dialog implements View.OnClickListener {

    private Context context;
    private PermissionDialogBinding mViewBind;
    private IDialogClickListener listener;
    private String mContent;


    public PermissionDialog(@NonNull Context context, String content, IDialogClickListener listener) {
        super(context, R.style.PermissionDialog);
        mContent = content;
        this.context = context;
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBind = PermissionDialogBinding.inflate(getLayoutInflater());
        setContentView(mViewBind.getRoot());
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(Gravity.CENTER);
            WindowManager.LayoutParams params = window.getAttributes();
            params.width = DimenUtil.dp2px(context,280);
            params.height = WindowManager.LayoutParams.WRAP_CONTENT;
            window.setAttributes(params);
        }
        mViewBind.rejectTv.setOnClickListener(this);
        mViewBind.authorizationTv.setOnClickListener(this);
        if (!TextUtils.isEmpty(mContent)) {
            mViewBind.contentTv.setText(mContent);
        }
    }


    @Override
    public void onClick(View view) {
        dismiss();
        if (view.getId() == R.id.rejectTv) {
            listener.onClickLeft();
        } else {
            listener.onClickRight();
        }
    }
}
