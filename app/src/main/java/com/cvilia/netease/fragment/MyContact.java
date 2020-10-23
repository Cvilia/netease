package com.cvilia.netease.fragment;

import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

/**
 * author: lzy
 * date: 2020/10/23
 * describe：描述
 */
public class MyContact {
    interface Presenter extends IPresenter<View> {
        void requestFriends();
        void requestBoughtList();
    }

    interface View extends IView{
        void requestFriendsSuccess();
        void requestFriendsFailed();
    }
}
