package com.cvilia.netease.utils;

import java.util.regex.Pattern;

/**
 * author: lzy
 * date: 2020/10/19
 * describe：正则表达式验证
 */
public class RegexUtils {

    public static boolean isMail(String email) {
        String regex = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

}
