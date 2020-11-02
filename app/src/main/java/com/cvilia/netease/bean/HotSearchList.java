package com.cvilia.netease.bean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/29
 * describe：人们搜索列表
 */
public class HotSearchList {

    /**
     * code : 200
     * result : {"hots":[{"first":"经济舱","second":1,"third":null,"iconType":1},{"first":"会不会","second":1,"third":null,"iconType":1},{"first":"不曾遗忘的符号","second":1,"third":null,"iconType":1},{"first":"中国新说唱","second":1,"third":null,"iconType":1},{"first":"薛之谦","second":1,"third":null,"iconType":1},{"first":"张杰","second":1,"third":null,"iconType":1},{"first":"偏爱小鬼","second":1,"third":null,"iconType":1},{"first":"游京","second":1,"third":null,"iconType":1},{"first":"Jony J 顽家","second":1,"third":null,"iconType":1},{"first":"林俊杰","second":1,"third":null,"iconType":1}]}
     */

    private int code;
    private ResultBean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<HotsBean> hots;

        public List<HotsBean> getHots() {
            return hots;
        }

        public void setHots(List<HotsBean> hots) {
            this.hots = hots;
        }

        public static class HotsBean {
            /**
             * first : 经济舱
             * second : 1
             * third : null
             * iconType : 1
             */

            private String first;
            private int second;
            private Object third;
            private int iconType;

            public String getFirst() {
                return first;
            }

            public void setFirst(String first) {
                this.first = first;
            }

            public int getSecond() {
                return second;
            }

            public void setSecond(int second) {
                this.second = second;
            }

            public Object getThird() {
                return third;
            }

            public void setThird(Object third) {
                this.third = third;
            }

            public int getIconType() {
                return iconType;
            }

            public void setIconType(int iconType) {
                this.iconType = iconType;
            }
        }
    }
}
