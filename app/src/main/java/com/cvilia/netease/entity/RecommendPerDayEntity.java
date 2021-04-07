package com.cvilia.netease.entity;

import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-04-05-22:14
 * describe: 每日推荐歌曲实体类
 */

public class RecommendPerDayEntity {

    /**
     * code : 200
     * data : {"dailySongs":[{"name":"苏绣姑娘","id":1416840452,"ar":[{"id":12503194,"name":"新乐尘符"},{"id":27695983,"name":"李思雨"}],"pop":100,"al":{"id":84967994,"name":"苏绣姑娘","picUrl":"http://p4.music.126.net/-CXjukGYQ_spA4XXPu1Y3w==/109951164628116869.jpg","pic_str":"109951164628116869","pic":109951164628116860},"dt":222805,"h":{"br":320000,"fid":0,"size":8914605,"vd":-55011},"m":{"br":192000,"fid":0,"size":5348781,"vd":-52385},"l":{"br":128000,"fid":0,"size":3565869,"vd":-50648},"mark":64,"originCoverType":0,"originSongSimpleData":{"songId":1343283719,"name":"刚烈女子","artists":[{"id":12277185,"name":"锦零"}],"albumMeta":{"id":75391873,"name":"刚烈女子"}},"reason":"根据你可能喜欢的单曲 聊生"}],"recommendReasons":[{"songId":1416840452,"reason":"超77%人播放"},{"songId":1824222230,"reason":"泠鸢yousa的新歌速达"}]}
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<DailySongsBean> dailySongs;
        private List<RecommendReasonsBean> recommendReasons;

        public List<DailySongsBean> getDailySongs() {
            return dailySongs;
        }

        public void setDailySongs(List<DailySongsBean> dailySongs) {
            this.dailySongs = dailySongs;
        }

        public List<RecommendReasonsBean> getRecommendReasons() {
            return recommendReasons;
        }

        public void setRecommendReasons(List<RecommendReasonsBean> recommendReasons) {
            this.recommendReasons = recommendReasons;
        }

        public static class DailySongsBean {
            /**
             * name : 苏绣姑娘
             * id : 1416840452
             * ar : [{"id":12503194,"name":"新乐尘符"},{"id":27695983,"name":"李思雨"}]
             * pop : 100
             * al : {"id":84967994,"name":"苏绣姑娘","picUrl":"http://p4.music.126.net/-CXjukGYQ_spA4XXPu1Y3w==/109951164628116869.jpg","pic_str":"109951164628116869","pic":109951164628116860}
             * dt : 222805
             * h : {"br":320000,"fid":0,"size":8914605,"vd":-55011}
             * m : {"br":192000,"fid":0,"size":5348781,"vd":-52385}
             * l : {"br":128000,"fid":0,"size":3565869,"vd":-50648}
             * mark : 64
             * originCoverType : 0
             * originSongSimpleData : {"songId":1343283719,"name":"刚烈女子","artists":[{"id":12277185,"name":"锦零"}],"albumMeta":{"id":75391873,"name":"刚烈女子"}}
             * reason : 根据你可能喜欢的单曲 聊生
             */

            private String name;
            private long id;
            private List<ArBean> ar;
            private int pop;
            private AlBean al;
            private int dt;
            private HBean h;
            private MBean m;
            private LBean l;
            private int mark;
            private int originCoverType;
            private OriginSongSimpleDataBean originSongSimpleData;
            private String reason;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public List<ArBean> getAr() {
                return ar;
            }

            public void setAr(List<ArBean> ar) {
                this.ar = ar;
            }

            public int getPop() {
                return pop;
            }

            public void setPop(int pop) {
                this.pop = pop;
            }

            public AlBean getAl() {
                return al;
            }

            public void setAl(AlBean al) {
                this.al = al;
            }

            public int getDt() {
                return dt;
            }

            public void setDt(int dt) {
                this.dt = dt;
            }

            public HBean getH() {
                return h;
            }

            public void setH(HBean h) {
                this.h = h;
            }

            public MBean getM() {
                return m;
            }

            public void setM(MBean m) {
                this.m = m;
            }

            public LBean getL() {
                return l;
            }

            public void setL(LBean l) {
                this.l = l;
            }

            public int getMark() {
                return mark;
            }

            public void setMark(int mark) {
                this.mark = mark;
            }

            public int getOriginCoverType() {
                return originCoverType;
            }

