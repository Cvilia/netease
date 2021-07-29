package com.cvilia.netease.mvp.c;

import com.cvilia.netease.bean.TiktokBean;
import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

import java.util.List;

import static com.cvilia.netease.bean.BannerEntity.BannersBean;

/**
 * author: lzy
 * email: v_lizhenyu@tal.com
 * date: 2021-04-02-4:56 PM
 * describe：描述
 */
public class TiktokContact {

    public interface Presenter extends IPresenter<View> {
        void getRecommendVideo(int offset);
    }

    public interface View extends IView {
        void showSuccess(TiktokBean bean);
        void showFailed();
    }

}
