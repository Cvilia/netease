package com.cvilia.netease.framework;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cvilia.netease.R;
import com.cvilia.netease.manager.ActivityManager;
import com.jaeger.library.StatusBarUtil;

import org.greenrobot.eventbus.EventBus;



/**
 * author: lzy
 * date: 2020/9/29
 * describe：描述
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements IView {

    protected T mPresenter;
    protected Activity mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getRootView());
        if (transparentStatusBar()) {
            StatusBarUtil.setTranslucent(this);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        ARouter.getInstance().inject(this);
        ActivityManager.getInstance().addActivity(this);
        mPresenter = getPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        mContext = this;
        if (registerEventBus() && !EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        onViewCreated();
        initWidgetEvent();
        initData();
    }


    protected boolean transparentStatusBar() {
        return true;
    }

    /**
     * 隐藏底部导航栏
     */
    private void hideNavigator() {

        View decorView = getWindow().getDecorView();
        int options = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
        decorView.setSystemUiVisibility(options);
        getWindow().setStatusBarColor(getColor(R.color.hint_c1c1c1));
        getWindow().setNavigationBarColor(Color.TRANSPARENT);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
//        hideNavigator();
    }

    protected abstract void onViewCreated();

    protected abstract View getRootView();

    protected abstract void initWidgetEvent();

    protected abstract void initData();

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
        ActivityManager.getInstance().removeActivity(this);
    }
}