            public void setOriginCoverType(int originCoverType) {
                this.originCoverType = originCoverType;
            }

            public OriginSongSimpleDataBean getOriginSongSimpleData() {
                return originSongSimpleData;
            }

            public void setOriginSongSimpleData(OriginSongSimpleDataBean originSongSimpleData) {
                this.originSongSimpleData = originSongSimpleData;
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }

            public static class AlBean {
                /**
                 * id : 84967994
                 * name : 苏绣姑娘
                 * picUrl : http://p4.music.126.net/-CXjukGYQ_spA4XXPu1Y3w==/109951164628116869.jpg
                 * pic_str : 109951164628116869
                 * pic : 109951164628116860
                 */

                private int id;
                private String name;
                private String picUrl;
                private String pic_str;
                private long pic;

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

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getPic_str() {
                    return pic_str;
                }

                public void setPic_str(String pic_str) {
                    this.pic_str = pic_str;
                }

                public long getPic() {
                    return pic;
                }

                public void setPic(long pic) {
                    this.pic = pic;
                }
            }

            public static class HBean {
                /**
                 * br : 320000
                 * fid : 0
                 * size : 8914605
                 * vd : -55011
                 */

                private int br;
                private int fid;
                private int size;
                private int vd;

                public int getBr() {
                    return br;
                }

                public void setBr(int br) {
                    this.br = br;
                }

                public int getFid() {
                    return fid;
                }

                public void setFid(int fid) {
                    this.fid = fid;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public int getVd() {
                    return vd;
                }

                public void setVd(int vd) {
                    this.vd = vd;
                }
            }

            public static class MBean {
                /**
                 * br : 192000
                 * fid : 0
                 * size : 5348781
                 * vd : -52385
                 */

                private int br;
                private int fid;
                private int size;
                private int vd;

                public int getBr() {
                    return br;
                }

                public void setBr(int br) {
                    this.br = br;
                }

                public int getFid() {
                    return fid;
                }

                public void setFid(int fid) {
                    this.fid = fid;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public int getVd() {
                    return vd;
                }

                public void setVd(int vd) {
                    this.vd = vd;
                }
            }

            public static class LBean {
                /**
                 * br : 128000
                 * fid : 0
                 * size : 3565869
                 * vd : -50648
                 */

                private int br;
                private int fid;
                private int size;
                private int vd;

                public int getBr() {
                    return br;
                }

                public void setBr(int br) {
                    this.br = br;
                }

                public int getFid() {
                    return fid;
                }

                public void setFid(int fid) {
                    this.fid = fid;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public int getVd() {
                    return vd;
                }

                public void setVd(int vd) {
                    this.vd = vd;
                }
            }

            public static class OriginSongSimpleDataBean {
                /**
                 * songId : 1343283719
                 * name : 刚烈女子
                 * artists : [{"id":12277185,"name":"锦零"}]
                 * albumMeta : {"id":75391873,"name":"刚烈女子"}
                 */

                private int songId;
                private String name;
                private List<ArtistsBean> artists;
                private AlbumMetaBean albumMeta;

                public int getSongId() {
                    return songId;
                }

                public void setSongId(int songId) {
                    this.songId = songId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<ArtistsBean> getArtists() {
                    return artists;
                }

                public void setArtists(List<ArtistsBean> artists) {
                    this.artists = artists;
                }

                public AlbumMetaBean getAlbumMeta() {
                    return albumMeta;
                }

                public void setAlbumMeta(AlbumMetaBean albumMeta) {
                    this.albumMeta = albumMeta;
                }

                public static class AlbumMetaBean {
                    /**
                     * id : 75391873
                     * name : 刚烈女子
                     */

                    private long id;
                    private String name;

                    public long getId() {
                        return id;
                    }

                    public void setId(long id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }

                public static class ArtistsBean {
                    /**
                     * id : 12277185
                     * name : 锦零
                     */

                    private long id;
                    private String name;

                    public long getId() {
                        return id;
                    }

                    public void setId(long id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }

            public static class ArBean {
                /**
                 * id : 12503194
                 * name : 新乐尘符
                 */

                private long id;
                private String name;

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class RecommendReasonsBean {
            /**
             * songId : 1416840452
             * reason : 超77%人播放
             */

            private int songId;
            private String reason;

            public int getSongId() {
                return songId;
            }

            public void setSongId(int songId) {
                this.songId = songId;
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }
        }
    }
}
