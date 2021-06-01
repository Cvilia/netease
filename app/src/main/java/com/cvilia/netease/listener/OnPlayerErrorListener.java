package com.cvilia.netease.listener;

import android.media.MediaPlayer;

/**
 * author: lzy
 * date: 3/9/21
 * describe：描述
 */
public interface OnPlayerErrorListener {

    boolean onError(MediaPlayer mp,int what,int extra);

}
