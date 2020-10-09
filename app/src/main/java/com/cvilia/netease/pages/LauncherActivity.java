package com.cvilia.netease.pages;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.cvilia.netease.R;
import com.cvilia.netease.component.PermissionDialog;
import com.cvilia.netease.config.Constants;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.ActivityLauncherBinding;
import com.cvilia.netease.listener.IDialogClickListener;
import com.cvilia.netease.utils.MMKVUtil;
import com.cvilia.netease.utils.RxPermissionUtils;
import com.tbruyelle.rxpermissions3.Permission;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import me.jessyan.autosize.internal.CustomAdapt;

public class LauncherActivity extends AppCompatActivity implements CustomAdapt , View.OnClickListener {

    private static final String TAG = LauncherActivity.class.getSimpleName();
    private ActivityLauncherBinding mViewBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
    }

    private void setContentView() {
        mViewBind = ActivityLauncherBinding.inflate(getLayoutInflater());
        setContentView(mViewBind.getRoot());
        mViewBind.loginByPhoneTv.setOnClickListener(this);
        showPermissionDialog();

    }

    /**
     * 弹出权限说明dialog
     */
    private void showPermissionDialog() {

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

    /**
     * 开始申请权限
     */
    private void requestPermission() {

        RxPermissionUtils.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, new RxPermissionUtils.OnPermissionCallBack() {
            @Override
            public void onPermissionsGranted() {
                enterMainPage();
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
        if (!mViewBind.privacyLl.isSelected()){
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.shake);
            mViewBind.privacyLl.startAnimation(animation);
        }
    }
}