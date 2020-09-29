package com.cvilia.netease.framework;

/**
 * author: lzy
 * date: 2020/9/29
 * describe：描述
 */
public interface IPresenter<T extends IView> {

    void attachView(T view);

    void detachView();

}
