package com.cvilia.netease.bean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/29
 * describe：热门歌单分类
 */
public class HotPlayListCategory {


    /**
     * tags : [{"playlistTag":{"id":5001,"name":"华语","category":0,"usedCount":6913678,"type":0,"position":1,"createTime":1378707544870,"highQuality":1,"highQualityPos":1,"officialPos":1},"activity":false,"hot":true,"position":1,"category":0,"createTime":1378707544870,"usedCount":6913678,"name":"华语","id":5001,"type":1},{"playlistTag":{"id":1,"name":"流行","category":1,"usedCount":6350423,"type":0,"position":2,"createTime":1378707567870,"highQuality":1,"highQualityPos":17,"officialPos":1},"activity":false,"hot":true,"position":2,"category":1,"createTime":1378707567870,"usedCount":6350423,"name":"流行","id":1,"type":1},{"playlistTag":{"id":2,"name":"摇滚","category":1,"usedCount":2493949,"type":0,"position":3,"createTime":1378707568870,"highQuality":1,"highQualityPos":19,"officialPos":2},"activity":false,"hot":true,"position":3,"category":1,"createTime":1378707568870,"usedCount":2493949,"name":"摇滚","id":2,"type":1},{"playlistTag":{"id":1001,"name":"民谣","category":1,"usedCount":2714301,"type":0,"position":4,"createTime":1378707569870,"highQuality":1,"highQualityPos":23,"officialPos":3},"activity":false,"hot":true,"position":4,"category":1,"createTime":1378707569870,"usedCount":2714301,"name":"民谣","id":1001,"type":1},{"playlistTag":{"id":2004,"name":"电子","category":1,"usedCount":3560028,"type":0,"position":5,"createTime":1378707570870,"highQuality":1,"highQualityPos":37,"officialPos":4},"activity":false,"hot":true,"position":5,"category":1,"createTime":1378707570870,"usedCount":3560028,"name":"电子","id":2004,"type":1},{"playlistTag":{"id":10001,"name":"另类/独立","category":1,"usedCount":1854759,"type":0,"position":6,"createTime":1387441492331,"highQuality":1,"highQualityPos":6,"officialPos":20},"activity":false,"hot":true,"position":6,"category":1,"createTime":1387441492331,"usedCount":1854759,"name":"另类/独立","id":10001,"type":1},{"playlistTag":{"id":2008,"name":"轻音乐","category":1,"usedCount":3131841,"type":0,"position":7,"createTime":1378707572870,"highQuality":1,"highQualityPos":36,"officialPos":7},"activity":false,"hot":true,"position":7,"category":1,"createTime":1378707572870,"usedCount":3131841,"name":"轻音乐","id":2008,"type":1},{"playlistTag":{"id":4099180,"name":"综艺","category":4,"usedCount":7704,"type":0,"position":8,"createTime":1586400155889,"highQuality":0,"highQualityPos":0,"officialPos":0},"activity":false,"hot":true,"position":8,"category":4,"createTime":1586400155889,"usedCount":7704,"name":"综艺","id":4099180,"type":1},{"playlistTag":{"id":9001,"name":"影视原声","category":4,"usedCount":1969483,"type":0,"position":9,"createTime":1378707598870,"highQuality":1,"highQualityPos":16,"officialPos":1},"activity":false,"hot":true,"position":9,"category":4,"createTime":1378707598870,"usedCount":1969483,"name":"影视原声","id":9001,"type":1},{"playlistTag":{"id":11002,"name":"ACG","category":4,"usedCount":2142125,"type":0,"position":10,"createTime":1387779676260,"highQuality":1,"highQualityPos":14,"officialPos":2},"activity":false,"hot":true,"position":10,"category":4,"createTime":1387779676260,"usedCount":2142125,"name":"ACG","id":11002,"type":1}]
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
         * playlistTag : {"id":5001,"name":"华语","category":0,"usedCount":6913678,"type":0,"position":1,"createTime":1378707544870,"highQuality":1,"highQualityPos":1,"officialPos":1}
         * activity : false
         * hot : true
         * position : 1
         * category : 0
         * createTime : 1378707544870
         * usedCount : 6913678
         * name : 华语
         * id : 5001
         * type : 1
         */

        private PlaylistTagBean playlistTag;
        private boolean activity;
        private boolean hot;
        private int position;
        private int category;
        private long createTime;
        private int usedCount;
        private String name;
        private int id;
        private int type;

        public PlaylistTagBean getPlaylistTag() {
            return playlistTag;
        }

        public void setPlaylistTag(PlaylistTagBean playlistTag) {
            this.playlistTag = playlistTag;
        }

        public boolean isActivity() {
            return activity;
        }

        public void setActivity(boolean activity) {
            this.activity = activity;
        }

        public boolean isHot() {
            return hot;
        }

        public void setHot(boolean hot) {
            this.hot = hot;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getUsedCount() {
            return usedCount;
        }

        public void setUsedCount(int usedCount) {
            this.usedCount = usedCount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public static class PlaylistTagBean {
            /**
             * id : 5001
             * name : 华语
             * category : 0
             * usedCount : 6913678
             * type : 0
             * position : 1
             * createTime : 1378707544870
             * highQuality : 1
             * highQualityPos : 1
             * officialPos : 1
             */

            private int id;
            private String name;
            private int category;
            private int usedCount;
            private int type;
            private int position;
            private long createTime;
            private int highQuality;
            private int highQualityPos;
            private int officialPos;

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

            public int getCategory() {
                return category;
            }

            public void setCategory(int category) {
                this.category = category;
            }

            public int getUsedCount() {
                return usedCount;
            }

            public void setUsedCount(int usedCount) {
                this.usedCount = usedCount;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getHighQuality() {
                return highQuality;
            }

            public void setHighQuality(int highQuality) {
                this.highQuality = highQuality;
            }

            public int getHighQualityPos() {
                return highQualityPos;
            }

            public void setHighQualityPos(int highQualityPos) {
                this.highQualityPos = highQualityPos;
            }

            public int getOfficialPos() {
                return officialPos;
            }

            public void setOfficialPos(int officialPos) {
                this.officialPos = officialPos;
            }
        }
    }
}
