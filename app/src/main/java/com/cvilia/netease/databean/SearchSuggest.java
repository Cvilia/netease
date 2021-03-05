package com.cvilia.netease.databean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/29
 * describe：搜索建议
 *
 */
public class SearchSuggest {

    /**
     * result : {"allMatch":[{"keyword":"海阔天空","type":1,"alg":"alg_psug_new","lastKeyword":"","feature":"MSwyLDMsODswLDAsMDs1YTJlMWQ5MjIxYWY3YTViNDdjMTQwZTZlMmY1NDE4NA"},{"keyword":"海阔天空 黄家驹","type":1,"alg":"alg_psug_new","lastKeyword":"","feature":"Niw4OzAsMCwwOzVhMmUxZDkyMjFhZjdhNWI0N2MxNDBlNmUyZjU0MTg0"},{"keyword":"海阔天空dj","type":1,"alg":"alg_psug_new","lastKeyword":"","feature":"ODswLDAsMDs1YTJlMWQ5MjIxYWY3YTViNDdjMTQwZTZlMmY1NDE4NA"},{"keyword":"海阔天空信","type":1,"alg":"alg_psug_new","lastKeyword":"","feature":"ODswLDAsMDs1YTJlMWQ5MjIxYWY3YTViNDdjMTQwZTZlMmY1NDE4NA"},{"keyword":"海阔天空 信乐团","type":1,"alg":"alg_psug_new","lastKeyword":"","feature":"NCw4OzAsMCwwOzVhMmUxZDkyMjFhZjdhNWI0N2MxNDBlNmUyZjU0MTg0"},{"keyword":"海阔天空伴奏","type":1,"alg":"alg_psug_new","lastKeyword":"","feature":"ODswLDAsMDs1YTJlMWQ5MjIxYWY3YTViNDdjMTQwZTZlMmY1NDE4NA"}]}
     * code : 200
     */

    private ResultBean result;
    private int code;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class ResultBean {
        private List<AllMatchBean> allMatch;

        public List<AllMatchBean> getAllMatch() {
            return allMatch;
        }

        public void setAllMatch(List<AllMatchBean> allMatch) {
            this.allMatch = allMatch;
        }

        public static class AllMatchBean {
            /**
             * keyword : 海阔天空
             * type : 1
             * alg : alg_psug_new
             * lastKeyword :
             * feature : MSwyLDMsODswLDAsMDs1YTJlMWQ5MjIxYWY3YTViNDdjMTQwZTZlMmY1NDE4NA
             */

            private String keyword;
            private int type;
            private String alg;
            private String lastKeyword;
            private String feature;

            public String getKeyword() {
                return keyword;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getAlg() {
                return alg;
            }

            public void setAlg(String alg) {
                this.alg = alg;
            }

            public String getLastKeyword() {
                return lastKeyword;
            }

            public void setLastKeyword(String lastKeyword) {
                this.lastKeyword = lastKeyword;
            }

            public String getFeature() {
                return feature;
            }

            public void setFeature(String feature) {
                this.feature = feature;
            }
        }
    }
}
