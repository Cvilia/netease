package com.cvilia.netease.utils;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.tbruyelle.rxpermissions3.Permission;
import com.tbruyelle.rxpermissions3.RxPermissions;

/**
 * author:lzy
 * date:2020-09-23
 * describe: RxPermission
 */
public class RxPermissionUtils {

    /**
     * Activity
     *
     * @param activity
     * @param permissions
     */
    public static void requestPermissions(AppCompatActivity activity, String[] permissions, OnPermissionCallBack callBack) {
        RxPermissions rxPermissions = new RxPermissions(activity);
        rxPermissions.requestEachCombined(permissions)
                .subscribe(permission -> {
                    if (permission.granted) {//全部授予才会执行
                        callBack.onPermissionsGranted();
                    } else if (permission.shouldShowRequestPermissionRationale) {//只要有一个权限拒绝都会执行到这里
                        callBack.onAtLeastOneReject(permission);
                    } else {//除了授予的权限，全部拒绝并不再询问才会走到这里来
                        callBack.onAllRejectAndDoNotAskAgain(permission);
                    }
                });
    }

    /**
     * fragment内权限申请
     * @param fragment 当前fragment
     * @param permissions 待申请权限
     * @param callback 回调
     */
    public static void requestPermissions(Fragment fragment, String[] permissions, OnPermissionCallBack callback) {
        RxPermissions rxPermissions = new RxPermissions(fragment);
        rxPermissions.requestEachCombined(permissions)
                .subscribe(permission -> {
                    if (permission.granted) {//全部授予才会执行
                        callback.onPermissionsGranted();
                    } else if (permission.shouldShowRequestPermissionRationale) {//只要有一个权限拒绝都会执行到这里
                        callback.onAtLeastOneReject(permission);
                    } else {//除了授予的权限，全部拒绝并不再询问才会走到这里来
                        callback.onAllRejectAndDoNotAskAgain(permission);
                    }
                });
    }

    /**
     * 判断权限是否全部授予
     *
     * @param avtivity
     * @param permissions 待请求的权限
     * @return false = 部分权限未授予  true = 已授予所有权限
     */
    public static boolean checkPermissions(@NonNull AppCompatActivity avtivity, String... permissions) {
        RxPermissions rxPermissions = new RxPermissions(avtivity);
        return checkPermissions(rxPermissions, permissions);
    }
    public static boolean checkPermissions(@NonNull Fragment fragment, String... permissions) {
        RxPermissions rxPermissions = new RxPermissions(fragment);
        return checkPermissions(rxPermissions, permissions);
    }

    /**
     * @param rxPermissions 检测工具类
     * @param permissions 待检测权限组
     * @return
     */
    private static boolean checkPermissions(@NonNull RxPermissions rxPermissions, String... permissions) {
        boolean result = true;
        for (int i = 0; i < permissions.length; i++) {
            if (!rxPermissions.isGranted(permissions[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * 跳转到权限设置界面
     */
    public static void toAppSetting(AppCompatActivity context) {
        //todo跳转到应用设置界面
//        AppSettingDialog.showToAppSettingDialog(context);
        RxPermissions rxPermissions = new RxPermissions(context);


    }

    public interface OnPermissionCallBack {
        void onPermissionsGranted();//所有权限都授予

        void onAtLeastOneReject(Permission permission);//至少有一个权限点击了拒绝（不管其他是同意还是拒绝并不再询问）

        void onAllRejectAndDoNotAskAgain(Permission permission);//所有权限都点击了拒绝且不再询问
    }

}
