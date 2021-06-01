package com.cvilia.netease.net;

import com.cvilia.netease.bean.BannerEntity;
import com.cvilia.netease.bean.DayRecommendEntity;
import com.cvilia.netease.bean.RefreshLoginEntity;
import com.cvilia.netease.bean.login.UserLoginBean;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public interface ApiService {

    String BASE_SERVER = "http://121.89.204.40:3000";

    /**
     * 手机号登录
     *
     * @param phone    手机号
     * @param password 密码
     * @return 登录信息
     */
    @GET("/login/cellphone")
    Observable<UserLoginBean> loginByPhone(@Query("phone") String phone, @Query("md5_password") String password);

    /**
     * 邮箱登录
     *
     * @param email    网易邮箱账号
     * @param password 密码
     * @return 登录信息
     */
    @GET("/login")
    Observable<UserLoginBean> loginByEmail(@Query("email") String email, @Query("md5_password") String password);

    /**
     * 刷新登录
     *
     */
    @GET("/login/refresh")
    Observable<RefreshLoginEntity> refreshLogin();

    /**
     * 获取 banner
     *
     * @return banners
     */
    @GET("/banner")
    Observable<BannerEntity> getBanners();

    @GET("/recommend/songs")
    Observable<DayRecommendEntity> getRecommendSongs(@Query("cookie")String cookie);

}
