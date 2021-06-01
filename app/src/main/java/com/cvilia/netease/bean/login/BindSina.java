package com.cvilia.netease.bean.login;

import com.cvilia.netease.bean.INeteaseBean;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-06-02-1:11
 * describe:微博绑定信息
 */
public class BindSina implements INeteaseBean {

    private String uid;
    private String name;
    private String province;
    private String city;
    private String location;
    private String profile_image_url;
    private String avatar_large;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getAvatar_large() {
        return avatar_large;
    }

    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }
}
