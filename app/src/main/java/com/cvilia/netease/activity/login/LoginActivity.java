package com.cvilia.netease.activity.login;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.cvilia.netease.R;
import com.cvilia.netease.bean.User;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.framework.BaseActivity;

@Route(path = PageUrlConfig.LOGIN_PAGE)
public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContact.View {

    @Autowired()
    int loginType;//1 = 手机登录 2 = 邮箱登录

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected LoginPresenter getPresenter() {
        return null;
    }

    @Override
    protected void setContentView() {

    }

    @Override
    public void loginSuccess(User user) {

    }

    @Override
    public void loginFailed() {

    }

    @Override
    public void loading() {

    }

    @Override
    public void dismissLoading() {

    }
}