package com.cvilia.netease.sp;

import com.tencent.mmkv.MMKV;

/**
 * author:lzy
 * date:2020-10-08-22-40
 * describe:
 */
public class MMKVUtil {

    private static MMKV init() {
        return MMKV.defaultMMKV();
    }

    /**
     * 存储布尔
     * @param key
     * @param value
     */
    public static void saveBool(String key, boolean value) {
        init().encode(key, value);
    }

    public static boolean getBool(String key){
        return  getBool(key,false);
    }

    public static boolean getBool(String key, boolean defaultValue) {
        return init().decodeBool(key,defaultValue);
    }

    /**
     * 存储String
     * @param key
     * @param value
     */
    public static void saveString(String key,String value){
        init().encode(key, value);
    }

    public static String getString(String key){
        return  getString(key,null);
    }

    public static String getString(String key, String defaultValue) {
        return init().decodeString(key,defaultValue);
    }

    /**
     * 存储int
     */

    public static void saveInt(String key,int value){
        init().encode(key,value);
    }


    public static int getInt(String key){
        return init().decodeInt(key);
    }

}
