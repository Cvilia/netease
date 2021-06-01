package com.cvilia.netease.fragment;

import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cvilia.netease.R;
import com.cvilia.netease.config.PageUrlConfig;
import com.cvilia.netease.databinding.FragmentMyLayoutBinding;
import com.cvilia.netease.framework.BaseFragment;
import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.utils.ToastUtil;

/**
 * author: lzy
 * date: 2020/10/21
 * describe：描述
 */
public class MyFragment extends BaseFragment<MyPresenter> implements MyContact.View, View.OnClickListener {

    private FragmentMyLayoutBinding mBinding;

    @Override
    protected void onViewCreated() {
        Log.e("fragment", "我的");
        mBinding.outlineInfo.setOnClickListener(this);
    }

    @Override
    protected void initWidgetEvent() {
        mBinding.localLl.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected View getContentView() {
        mBinding = FragmentMyLayoutBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
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
        if (id == R.id.outlineInfo) {
            ToastUtil.showShort("个人主页");
        } else if (id == R.id.localLl) {
            ARouter.getInstance().build(PageUrlConfig.LOCAL_MUSIC_ACTIVITY).navigation();
        } else if (id == R.id.favoriteLl) {

        } else if (id == R.id.playRecentLl) {
        }
    }
}
