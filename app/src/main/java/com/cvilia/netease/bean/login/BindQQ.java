package com.cvilia.netease.bean.login;

import com.cvilia.netease.bean.INeteaseBean;
import com.google.gson.annotations.SerializedName;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-06-02-1:19
 * describe:QQ绑定信息
 */
public class BindQQ implements INeteaseBean {

    @SerializedName("access_token")
    private String accessToken;
    private String unionid;
    private String openid;
    private String nickname;
    private String partnerType;
    @SerializedName("expires_in")
    private long expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
