package com.cvilia.netease.utils;

import android.media.MediaPlayer;

import com.cvilia.netease.sqlmodel.LocalMusic;

import java.io.IOException;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-03-07-11:33
 * describe:
 */
public class LocalMusicPlay extends MediaPlayer {

    private MediaPlayer player;

    private static class SinglePlayer {
        private static LocalMusicPlay instance = new LocalMusicPlay();
    }

    private LocalMusicPlay() {
        player = new MediaPlayer();
    }

    public static LocalMusicPlay getInstance(LocalMusic music) {
        return SinglePlayer.instance;
    }

    public void setDataSource(String path) {
        try {
            player.setDataSource(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
