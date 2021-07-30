package com.cvilia.netease.player;

import android.content.Context;

import com.google.android.exoplayer2.SimpleExoPlayer;

/**
 * author: v_lizhenyu
 * email: v_lizhenyu@tal.com
 * date: 2021-07-30-16:11
 * describe：描述
 */
public class SingleExoplayer {

    public SimpleExoPlayer player;
    private static Context context;

    private static class Singleton{
        private static final SingleExoplayer instance = new SingleExoplayer();
    }
    private SingleExoplayer(){
        player = new SimpleExoPlayer.Builder(context).build();
    }
    public static SingleExoplayer getInstance(Context ctx){
        context = ctx;
        return  Singleton.instance;
    }

}
