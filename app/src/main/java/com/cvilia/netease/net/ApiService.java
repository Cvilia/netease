package com.cvilia.netease.net;

import com.cvilia.netease.bean.User;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public interface ApiService {

    String BASE_SERVER = "http://111.229.248.158:3000";

    /**
     * 手机号登录
     * @param phone
     * @param password
     * @return
     */
    @GET("/login/cellphone")
    Observable<User> loginByPhone(@Query("phone") String phone,@Query("password") String password);

    /**
     * 邮箱登录
     * @param phone
     * @param password
     * @return
     */
    @GET("/login?")
    Observable<User> loginByEmail(@Query("email") String phone,@Query("md5_password") String password);

}
