package com.cvilia.netease;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cvilia.netease.bean.User;
import com.cvilia.netease.objectbox.ObjectBox;
import com.tencent.mmkv.MMKV;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public class NeteaseApplication extends Application {

    public static NeteaseApplication app;
    public User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        init();
    }

    private void init() {
        ARouter.init(this);
        MMKV.initialize(this);
        ObjectBox.init(this);
    }

}
