package com.cvilia.netease.bean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/26
 * describe：描述
 */
public class BindInfo {

    /**
     * code : 200
     * bindings : [{"userId":122121024,"url":"","tokenJsonStr":"","expiresIn":2147483647,"expired":false,"bindingTime":1551079487559,"refreshTime":1551079487,"id":6808660939,"type":1},{"userId":122121024,"url":"http://weibo.com/u/7486384296","tokenJsonStr":"","expiresIn":2633028,"expired":false,"bindingTime":1603697773158,"refreshTime":1603697773,"id":11124718550,"type":2},{"userId":122121024,"url":"","tokenJsonStr":"","expiresIn":7776000,"expired":false,"bindingTime":1603697765048,"refreshTime":1603697765,"id":11124704994,"type":5},{"userId":122121024,"url":"","tokenJsonStr":"","expiresIn":7200,"expired":true,"bindingTime":1602301092614,"refreshTime":1602301092,"id":11117149469,"type":10},{"userId":122121024,"url":"","tokenJsonStr":"{\"email\":\"cvilia@163.com\"}","expiresIn":2147483647,"expired":false,"bindingTime":0,"refreshTime":0,"id":59581591,"type":0},{"userId":122121024,"url":"","tokenJsonStr":"","expiresIn":2147483647,"expired":false,"bindingTime":1603697793192,"refreshTime":1603697793,"id":11124715604,"type":16}]
     */

    private int code;
    private List<BindingsBean> bindings;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<BindingsBean> getBindings() {
        return bindings;
    }

    public void setBindings(List<BindingsBean> bindings) {
        this.bindings = bindings;
    }

    public static class BindingsBean {
        /**
         * userId : 122121024
         * url :
         * tokenJsonStr :
         * expiresIn : 2147483647
         * expired : false
         * bindingTime : 1551079487559
         * refreshTime : 1551079487
         * id : 6808660939
         * type : 1
         */

        private int userId;
        private String url;
        private String tokenJsonStr;
        private int expiresIn;
        private boolean expired;
        private long bindingTime;
        private int refreshTime;
        private long id;
        private int type;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public long getBindingTime() {
            return bindingTime;
        }

        public void setBindingTime(long bindingTime) {
            this.bindingTime = bindingTime;
        }

        public int getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(int refreshTime) {
            this.refreshTime = refreshTime;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
