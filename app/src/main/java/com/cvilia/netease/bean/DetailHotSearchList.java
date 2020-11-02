package com.cvilia.netease.bean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/29
 * describe：详细的热门搜索列表
 */
public class DetailHotSearchList {

    /**
     * code : 200
     * data : [{"searchWord":"经济舱","score":1354214,"content":"拨不通的电话 遍布星辰的晚上","source":0,"iconType":1,"iconUrl":"https://p1.music.126.net/2zQ0d1ThZCX5Jtkvks9aOQ==/109951163968000522.png","url":"","alg":"alg_statistics"},{"searchWord":"会不会","score":1296120,"content":"没人怀疑真心 即便它瞬息万变","source":0,"iconType":1,"iconUrl":"https://p1.music.126.net/2zQ0d1ThZCX5Jtkvks9aOQ==/109951163968000522.png","url":"","alg":"alg_statistics"},{"searchWord":"不曾遗忘的符号","score":1145651,"content":"歌手马伯骞再回西安","source":1,"iconType":0,"iconUrl":"http://p4.music.126.net/P4mXkx6VKXLFqVo5ohHxDg==/109951163992439900.jpg","url":"","alg":"featured"},{"searchWord":"中国新说唱","score":933822,"content":"这个夏天有新说唱才圆满！","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"薛之谦","score":895377,"content":"老薛一发歌就能掀起狂潮！","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"张杰","score":866797,"content":"张杰带你穿越人海","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"偏爱小鬼","score":852480,"content":"当仙剑三的老歌遇上小鬼说唱~","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"游京","score":776011,"content":"怀念的想相见，相见的又恨晚","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"Jony J 顽家","score":764019,"content":"说唱诗人 全新自我对话","source":1,"iconType":0,"iconUrl":"http://p3.music.126.net/P4mXkx6VKXLFqVo5ohHxDg==/109951163992439900.jpg","url":"","alg":"featured"},{"searchWord":"林俊杰","score":758450,"content":"当之无愧的行走CD机！","source":0,"iconType":1,"iconUrl":"https://p1.music.126.net/2zQ0d1ThZCX5Jtkvks9aOQ==/109951163968000522.png","url":"","alg":"alg_statistics"},{"searchWord":"囍","score":723490,"content":"唢呐一出，鸡皮疙瘩起来了！","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"流着泪说分手","score":695816,"content":"金志文十年前的经典情歌","source":0,"iconType":5,"iconUrl":"https://p1.music.126.net/PtgUJbcvDAY0HKWpmOB2HA==/109951163967988470.png","url":"","alg":"alg_statistics"},{"searchWord":"海底","score":675605,"content":"温柔的人会将你带离海底","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"偏爱","score":662374,"content":"仙剑三，满满的回忆","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"沉醉的青丝","score":624728,"content":"等一缕 为你而沉醉的青丝","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"永不失联的爱","score":599370,"content":"你是我 这一辈子都不想失联的爱","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"不谓侠","score":594421,"content":"只做狂人不谓侠！","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"起风了","score":586930,"content":"心之所动 且就随缘去吧","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"说散就散","score":562849,"content":"袁娅维献唱电影《前任3》主题曲","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"},{"searchWord":"好运来","score":547127,"content":"锦鲤歌曲伴你成功上岸！","source":0,"iconType":0,"iconUrl":null,"url":"","alg":"alg_statistics"}]
     * message : success
     */

    private int code;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * searchWord : 经济舱
         * score : 1354214
         * content : 拨不通的电话 遍布星辰的晚上
         * source : 0
         * iconType : 1
         * iconUrl : https://p1.music.126.net/2zQ0d1ThZCX5Jtkvks9aOQ==/109951163968000522.png
         * url :
         * alg : alg_statistics
         */

        private String searchWord;
        private int score;
        private String content;
        private int source;
        private int iconType;
        private String iconUrl;
        private String url;
        private String alg;

        public String getSearchWord() {
            return searchWord;
        }

        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public int getIconType() {
            return iconType;
        }

        public void setIconType(int iconType) {
            this.iconType = iconType;
        }

        public String getIconUrl() {
            return iconUrl;
        }

        public void setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlg() {
            return alg;
        }

        public void setAlg(String alg) {
            this.alg = alg;
        }
    }
}
