package com.cvilia.netease.bean.login;

import com.cvilia.netease.bean.INeteaseBean;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-06-02-1:21
 * describe:微信绑定信息
 */
public class BindWechat implements INeteaseBean {

    private String country;
    private int gender;
    private String avatarUrl;
    private String nickname;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
