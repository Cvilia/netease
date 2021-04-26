package com.cvilia.netease.entity;

import com.cvilia.netease.framework.BubbleEntity;

/**
 * author: lzy
 * email: v_lizhenyu@tal.com
 * date: 2021-04-13-12:04 PM
 * describe：描述
 */
public class RefreshLoginEntity implements BubbleEntity {

    int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
