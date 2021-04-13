package com.cvilia.netease.net;

import android.util.Log;

import com.cvilia.netease.NeteaseApplication;
import com.cvilia.netease.bean.User;
import com.cvilia.netease.entity.BannerEntity;
import com.cvilia.netease.entity.RecommendPerDayEntity;
import com.cvilia.netease.entity.RefreshLoginEntity;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public class RetrofitUtils {
    private static final String TAG = RetrofitUtils.class.getSimpleName();

    private static final int CONNECT_TIME = 15;//连接时间
    private static final int WAIT_TIME = 30;//读取时间

    private final ApiService api;
    private static OkHttpClient okHttpClient;
    private static RetrofitUtils instance;


    private RetrofitUtils(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.BASE_SERVER)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        api = retrofit.create(ApiService.class);
    }

    public static RetrofitUtils getInstance() {
        if (instance == null) {
            instance = new RetrofitUtils(initOkHttpClient());
        }
        return instance;
    }

    private static OkHttpClient initOkHttpClient() {

        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIME, TimeUnit.SECONDS)
                .readTimeout(WAIT_TIME, TimeUnit.SECONDS)
                .writeTimeout(WAIT_TIME, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .addInterceptor(loggingInterceptor)
                .addInterceptor(headerInterceptor)
                .cache(cache).addInterceptor(cacheInterceptor)
                .build();
        return okHttpClient;

    }

    /**
     * 日志信息
     */
    static HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
        @Override
        public void log(@NotNull String s) {
            Log.e(TAG, "HttpLoggingInterceptor=" + s);
        }
    });

    /**
     * 设置头信息
     */
    static Interceptor headerInterceptor = chain -> {
        Request originRequest = chain.request();
        Request.Builder builder = originRequest.newBuilder()
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "text/plain; charset=utf-8")
                .method(originRequest.method(), originRequest.body());
        Request request = builder.build();
        return chain.proceed(request);
    };


    /**
     * 设置缓存
     */
    public static final String CACHE_NAME = "retrofit_cache";
    static File cacheFile = new File(NeteaseApplication.app.getExternalCacheDir(), CACHE_NAME);
    static Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);
    static Interceptor cacheInterceptor = new Interceptor() {
        @NotNull
        @Override
        public Response intercept(@NotNull Chain chain) throws IOException {
            Request request = chain.request();
            if (!NetWorkUtil.isNetworkConnected()) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
            }
            Response response = chain.proceed(request);
            if (!NetWorkUtil.isNetworkConnected()) {
                int maxAge = 0;
                // 有网络时 设置缓存超时时间0个小时
                response.newBuilder()
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        .removeHeader(CACHE_NAME)// 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                        .build();
            } else {
                // 无网络时，设置超时为4周
                int maxStale = 60 * 60 * 24 * 28;
                response.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .removeHeader(CACHE_NAME)
                        .build();
            }
            return response;

        }
    };


    public Observable<User> loginByPhone(String phone, String password) {
        return api.loginByPhone(phone, password);
    }

    public Observable<User> loginByEmail(String email, String password) {
        return api.loginByEmail(email, password);
    }

    public Observable<BannerEntity> getBanners() {
        return api.getBanners();
    }

    public Observable<RecommendPerDayEntity> getRecommendSongs(String cookie) {
        return api.getRecommendSongs(cookie);
    }
    public Observable<RefreshLoginEntity> refreshLogin() {
        return api.refreshLogin();
    }
}
