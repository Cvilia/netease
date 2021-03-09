package com.cvilia.netease.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.NonNull;

import com.cvilia.netease.listener.OnMediaPreparedListener;
import com.cvilia.netease.listener.OnPlayCompleteListener;
import com.cvilia.netease.listener.OnPlayerErrorListener;
import com.cvilia.netease.utils.SingleMediaPLayer;

public class MediaPLayerService extends Service implements OnPlayerErrorListener, OnPlayCompleteListener, OnMediaPreparedListener {
    private SingleMediaPLayer instance;
    public MediaPLayerService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = SingleMediaPLayer.getInstance();
        instance.setPlayCompleteListener(this);
        instance.setPlayerErrorListener(this);
        instance.setPreparedListener(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new PlayerBinder();
    }

    @Override
    public void onPrepared(MediaPlayer mp) {

    }

    @Override
    public void onComplete(MediaPlayer mp) {

    }

    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {
        return false;
    }

    public class PlayerBinder extends Binder {
        public void setData(@NonNull String path) {
            instance.setData(path);
        }



        public int getDuration() {
            return instance.getDuration();
        }



    }
}