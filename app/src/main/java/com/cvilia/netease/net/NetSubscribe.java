package com.cvilia.netease.net;

import android.text.TextUtils;
import android.util.Log;

import com.cvilia.netease.utils.ToastUtil;

import java.io.IOException;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import retrofit2.HttpException;

/**
 * author: lzy
 * date: 2020/10/20
 * describe：描述
 */
public abstract class NetSubscribe<T> implements Observer<T> {

    private static final String TAG = "NetSubscribe";

    public NetSubscribe() {
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        Log.e(TAG, "onSubscribe d=" + d);
    }

    @Override
    public void onNext(@NonNull T t) {
        onSuccess(t);
    }

    public abstract void onSuccess(T t);

    public abstract void onFailed(Throwable throwable);

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(@NonNull Throwable e) {
        String errMsg;
        if (e instanceof IOException) {
            errMsg = "请检查网络连接";
        } else if (e instanceof HttpException) {
            errMsg = ((HttpException) e).response().message();
        } else {
            errMsg = !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "未知错误";
        }

        Log.e(TAG, "onError msg = " + e.getMessage());
        Log.e(TAG, "onError msg = ");
        e.printStackTrace();
        ToastUtil.showShort(errMsg);
        onFailed(e);
    }
}
