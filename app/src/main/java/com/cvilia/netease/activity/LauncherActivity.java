package com.cvilia.netease.activity;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.cvilia.netease.NeteaseApplication;
import com.cvilia.netease.R;
import com.cvilia.netease.component.PermissionDialog;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.ActivityLauncherBinding;
import com.cvilia.netease.listener.IDialogClickListener;
import com.cvilia.netease.utils.RxPermissionUtils;
import com.tbruyelle.rxpermissions3.Permission;

import me.jessyan.autosize.internal.CustomAdapt;

public class LauncherActivity extends AppCompatActivity implements CustomAdapt, View.OnClickListener {

    private static final String TAG = LauncherActivity.class.getSimpleName();
    private ActivityLauncherBinding mViewBind;
    private static final String[] PERMISSIONS = {Manifest.permission.WRITE_EXTERNAL_STORAGE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
    }

    private void setContentView() {
        mViewBind = ActivityLauncherBinding.inflate(getLayoutInflater());
        setContentView(mViewBind.getRoot());
        ARouter.getInstance().inject(this);
        privacySpannable();
        mViewBind.loginByPhoneTv.setOnClickListener(this);
        mViewBind.loginByEmailTv.setOnClickListener(this);
        showPermissionDialog();

    }

    private void privacySpannable() {

        String text = getResources().getString(R.string.privacy_and_agreement);
        SpannableString spannableString = new SpannableString(text);
        int agreeStart = text.indexOf("《用户协议》");
        int agreeEnd = agreeStart + 6;
        MyClickSpan agreeSpan = new MyClickSpan(1);

        int privacyStart = text.indexOf("《隐私政策》");
        int privacyEnd = privacyStart + 6;
        MyClickSpan privacySpan = new MyClickSpan(2);

        int childStart = text.indexOf("《儿童隐私政策》");
        int childEnd = childStart + 8;
        MyClickSpan childSpan = new MyClickSpan(3);

        spannableString.setSpan(agreeSpan, agreeStart, agreeEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), agreeStart, agreeEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        spannableString.setSpan(privacySpan, privacyStart, privacyEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), privacyStart, privacyEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        spannableString.setSpan(childSpan, childStart, childEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), childStart, childEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

    }

    /**
     * 弹出权限说明dialog
     */
    private void showPermissionDialog() {
        if (!RxPermissionUtils.checkPermissions(this, PERMISSIONS)) {
            PermissionDialog dialog = new PermissionDialog(this, null, new IDialogClickListener() {
                @Override
                public void onClickRight() {
                    requestPermission();
                }

                @Override
                public void onClickLeft() {

                }
            });
            dialog.show();
        }
    }

    /**
     * 开始申请权限
     */
    private void requestPermission() {

        RxPermissionUtils.requestPermissions(this, PERMISSIONS, new RxPermissionUtils.OnPermissionCallBack() {
            @Override
            public void onPermissionsGranted() {

            }

            @Override
            public void onAtLeastOneReject(Permission permission) {

            }

            @Override
            public void onAllRejectAndDoNotAskAgain(Permission permission) {

            }
        });

    }

    /**
     * 开始进入主程序
     */
    private void enterMainPage() {
//        //todo 检测是否有用户token，是否已经登录，而不是检测是否是第一次打开应用
//        Observable.timer(3, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(aLong -> {
//            boolean isFirstStart = MMKVUtil.getBool(Constants.FIRST_START, true);
//            ARouter.getInstance().build(isFirstStart ? PageUrlConfig.PERMISSION_EXPLAIN_PAGE : PageUrlConfig.MAIN_PAGE).navigation(this, new NavCallback() {
//                @Override
//                public void onArrival(Postcard postcard) {
//                    finish();
//                }
//            });
//        });
    }

    @Override
    public boolean isBaseOnWidth() {
        return true;
    }

    @Override
    public float getSizeInDp() {
        return 360;
    }

    @Override
    public void onClick(View v) {
        if (!mViewBind.checkBox.isChecked()) {
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.shake);
            mViewBind.privacyLl.startAnimation(animation);
        } else {
            int loginType = 0;
            if (v.getId() == R.id.loginByPhoneTv) {
                loginType = 1;
            }
            if (v.getId() == R.id.loginByEmailTv) {
                loginType = 2;
            }
            ARouter.getInstance().build(PageUrlConfig.LOGIN_PAGE).withInt("loginType", loginType).navigation();
        }
    }

    private class MyClickSpan extends ClickableSpan {
        //1 = 用户协议  2 = 隐私政策 3 = 儿童隐私协议
        private int tag;

        public MyClickSpan(int tag) {
            this.tag = tag;
        }

        @Override
        public void onClick(@NonNull View widget) {
            if (tag == 1) {
                Toast.makeText(NeteaseApplication.app, "《用户协议》", Toast.LENGTH_SHORT).show();
            } else if (tag == 2) {
                Toast.makeText(NeteaseApplication.app, "《隐私政策》", Toast.LENGTH_SHORT).show();
            } else if (tag == 3) {
                Toast.makeText(NeteaseApplication.app, "《儿童隐私政策》", Toast.LENGTH_SHORT).show();
            }
        }
    }
}