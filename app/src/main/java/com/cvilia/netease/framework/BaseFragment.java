package com.cvilia.netease.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

import org.greenrobot.eventbus.EventBus;

import me.jessyan.autosize.internal.CustomAdapt;

/**
 * author: lzy
 * date: 2020/10/20
 * describe：描述
 */
public abstract class BaseFragment<T extends BasePresenter> extends Fragment implements CustomAdapt, IView {

    private T mPresenter;
    protected Context mContext;
    protected Activity mActivity;
    protected View mView;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = getContentView();
        if (mView != null) {
            ARouter.getInstance().inject(this);
            mPresenter = getPresenter();
            if (mPresenter != null) {
                mPresenter.attachView(this);
            }
            if (registerEventBus() && !EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().register(this);
            }
        }
        ViewGroup parent = (ViewGroup) mView.getParent();
        if (parent != null) {
            parent.removeView(mView);
        }

        onViewCreated();
        return mView;
    }

    protected abstract void onViewCreated();

    protected abstract View getContentView();

    protected abstract T getPresenter();

    private boolean registerEventBus() {
        return false;
    }

    @Override
    public void loading() {

    }

    @Override
    public void dismissLoading() {

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
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        mView = null;
    }

    @Override
    public void onDetach() {

        if (registerEventBus() && !EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }

        super.onDetach();
    }
}
