package com.cvilia.netease.framework;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jaeger.library.StatusBarUtil;

import org.greenrobot.eventbus.EventBus;

import me.jessyan.autosize.internal.CustomAdapt;

/**
 * author: lzy
 * date: 2020/9/29
 * describe：描述
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements CustomAdapt, IView {

    protected T mPresenter;
    protected Activity mContext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);

//        int layoutId = getLayoutId();
//        if (layoutId != 0) {
//            setContentView(layoutId);
//        }
        mPresenter = getPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        mContext = this;
        if (registerEventBus() && !EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
//        findViewById();
//        initWidgetEvent();
        onViewCreated();
        initData();
    }

    public Intent getIntent() {
        return getIntent();
    }

//    protected abstract void findViewById();

//    protected abstract void initWidgetEvent();

    protected void onViewCreated() {
        StatusBarUtil.setTransparent(mContext);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            StatusBarUtil.setDarkMode(this);
        }
    }

    protected abstract void initData();

//    protected abstract int getLayoutId();

    protected abstract T getPresenter();


    private boolean registerEventBus() {
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public boolean isBaseOnWidth() {
        return true;
    }

    @Override
    public float getSizeInDp() {
        return 360;
    }
}
