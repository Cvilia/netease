package com.cvilia.netease.mvp.m;

import com.cvilia.netease.databean.User;
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
        void loginSuccess(User user);

        void loginFailed();
    }
}
