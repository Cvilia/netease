package com.cvilia.netease.config;

/**
 * author:lzy
 * date:2020-07-01-00-58
 * describe:route path配置
 */

public class PageUrlConfig {

    private static final String LOGIN = "/login";
    private static final String MAIN = "/main";
    private static final String SHOW_ONCE = "/once";

    /**
     * LoginActivity
     */

    public static final String LOGIN_PAGE = "/login/login";

    /**
     * MainActivity
     */

    public static final String MAIN_PAGE = MAIN + "/mainActivity";
    public static final String SELECT_CITY_PAGE = MAIN + "/selectCityPage";
    public static final String LOCAL_MUSIC_ACTIVITY = MAIN + "/localMusicActivity";

    public static final String RECOMMEND_PER_DAY = MAIN_PAGE+"/recommendPerDayActivity";

}
