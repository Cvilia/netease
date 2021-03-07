package com.cvilia.netease.mvp.m;

import com.cvilia.netease.framework.IPresenter;
import com.cvilia.netease.framework.IView;
import com.cvilia.netease.sqlmodel.LocalMusic;

import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 20:54
 * describe: {@link com.cvilia.netease.activity.LocalMusicActivity}
 */
public class LocalMusicContact {

    public interface View extends IView {
        void scanLocalMusicSuccess(List<LocalMusic> musics);

        void scanLocalFail();
    }

    public interface Presenter extends IPresenter<View> {
        void scanLocalMusic();
    }
}
