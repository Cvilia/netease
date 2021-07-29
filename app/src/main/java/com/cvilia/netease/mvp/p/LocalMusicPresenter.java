package com.cvilia.netease.mvp.p;

import android.app.Activity;

import com.cvilia.netease.framework.BasePresenter;
import com.cvilia.netease.mvp.c.LocalMusicContact;
import com.cvilia.netease.sqlmodel.LocalMusic;
import com.cvilia.netease.utils.ScanMusicUtil;

import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 20:54
 * describe: {@link com.cvilia.netease.activity.LocalMusicActivity}
 */
public class LocalMusicPresenter extends BasePresenter<LocalMusicContact.View> implements LocalMusicContact.Presenter {
    @Override
    public void scanLocalMusic() {
        List<LocalMusic> musics = ScanMusicUtil.getMusicData((Activity) mView);
        mView.scanLocalMusicSuccess(musics);
    }
}
