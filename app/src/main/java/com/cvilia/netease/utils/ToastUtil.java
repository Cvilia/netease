package com.cvilia.netease.utils;

import android.widget.Toast;

import com.cvilia.netease.NeteaseApplication;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public class ToastUtil {

    public static void showShort(String message) {
        Toast.makeText(NeteaseApplication.app, message, Toast.LENGTH_SHORT).show();
    }

}
