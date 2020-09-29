package com.cvilia.netease.framework;

/**
 * author: lzy
 * date: 2020/9/29
 * describe：描述
 */
public abstract class BasePresenter<T extends IView> implements IPresenter<T> {

    protected T mView;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }
}
