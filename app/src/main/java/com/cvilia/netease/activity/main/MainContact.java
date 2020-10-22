package com.cvilia.netease.activity.main;

import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class MainContact {

    interface Presenter extends IPresenter<View>{
        void show();
    }

    interface View extends IView{
        void loadingSuccess();
        void loadingFailed();
    }
}
