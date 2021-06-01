package com.cvilia.netease.bean.login;

import com.cvilia.netease.bean.INeteaseBean;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-06-02-1:19
 * describe:QQ绑定信息
 */
public class BindQQ implements INeteaseBean {

    private String access_token;
    private String unionid;
    private String openid;
    private String nickname;
    private String partnerType;
    private long expires_in;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
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

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }
}
