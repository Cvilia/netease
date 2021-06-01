package com.cvilia.netease.utils;

import android.media.AudioManager;
import android.media.MediaPlayer;

import com.cvilia.netease.listener.OnMediaPreparedListener;
import com.cvilia.netease.listener.OnPlayCompleteListener;
import com.cvilia.netease.listener.OnPlayerErrorListener;
import com.cvilia.netease.sqlmodel.LocalMusic;

import java.io.IOException;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-03-07-11:33
 * describe:
 */
public class SingleMediaPLayer extends MediaPlayer {

    private MediaPlayer player;
    private OnMediaPreparedListener preparedListener;
    private OnPlayCompleteListener playCompleteListener;
    private OnPlayerErrorListener playerErrorListener;

    public void setPreparedListener(OnMediaPreparedListener preparedListener) {
        this.preparedListener = preparedListener;
    }

    public void setPlayCompleteListener(OnPlayCompleteListener playCompleteListener) {
        this.playCompleteListener = playCompleteListener;
    }

    public void setPlayerErrorListener(OnPlayerErrorListener playerErrorListener) {
        this.playerErrorListener = playerErrorListener;
    }

    private static class SinglePlayer {
        private static SingleMediaPLayer instance = new SingleMediaPLayer();
    }

    private SingleMediaPLayer() {
        player = new MediaPlayer();
        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        player.setOnPreparedListener(mp -> {
            try {
                mp.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (preparedListener != null) preparedListener.onPrepared(mp);
        });
        player.setOnCompletionListener(mp -> {
            if (playCompleteListener != null) playCompleteListener.onComplete(mp);
        });

        player.setOnErrorListener((mp, what, extra) -> {
            if (playerErrorListener != null) {
                return playerErrorListener.onError(mp, what, extra);
            } else {
                return false;
            }
        });
    }

    public static SingleMediaPLayer getInstance() {
        return SinglePlayer.instance;
    }

    public void setData(String path) {
        player.reset();
        try {
            player.setDataSource(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        player.prepareAsync();
    }

    public void start() {
        if (player.isPlaying()) {
            return;
        }
        player.start();
    }

    public void stop() {
        if (player.isPlaying()) {
            player.stop();
        }
    }

    public void pause() {
        if (!player.isPlaying()) {
            return;
        }
        player.pause();
    }

    public void seekTo(int progress) {
        player.seekTo(progress);
    }

    public int getDuration() {
        return player.getDuration();
    }

    public int getCurrentPosition() {
        return player.getCurrentPosition();
    }

    public boolean isPlaying() {
        if (player != null && player.isPlaying()) {
            return true;
        } else {
            return false;
        }
    }

}
