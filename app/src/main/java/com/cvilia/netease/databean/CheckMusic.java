package com.cvilia.netease.databean;

/**
 * author: lzy
 * date: 2020/10/29
 * describe：检测音乐是否可用
 */
public class CheckMusic {

    /**
     * success:false
     * message:"亲爱的，暂无版权"
     */

    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
