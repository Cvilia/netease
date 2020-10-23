package com.cvilia.netease.fragment;

import android.util.Log;
import android.view.View;

import com.cvilia.netease.R;
import com.cvilia.netease.databinding.FragmentMyLayoutBinding;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.utils.ToastUtil;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class MyFragment extends BaseFragment<MyPresenter> implements MyContact.View , View.OnClickListener {

    private FragmentMyLayoutBinding mViewBind;

    @Override
    protected void onViewCreated() {
        Log.e("fragment", "我的");
        mViewBind.outlineInfo.setOnClickListener(this);
    }

    @Override
    protected View getContentView() {
        mViewBind = FragmentMyLayoutBinding.inflate(getLayoutInflater());
        return mViewBind.getRoot();
    }

    @Override
    protected MyPresenter getPresenter() {
        return new MyPresenter();
    }

    @Override
    public void requestFriendsSuccess() {

    }

    @Override
    public void requestFriendsFailed() {

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.outlineInfo:
                ToastUtil.showShort("个人主页");
                break;
        }
    }
}
