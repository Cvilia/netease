package com.cvilia.netease.activity.login;

import com.cvilia.netease.bean.User;
import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public class LoginContact {

    interface Presenter extends IPresenter<View> {
        void loginByEmail();
    }

    interface View extends IView {
        void loginSuccess(User user);

        void loginFailed();
    }
}
