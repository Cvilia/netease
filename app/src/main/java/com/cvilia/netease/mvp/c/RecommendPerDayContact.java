package com.cvilia.netease.mvp.c;

import com.cvilia.netease.bean.DayRecommendEntity;
import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-04-05-21:33
 * describe: RecommendPerDayActivity 每日推荐歌曲
 */
public class RecommendPerDayContact {
    public interface Presenter extends IPresenter<View> {
        void getRecommendSongs();
    }

    public interface View extends IView {
        void getRecommendSuccess(DayRecommendEntity songs);

        void getRecommendFailed();
    }
}
