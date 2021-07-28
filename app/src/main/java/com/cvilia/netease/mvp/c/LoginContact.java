package com.cvilia.netease.mvp.c;

import com.cvilia.netease.bean.login.UserLoginBean;
import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public class LoginContact {

    public interface Presenter extends IPresenter<View> {
        void loginByEmail(String email, String password);

        void loginByPhone(String phone, String password);
    }

    public interface View extends IView {
        void loginSuccess(UserLoginBean user);

        void loginFailed();
    }
}
