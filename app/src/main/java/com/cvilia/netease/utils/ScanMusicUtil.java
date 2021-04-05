package com.cvilia.netease.utils;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.MediaStore;

import androidx.annotation.RequiresApi;

import com.cvilia.netease.sqlmodel.LocalMusic;

import java.util.ArrayList;
import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-03-06-22:16
 * describe: 扫描本地音乐
 */
public class ScanMusicUtil {
    /**
     * 扫描系统里面的音频文件，返回一个list集合
     */
    public static List<LocalMusic> getMusicData(Context context) {
        List<LocalMusic> list = new ArrayList<LocalMusic>();
        // 媒体库查询语句（写一个工具类MusicUtils）
        Cursor cursor = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null,
                null, MediaStore.Audio.Media.IS_MUSIC);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                LocalMusic music = new LocalMusic();
                //歌曲名称
                music.setName(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE)));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    //歌手
                    music.setArtist(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST)));
                    //专辑名
                    music.setAlbum(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM)));
                    //歌曲时长
                    music.setDuration(cursor.getLong(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DURATION)));
                }
                //歌曲路径
                music.setPath(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)));
                music.setType(getMusicType(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA))));
                //歌曲大小
                music.setSize(cursor.getLong(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE)));
                music.setLocal(true);
                list.add(music);
            }
            // 释放资源
            cursor.close();
        }
        return list;
    }

    private static String getMusicType(String filePath) {
        String[] strs = filePath.split("\\.");
        return strs[strs.length - 1];
    }
}
