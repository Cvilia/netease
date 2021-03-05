package com.cvilia.netease.databean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/29
 * describe：精品歌单分类
 */
public class BestPlayListCategory {

    /**
     * tags : [{"id":5001,"name":"华语","type":0,"category":0,"hot":false},{"id":1045,"name":"欧美","type":1,"category":0,"hot":false},{"id":5003,"name":"韩语","type":1,"category":0,"hot":false},{"id":5002,"name":"日语","type":1,"category":0,"hot":false},{"id":2040,"name":"粤语","type":1,"category":0,"hot":false},{"id":10001,"name":"另类/独立","type":0,"category":1,"hot":false},{"id":5005,"name":"R&B/Soul","type":1,"category":1,"hot":false},{"id":2010,"name":"民族","type":1,"category":1,"hot":false},{"id":1031,"name":"怀旧","type":0,"category":3,"hot":false},{"id":2042,"name":"小语种","type":1,"category":0,"hot":false},{"id":2017,"name":"学习","type":0,"category":2,"hot":false},{"id":4001,"name":"运动","type":0,"category":2,"hot":false},{"id":11002,"name":"ACG","type":0,"category":4,"hot":false},{"id":13001,"name":"Bossa Nova","type":1,"category":1,"hot":false},{"id":9001,"name":"影视原声","type":0,"category":4,"hot":false},{"id":1,"name":"流行","type":0,"category":1,"hot":false},{"id":1030,"name":"性感","type":1,"category":3,"hot":false},{"id":2,"name":"摇滚","type":0,"category":1,"hot":false},{"id":1005,"name":"英伦","type":1,"category":1,"hot":false},{"id":16001,"name":"后摇","type":1,"category":1,"hot":false},{"id":12001,"name":"古风","type":1,"category":1,"hot":false},{"id":1001,"name":"民谣","type":0,"category":1,"hot":false},{"id":5009,"name":"90后","type":1,"category":4,"hot":false},{"id":1009,"name":"蓝调","type":1,"category":1,"hot":false},{"id":1010,"name":"乡村","type":1,"category":1,"hot":false},{"id":1032,"name":"治愈","type":0,"category":3,"hot":false},{"id":2025,"name":"浪漫","type":1,"category":3,"hot":false},{"id":1027,"name":"快乐","type":1,"category":3,"hot":false},{"id":1041,"name":"经典","type":1,"category":4,"hot":false},{"id":7003,"name":"世界音乐","type":1,"category":1,"hot":false},{"id":2008,"name":"轻音乐","type":0,"category":1,"hot":false},{"id":2004,"name":"电子","type":0,"category":1,"hot":false},{"id":1049,"name":"器乐","type":1,"category":4,"hot":false},{"id":5004,"name":"说唱","type":1,"category":1,"hot":false},{"id":1012,"name":"古典","type":1,"category":1,"hot":false},{"id":2007,"name":"爵士","type":1,"category":1,"hot":false}]
     * code : 200
     */

    private int code;
    private List<TagsBean> tags;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public static class TagsBean {
        /**
         * id : 5001
         * name : 华语
         * type : 0
         * category : 0
         * hot : false
         */

        private int id;
        private String name;
        private int type;
        private int category;
        private boolean hot;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }

        public boolean isHot() {
            return hot;
        }

        public void setHot(boolean hot) {
            this.hot = hot;
        }
    }
}
