package com.cvilia.netease.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.cvilia.netease.bean.User;

import org.greenrobot.eventbus.Subscribe;
import org.reactivestreams.Subscriber;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
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

    private ApiService api;
    private static Retrofit retrofit;
    private OkHttpClient okHttpClient;
    private static Context mContext;
    private static RetrofitUtils instance;
    private static final String baseUrl = ApiService.BASE_SERVER;


    public static RetrofitUtils getInstance(Context context) {
        if (context != null) {
            mContext = context;
        } else {
            Log.e(TAG, "context is null,it can't be allow!!!!!!!!");
        }
        return Singleton.INSTANCE;
    }

    public static RetrofitUtils getInstance(Context context, String url) {
        if (context != null) {
            mContext = context;
        } else {
            Log.e(TAG, "context is null,it can't be allow!!!!!!!!");
        }
        if (instance == null) {
            synchronized (RetrofitUtils.class) {
                if (instance == null) {
                    instance = new RetrofitUtils(context, url);
                }
            }
        }
        return instance;
    }

    private RetrofitUtils(Context context) {
        this(context, null);
    }

    private RetrofitUtils(Context context, String url) {
        if (TextUtils.isEmpty(baseUrl)) {
            url = baseUrl;
        }

        okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS))
                .connectTimeout(CONNECT_TIME, TimeUnit.SECONDS)
                .readTimeout(WAIT_TIME, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl(url)
                .build();
        api = retrofit.create(ApiService.class);
    }

    private static class Singleton {
        private static RetrofitUtils INSTANCE = new RetrofitUtils(mContext);
    }

    public Observable<User> loginByPhone(String phone, String password) {
        return api.loginByPhone(phone, password);
    }

    public Observable<User> loginByEmail(String email, String password) {
        return api.loginByPhone(email, password);
    }

}
