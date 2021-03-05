package com.cvilia.netease.databean;

/**
 * author: lzy
 * date: 2020/10/29
 * describe：默认关键词
 */
public class DefaultKeywords {

    /**
     * code : 200
     * message : sjkfab
     * data : {"showKeyword":"少女作妖日记 - 纳豆nado","realkeyword":"少女作妖日记","searchType":1018,"action":0,"alg":"alg_i2q_song","gap":0}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * showKeyword : 少女作妖日记 - 纳豆nado
         * realkeyword : 少女作妖日记
         * searchType : 1018
         * action : 0
         * alg : alg_i2q_song
         * gap : 0
         */

        private String showKeyword;
        private String realkeyword;
        private int searchType;
        private int action;
        private String alg;
        private int gap;

        public String getShowKeyword() {
            return showKeyword;
        }

        public void setShowKeyword(String showKeyword) {
            this.showKeyword = showKeyword;
        }

        public String getRealkeyword() {
            return realkeyword;
        }

        public void setRealkeyword(String realkeyword) {
            this.realkeyword = realkeyword;
        }

        public int getSearchType() {
            return searchType;
        }

        public void setSearchType(int searchType) {
            this.searchType = searchType;
        }

        public int getAction() {
            return action;
        }

        public void setAction(int action) {
            this.action = action;
        }

        public String getAlg() {
            return alg;
        }

        public void setAlg(String alg) {
            this.alg = alg;
        }

        public int getGap() {
            return gap;
        }

        public void setGap(int gap) {
            this.gap = gap;
        }
    }
}
