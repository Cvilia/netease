package com.cvilia.netease.service;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;

import com.cvilia.netease.sqlmodel.LocalMusic;

import java.io.IOException;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class PlayerIntentService extends IntentService {

    private MediaPlayer player;
    private LocalMusic localMusic;
    public static final String ACTION_MUSIC = "com.cvilia.netease.service.action.music";
    public static final String LOCAL_MUSIC = "com.cvilia.netease.service.action.localmusic";

    public PlayerIntentService() {
        super("PlayerIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_MUSIC.equals(action)) {
                localMusic = (LocalMusic) intent.getSerializableExtra(LOCAL_MUSIC);
                handleActionMusic();
            }
        }
    }

    private void handleActionMusic() {
        if (player == null) {
            player = new MediaPlayer();
        }
        player.reset();
        try {
            player.setDataSource(localMusic.getPath());
            player.prepare();
            player.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.release();
        }
    }
}