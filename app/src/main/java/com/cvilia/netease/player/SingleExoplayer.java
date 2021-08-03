package com.cvilia.netease.player;

import android.content.Context;
import android.net.Uri;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;

import java.lang.ref.WeakReference;

/**
 * author: v_lizhenyu
 * email: v_lizhenyu@tal.com
 * date: 2021-07-30-16:11
 * describe：描述
 */
public class SingleExoplayer {

    public SimpleExoPlayer player;
    private static WeakReference<Context> weak;

    private static class Singleton{
        private static final SingleExoplayer instance = new SingleExoplayer();
    }
    private SingleExoplayer(){
        player = new SimpleExoPlayer.Builder(weak.get()).build();
    }
    public static SingleExoplayer getInstance(Context ctx){
        weak = new WeakReference<>(ctx);
        return  Singleton.instance;
    }

    public void setVideoUri(String videUrl){
        MediaItem mediaItem = MediaItem.fromUri(Uri.parse(videUrl));
        player.addMediaItem(mediaItem);
    }

}
