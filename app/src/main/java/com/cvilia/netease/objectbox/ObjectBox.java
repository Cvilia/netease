package com.cvilia.netease.objectbox;

import android.content.Context;


import com.cvilia.netease.sqlmodel.MyObjectBox;

import io.objectbox.BoxStore;

/**
 * author: lzy
 * date: 3/5/21
 * describe：描述
 */
public class ObjectBox {
    private static BoxStore boxStore;

    public static void init(Context context) {
        boxStore = MyObjectBox.builder().androidContext(context.getApplicationContext()).build();
    }

    public static BoxStore getBoxStore() {
        return boxStore;
    }
}
