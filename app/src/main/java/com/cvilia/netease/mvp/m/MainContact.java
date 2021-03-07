package com.cvilia.netease.mvp.m;

import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class MainContact {

    public interface Presenter extends IPresenter<View>{
        void show();
    }

    public interface View extends IView{
        void loadingSuccess();
        void loadingFailed();
    }
}
