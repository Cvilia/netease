package com.cvilia.netease.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-07-29-23:48
 * describe:
 */
public class TiktokBean {
    @SerializedName("datas")
    private List<VideoDatasBean> videoDatas;
    private String msg;
    @SerializedName("hasmore")
    private boolean hasMore;
    private int code;

    public List<VideoDatasBean> getVideoDatas() {
        return videoDatas;
    }

    public void setVideoDatas(List<VideoDatasBean> videoDatas) {
        this.videoDatas = videoDatas;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class VideoDatasBean {
        private int type;
        private boolean displayed;
        private DataBean data;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public boolean isDisplayed() {
            return displayed;
        }

        public void setDisplayed(boolean displayed) {
            this.displayed = displayed;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            private LiveDataBean liveData;
            private String coverUrl;
            private int height;
            private int width;
            private String title;
            private long commentCount;
            private long shareCount;
            private List<ResolutionsBean> resolutions;
            private CreatorBean creator;
            private UrlInfoBean urlInfo;
            private List<VideoGroupBean> videoGroup;
            private List<RelateSongBean> relateSong;
            private String vid;
            private long durationms;
            private long praisedCount;
            private boolean praised;
            private boolean subscribed;

            public LiveDataBean getLiveData() {
                return liveData;
            }

            public void setLiveData(LiveDataBean liveData) {
                this.liveData = liveData;
            }

            public String getCoverUrl() {
                return coverUrl;
            }

            public void setCoverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public long getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(long commentCount) {
                this.commentCount = commentCount;
            }

            public long getShareCount() {
                return shareCount;
            }

            public void setShareCount(long shareCount) {
                this.shareCount = shareCount;
            }

            public List<ResolutionsBean> getResolutions() {
                return resolutions;
            }

            public void setResolutions(List<ResolutionsBean> resolutions) {
                this.resolutions = resolutions;
            }

            public CreatorBean getCreator() {
                return creator;
            }

            public void setCreator(CreatorBean creator) {
                this.creator = creator;
            }

            public UrlInfoBean getUrlInfo() {
                return urlInfo;
            }

            public void setUrlInfo(UrlInfoBean urlInfo) {
                this.urlInfo = urlInfo;
            }

            public List<VideoGroupBean> getVideoGroup() {
                return videoGroup;
            }

            public void setVideoGroup(List<VideoGroupBean> videoGroup) {
                this.videoGroup = videoGroup;
            }

            public List<RelateSongBean> getRelateSong() {
                return relateSong;
            }

            public void setRelateSong(List<RelateSongBean> relateSong) {
                this.relateSong = relateSong;
            }

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public long getDurationms() {
                return durationms;
            }

            public void setDurationms(long durationms) {
                this.durationms = durationms;
            }

            public long getPraisedCount() {
                return praisedCount;
            }

            public void setPraisedCount(long praisedCount) {
                this.praisedCount = praisedCount;
            }

            public boolean isPraised() {
                return praised;
            }

            public void setPraised(boolean praised) {
                this.praised = praised;
            }

            public boolean isSubscribed() {
                return subscribed;
            }

            public void setSubscribed(boolean subscribed) {
                this.subscribed = subscribed;
            }

            public static class LiveDataBean {
                private String type;
                private LiveRoomBean liveRoom;
                private LiveUserBean liveUser;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public LiveRoomBean getLiveRoom() {
                    return liveRoom;
                }

                public void setLiveRoom(LiveRoomBean liveRoom) {
                    this.liveRoom = liveRoom;
                }

                public LiveUserBean getLiveUser() {
                    return liveUser;
                }

                public void setLiveUser(LiveUserBean liveUser) {
                    this.liveUser = liveUser;
                }

                public static class LiveRoomBean {
                    private String liveRoomNo;
                    private String title;
                    private String coverUrl;
                    private Integer popularity;
                    private Integer liveStatus;
                    private Integer liveId;
                    private String httpPullUrl;
                    private String coverTag;

                    public String getLiveRoomNo() {
                        return liveRoomNo;
                    }

                    public void setLiveRoomNo(String liveRoomNo) {
                        this.liveRoomNo = liveRoomNo;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getCoverUrl() {
                        return coverUrl;
                    }

                    public void setCoverUrl(String coverUrl) {
                        this.coverUrl = coverUrl;
                    }

                    public Integer getPopularity() {
                        return popularity;
                    }

                    public void setPopularity(Integer popularity) {
                        this.popularity = popularity;
                    }

                    public Integer getLiveStatus() {
                        return liveStatus;
                    }

                    public void setLiveStatus(Integer liveStatus) {
                        this.liveStatus = liveStatus;
                    }

                    public Integer getLiveId() {
                        return liveId;
                    }

                    public void setLiveId(Integer liveId) {
                        this.liveId = liveId;
                    }

                    public String getHttpPullUrl() {
                        return httpPullUrl;
                    }

                    public void setHttpPullUrl(String httpPullUrl) {
                        this.httpPullUrl = httpPullUrl;
                    }

                    public String getCoverTag() {
                        return coverTag;
                    }

                    public void setCoverTag(String coverTag) {
                        this.coverTag = coverTag;
                    }
                }

                public static class LiveUserBean {
                    private Integer userId;
                    private String nickName;
                    private String avatarUrl;
                    private Integer vipType;
                    private Integer userType;
                    private Integer authStatus;

                    public Integer getUserId() {
                        return userId;
                    }

                    public void setUserId(Integer userId) {
                        this.userId = userId;
                    }

                    public String getNickName() {
                        return nickName;
                    }

                    public void setNickName(String nickName) {
                        this.nickName = nickName;
                    }

                    public String getAvatarUrl() {
                        return avatarUrl;
                    }

                    public void setAvatarUrl(String avatarUrl) {
                        this.avatarUrl = avatarUrl;
                    }

                    public Integer getVipType() {
                        return vipType;
                    }

                    public void setVipType(Integer vipType) {
                        this.vipType = vipType;
                    }

                    public Integer getUserType() {
                        return userType;
                    }

                    public void setUserType(Integer userType) {
                        this.userType = userType;
                    }

                    public Integer getAuthStatus() {
                        return authStatus;
                    }

                    public void setAuthStatus(Integer authStatus) {
                        this.authStatus = authStatus;
                    }
                }
            }

            public static class CreatorBean {
                private boolean defaultAvatar;
                private long province;
                private int authStatus;
                private boolean followed;
                private String avatarUrl;
                private int accountStatus;
                private int gender;
                private long city;
                private long birthday;
                private long userId;
                private int userType;
                private String nickname;
                private String signature;
                private String description;
                private String detailDescription;
                private String backgroundUrl;
                private String backgroundImgIdStr;
                private String avatarImgIdStr;

                public boolean isDefaultAvatar() {
                    return defaultAvatar;
                }

                public void setDefaultAvatar(boolean defaultAvatar) {
                    this.defaultAvatar = defaultAvatar;
                }

                public long getProvince() {
                    return province;
                }

                public void setProvince(long province) {
                    this.province = province;
                }

                public int getAuthStatus() {
                    return authStatus;
                }

                public void setAuthStatus(int authStatus) {
                    this.authStatus = authStatus;
                }

                public boolean isFollowed() {
                    return followed;
                }

                public void setFollowed(boolean followed) {
                    this.followed = followed;
                }

                public String getAvatarUrl() {
                    return avatarUrl;
                }

                public void setAvatarUrl(String avatarUrl) {
                    this.avatarUrl = avatarUrl;
                }

                public int getAccountStatus() {
                    return accountStatus;
                }

                public void setAccountStatus(int accountStatus) {
                    this.accountStatus = accountStatus;
                }

                public int getGender() {
                    return gender;
                }

                public void setGender(int gender) {
                    this.gender = gender;
                }

                public long getCity() {
                    return city;
                }

                public void setCity(long city) {
                    this.city = city;
                }

                public long getBirthday() {
                    return birthday;
                }

                public void setBirthday(long birthday) {
                    this.birthday = birthday;
                }

                public long getUserId() {
                    return userId;
                }

                public void setUserId(long userId) {
                    this.userId = userId;
                }

                public int getUserType() {
                    return userType;
                }

                public void setUserType(int userType) {
                    this.userType = userType;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getSignature() {
                    return signature;
                }

                public void setSignature(String signature) {
                    this.signature = signature;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getDetailDescription() {
                    return detailDescription;
                }

                public void setDetailDescription(String detailDescription) {
                    this.detailDescription = detailDescription;
                }

                public String getBackgroundUrl() {
                    return backgroundUrl;
                }

                public void setBackgroundUrl(String backgroundUrl) {
                    this.backgroundUrl = backgroundUrl;
                }

                public String getBackgroundImgIdStr() {
                    return backgroundImgIdStr;
                }

                public void setBackgroundImgIdStr(String backgroundImgIdStr) {
                    this.backgroundImgIdStr = backgroundImgIdStr;
                }

                public String getAvatarImgIdStr() {
                    return avatarImgIdStr;
                }

                public void setAvatarImgIdStr(String avatarImgIdStr) {
                    this.avatarImgIdStr = avatarImgIdStr;
                }
            }

            public static class UrlInfoBean {
                private String id;
                private String url;
                private long size;
                private long validityTime;
                private boolean needPay;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public long getSize() {
                    return size;
                }

                public void setSize(long size) {
                    this.size = size;
                }

                public long getValidityTime() {
                    return validityTime;
                }

                public void setValidityTime(long validityTime) {
                    this.validityTime = validityTime;
                }

                public boolean isNeedPay() {
                    return needPay;
                }

                public void setNeedPay(boolean needPay) {
                    this.needPay = needPay;
                }
            }

            public static class ResolutionsBean {
                private int resolution;
                private long size;

                public int getResolution() {
                    return resolution;
                }

                public void setResolution(int resolution) {
                    this.resolution = resolution;
                }

                public long getSize() {
                    return size;
                }

                public void setSize(long size) {
                    this.size = size;
                }
            }

            public static class VideoGroupBean {
                private int id;
                private String name;

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
            }

            public static class RelateSongBean {
                @SerializedName("name")
                private String songName;
                private Integer id;
                @SerializedName("ar")
                private List<ArtistBean> artists;
                @SerializedName("al")
                private AlbumBean album;

                public String getSongName() {
                    return songName;
                }

                public void setSongName(String songName) {
                    this.songName = songName;
                }

                public List<ArtistBean> getArtists() {
                    return artists;
                }

                public void setArtists(List<ArtistBean> artists) {
                    this.artists = artists;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public AlbumBean getAlbum() {
                    return album;
                }

                public void setAlbum(AlbumBean album) {
                    this.album = album;
                }

                public static class AlbumBean {
                    private long id;
                    @SerializedName("name")
                    private String songName;
                    private String picUrl;
                    private String pic_str;

                    public long getId() {
                        return id;
                    }

                    public void setId(long id) {
                        this.id = id;
                    }

                    public String getSongName() {
                        return songName;
                    }

                    public void setSongName(String songName) {
                        this.songName = songName;
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
                }

                public static  class ArtistBean{
                    private long id;
                    @SerializedName("name")
                    private String singerName;

                    public long getId() {
                        return id;
                    }

                    public void setId(long id) {
                        this.id = id;
                    }

                    public String getSingerName() {
                        return singerName;
                    }

                    public void setSingerName(String singerName) {
                        this.singerName = singerName;
                    }
                }
            }
        }
    }
}
