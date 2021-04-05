package com.cvilia.netease.mvp.c;

import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

import java.util.List;

import static com.cvilia.netease.entity.BannerEntity.BannersBean;

/**
 * author: lzy
 * email: v_lizhenyu@tal.com
 * date: 2021-04-02-4:56 PM
 * describe：描述
 */
public class DiscoverContact {

    public interface Presenter extends IPresenter<View> {
        void getBanners();
    }

    public interface View extends IView {
        void getBannerSuccess(List<BannersBean> bean);

        void getBannerFail();

        void loadingSuccess();

        void loadingFailed();
    }

}
