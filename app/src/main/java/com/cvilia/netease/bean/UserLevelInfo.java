package com.cvilia.netease.bean;

/**
 * author: lzy
 * date: 2020/10/26
 * describe：描述
 */
public class UserLevelInfo {


    /**
     * full : false
     * data : {"userId":122121024,"info":"60G音乐云盘免费容量$黑名单上限80$云音乐商城满100减9元优惠券$价值400云贝","progress":0.564,"nextPlayCount":2000,"nextLoginCount":100,"nowPlayCount":1128,"nowLoginCount":100,"level":7}
     * code : 200
     */

    private boolean full;
    private DataBean data;
    private int code;

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class DataBean {
        /**
         * userId : 122121024
         * info : 60G音乐云盘免费容量$黑名单上限80$云音乐商城满100减9元优惠券$价值400云贝
         * progress : 0.564
         * nextPlayCount : 2000 升级到下一级需要听歌次数
         * nextLoginCount : 100 升级到下一级需要的天数
         * nowPlayCount : 1128 现在的听歌次数
         * nowLoginCount : 100 现在的登录天数
         * level : 7
         */

        private Integer userId;
        private String info;
        private Double progress;
        private Integer nextPlayCount;
        private Integer nextLoginCount;
        private Integer nowPlayCount;
        private Integer nowLoginCount;
        private Integer level;

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public Double getProgress() {
            return progress;
        }

        public void setProgress(Double progress) {
            this.progress = progress;
        }

        public Integer getNextPlayCount() {
            return nextPlayCount;
        }

        public void setNextPlayCount(Integer nextPlayCount) {
            this.nextPlayCount = nextPlayCount;
        }

        public Integer getNextLoginCount() {
            return nextLoginCount;
        }

        public void setNextLoginCount(Integer nextLoginCount) {
            this.nextLoginCount = nextLoginCount;
        }

        public Integer getNowPlayCount() {
            return nowPlayCount;
        }

        public void setNowPlayCount(Integer nowPlayCount) {
            this.nowPlayCount = nowPlayCount;
        }

        public Integer getNowLoginCount() {
            return nowLoginCount;
        }

        public void setNowLoginCount(Integer nowLoginCount) {
            this.nowLoginCount = nowLoginCount;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }
    }
}
