package com.cvilia.netease.databean;

import java.io.Serializable;
import java.util.List;

/**
 * author: lzy
 * date: 2020/10/26
 * describe：用户歌单实体类
 */
public class PlayList implements Serializable{


    /**
     * version : 1603697854288
     * more : false
     * playlist : [{"subscribers":[],"subscribed":false,"creator":{"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/Uod614kFPptcj661BPLsOg==/109951165380951600.jpg","accountStatus":0,"gender":1,"city":110101,"birthday":749404800000,"userId":122121024,"userType":0,"nickname":"麻辣炖土豆儿","signature":"爱音乐爱自己","description":"","detailDescription":"","avatarImgId":109951165380951600,"backgroundImgId":2002210674180201,"backgroundUrl":"http://p1.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"authenticationTypes":0,"avatarDetail":null,"avatarImgIdStr":"109951165380951600","backgroundImgIdStr":"2002210674180201","anchor":false,"avatarImgId_str":"109951165380951600"},"artists":null,"tracks":null,"updateFrequency":null,"backgroundCoverId":0,"backgroundCoverUrl":null,"titleImage":0,"titleImageUrl":null,"englishTitle":null,"opRecommend":false,"recommendInfo":null,"adType":0,"trackNumberUpdateTime":1603702223262,"cloudTrackCount":0,"subscribedCount":0,"userId":122121024,"createTime":1452363679834,"highQuality":false,"coverImgId":109951164538644880,"updateTime":1603702223262,"newImported":false,"anonimous":false,"specialType":5,"coverImgUrl":"https://p1.music.126.net/ySkXVGx8UQluAjUEl00FAQ==/109951164538644886.jpg","trackCount":67,"commentThreadId":"A_PL_0_151913658","totalDuration":0,"privacy":0,"trackUpdateTime":1603702223333,"playCount":611,"ordered":false,"tags":[],"description":null,"status":0,"name":"麻辣炖土豆儿喜欢的音乐","id":151913658,"coverImgId_str":"109951164538644886"},{"subscribers":[],"subscribed":false,"creator":{"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/Uod614kFPptcj661BPLsOg==/109951165380951600.jpg","accountStatus":0,"gender":1,"city":110101,"birthday":749404800000,"userId":122121024,"userType":0,"nickname":"麻辣炖土豆儿","signature":"爱音乐爱自己","description":"","detailDescription":"","avatarImgId":109951165380951600,"backgroundImgId":2002210674180201,"backgroundUrl":"http://p1.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"authenticationTypes":0,"avatarDetail":null,"avatarImgIdStr":"109951165380951600","backgroundImgIdStr":"2002210674180201","anchor":false,"avatarImgId_str":"109951165380951600"},"artists":null,"tracks":null,"updateFrequency":null,"backgroundCoverId":0,"backgroundCoverUrl":null,"titleImage":0,"titleImageUrl":null,"englishTitle":null,"opRecommend":false,"recommendInfo":null,"adType":0,"trackNumberUpdateTime":1603697854292,"cloudTrackCount":0,"subscribedCount":0,"userId":122121024,"createTime":1603697854087,"highQuality":false,"coverImgId":775155697589585,"updateTime":1603697854292,"newImported":false,"anonimous":false,"specialType":0,"coverImgUrl":"https://p1.music.126.net/w-4zLaVyFZ7I01fZQflKrQ==/775155697589585.jpg","trackCount":33,"commentThreadId":"A_PL_0_5305885517","totalDuration":0,"privacy":0,"trackUpdateTime":1603697854422,"playCount":0,"ordered":false,"tags":[],"description":null,"status":0,"name":"冷门歌曲","id":5305885517},{"subscribers":[],"subscribed":false,"creator":{"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/Uod614kFPptcj661BPLsOg==/109951165380951600.jpg","accountStatus":0,"gender":1,"city":110101,"birthday":749404800000,"userId":122121024,"userType":0,"nickname":"麻辣炖土豆儿","signature":"爱音乐爱自己","description":"","detailDescription":"","avatarImgId":109951165380951600,"backgroundImgId":2002210674180201,"backgroundUrl":"http://p1.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"authenticationTypes":0,"avatarDetail":null,"avatarImgIdStr":"109951165380951600","backgroundImgIdStr":"2002210674180201","anchor":false,"avatarImgId_str":"109951165380951600"},"artists":null,"tracks":null,"updateFrequency":null,"backgroundCoverId":0,"backgroundCoverUrl":null,"titleImage":0,"titleImageUrl":null,"englishTitle":null,"opRecommend":false,"recommendInfo":null,"adType":0,"trackNumberUpdateTime":1598858315946,"cloudTrackCount":0,"subscribedCount":0,"userId":122121024,"createTime":1598858304303,"highQuality":false,"coverImgId":109951165277244560,"updateTime":1598858315946,"newImported":false,"anonimous":false,"specialType":0,"coverImgUrl":"https://p1.music.126.net/AsYP7LuaUrQ6SLU2n7_UUg==/109951165277244562.jpg","trackCount":1,"commentThreadId":"A_PL_0_5212848386","totalDuration":0,"privacy":0,"trackUpdateTime":1598858316026,"playCount":4,"ordered":false,"tags":["工作"],"description":"音乐让工作更轻松","status":0,"name":"边跳舞边工作","id":5212848386,"coverImgId_str":"109951165277244562"},{"subscribers":[],"subscribed":true,"creator":{"defaultAvatar":false,"province":1000000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/ThQ3hgMobH_csWGj0b-pBQ==/109951165341416500.jpg","accountStatus":0,"gender":1,"city":1005500,"birthday":868291200000,"userId":348669869,"userType":200,"nickname":"友Xyi","signature":"好想回到旧年城墙 \n听一曲你歌声悠扬 \n素白纱衣打落在我的胸膛 \n带着软软的坚强 \n梨花飞舞的江南雨上 \n谁的温柔倾洒了你的泪光 \n青苔布满在小河石旁 \n你说想和他到地久天长 \n我知道我们所有过往抵不过时光 \n岁月会让你温柔的把它轻轻遗忘 \n戏子站在落幕的舞台上 \n曲终过后便是人走茶凉","description":"","detailDescription":"","avatarImgId":109951165341416500,"backgroundImgId":109951165341404910,"backgroundUrl":"http://p1.music.126.net/NWu1-hWWg5lM7Ai1BiAMnQ==/109951165341404908.jpg","authority":0,"mutual":false,"expertTags":["日语","流行"],"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"authenticationTypes":64,"avatarDetail":null,"avatarImgIdStr":"109951165341416500","backgroundImgIdStr":"109951165341404908","anchor":false,"avatarImgId_str":"109951165341416500"},"artists":null,"tracks":null,"updateFrequency":null,"backgroundCoverId":0,"backgroundCoverUrl":null,"titleImage":0,"titleImageUrl":null,"englishTitle":null,"opRecommend":false,"recommendInfo":null,"adType":0,"trackNumberUpdateTime":1539333360940,"cloudTrackCount":0,"subscribedCount":45695,"userId":348669869,"createTime":1502808648179,"highQuality":false,"coverImgId":18659811836927690,"updateTime":1578576307456,"newImported":false,"anonimous":false,"specialType":0,"coverImgUrl":"https://p1.music.126.net/rqPmf8Mcb7kjbpjXf6W9vw==/18659811836927690.jpg","trackCount":40,"commentThreadId":"A_PL_0_881727022","totalDuration":0,"privacy":0,"trackUpdateTime":1596093728181,"playCount":1635916,"ordered":true,"tags":["日语","R&B/Soul"],"description":"第16期：\n封面原图p站：31745815\n封面画师：藤丸\n\nby：友Xyi\n这是我很久以前的歌单，一直没有上过推荐，这次上了 我很高兴的，也谢谢大家一直以来的支持，重复的歌曲也很正常 因为我做了很久了，看下创建时间就知道了。\n\n两个黄鹂鸣翠柳，你还是没有女朋友。\n　　雌雄双兔傍地走，你还是没有女朋友。\n　　一江春风向东流，你还是没有女朋友。\n　　问君能有几多愁，你还是没有女朋友。\n　　抽刀断水水更流，你还是没有女朋友。\n　　举杯消愁愁更愁，你还是没有女朋友。\n　　路见不平一声吼，你还是没有女朋友。\n　　此曲只应天上有，你还是没有女朋友。\n　　我也是条。。单。。身。。狗。。","status":0,"name":"赌一个女朋友 : 这40首R&B不好听算我输！","id":881727022,"coverImgId_str":"18659811836927690"},{"subscribers":[],"subscribed":true,"creator":{"defaultAvatar":false,"province":370000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/Q7jXZyhbPG3uoTXmFKslrg==/109951163172046213.jpg","accountStatus":0,"gender":1,"city":370600,"birthday":768586718959,"userId":19981422,"userType":0,"nickname":"happyclap","signature":"我只想要稳稳的幸福，能用双手去触碰。","description":"","detailDescription":"","avatarImgId":109951163172046200,"backgroundImgId":109951163172042480,"backgroundUrl":"http://p1.music.126.net/F1ydU4arOp0uURb0zCWGQQ==/109951163172042484.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":11,"remarkName":null,"authenticationTypes":0,"avatarDetail":null,"avatarImgIdStr":"109951163172046213","backgroundImgIdStr":"109951163172042484","anchor":false,"avatarImgId_str":"109951163172046213"},"artists":null,"tracks":null,"updateFrequency":null,"backgroundCoverId":0,"backgroundCoverUrl":null,"titleImage":0,"titleImageUrl":null,"englishTitle":null,"opRecommend":false,"recommendInfo":null,"adType":0,"trackNumberUpdateTime":1414589930206,"cloudTrackCount":0,"subscribedCount":4167,"userId":19981422,"createTime":1407831856663,"highQuality":false,"coverImgId":8919238324646024,"updateTime":1578593802299,"newImported":false,"anonimous":false,"specialType":0,"coverImgUrl":"https://p1.music.126.net/biFpy_-9r--HEqaiTk2atA==/8919238324646024.jpg","trackCount":23,"commentThreadId":"A_PL_0_24491727","totalDuration":0,"privacy":0,"trackUpdateTime":1603179843625,"playCount":275926,"ordered":true,"tags":["摇滚","电子","游戏"],"description":"懂的人进！！","status":0,"name":"狂野飙车8：极速凌云","id":24491727}]
     * code : 200
     */

    private String version;
    private Boolean more;
    private Integer code;
    private List<PlaylistBean> playlist;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean isMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<PlaylistBean> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<PlaylistBean> playlist) {
        this.playlist = playlist;
    }

    public static class PlaylistBean implements Serializable {
        /**
         * subscribers : []
         * subscribed : false
         * creator : {"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/Uod614kFPptcj661BPLsOg==/109951165380951600.jpg","accountStatus":0,"gender":1,"city":110101,"birthday":749404800000,"userId":122121024,"userType":0,"nickname":"麻辣炖土豆儿","signature":"爱音乐爱自己","description":"","detailDescription":"","avatarImgId":109951165380951600,"backgroundImgId":2002210674180201,"backgroundUrl":"http://p1.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"authenticationTypes":0,"avatarDetail":null,"avatarImgIdStr":"109951165380951600","backgroundImgIdStr":"2002210674180201","anchor":false,"avatarImgId_str":"109951165380951600"}
         * artists : null
         * tracks : null
         * updateFrequency : null
         * backgroundCoverId : 0
         * backgroundCoverUrl : null
         * titleImage : 0
         * titleImageUrl : null
         * englishTitle : null
         * opRecommend : false
         * recommendInfo : null
         * adType : 0
         * trackNumberUpdateTime : 1603702223262
         * cloudTrackCount : 0
         * subscribedCount : 0
         * userId : 122121024
         * createTime : 1452363679834
         * highQuality : false
         * coverImgId : 109951164538644880
         * updateTime : 1603702223262
         * newImported : false
         * anonimous : false
         * specialType : 5
         * coverImgUrl : https://p1.music.126.net/ySkXVGx8UQluAjUEl00FAQ==/109951164538644886.jpg
         * trackCount : 67
         * commentThreadId : A_PL_0_151913658
         * totalDuration : 0
         * privacy : 0
         * trackUpdateTime : 1603702223333
         * playCount : 611
         * ordered : false
         * tags : []
         * description : null
         * status : 0
         * name : 麻辣炖土豆儿喜欢的音乐
         * id : 151913658
         * coverImgId_str : 109951164538644886
         */

        private Boolean subscribed;
        private CreatorBean creator;
        private Object artists;
        private Object tracks;
        private Object updateFrequency;
        private Integer backgroundCoverId;
        private Object backgroundCoverUrl;
        private Integer titleImage;
        private Object titleImageUrl;
        private Object englishTitle;
        private Boolean opRecommend;
        private Object recommendInfo;
        private Integer adType;
        private Long trackNumberUpdateTime;
        private Integer cloudTrackCount;
        private Integer subscribedCount;
        private Integer userId;
        private Long createTime;
        private Boolean highQuality;
        private Long coverImgId;
        private Long updateTime;
        private Boolean newImported;
        private Boolean anonimous;
        private Integer specialType;
        private String coverImgUrl;
        private Integer trackCount;
        private String commentThreadId;
        private Integer totalDuration;
        private Integer privacy;
        private Long trackUpdateTime;
        private Integer playCount;
        private Boolean ordered;
        private Object description;
        private Integer status;
        private String name;
        private Integer id;
        private String coverImgId_str;
        private List<?> subscribers;
        private List<?> tags;

        public Boolean isSubscribed() {
            return subscribed;
        }

        public void setSubscribed(Boolean subscribed) {
            this.subscribed = subscribed;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public Object getArtists() {
            return artists;
        }

        public void setArtists(Object artists) {
            this.artists = artists;
        }

        public Object getTracks() {
            return tracks;
        }

        public void setTracks(Object tracks) {
            this.tracks = tracks;
        }

        public Object getUpdateFrequency() {
            return updateFrequency;
        }

        public void setUpdateFrequency(Object updateFrequency) {
            this.updateFrequency = updateFrequency;
        }

        public Integer getBackgroundCoverId() {
            return backgroundCoverId;
        }

        public void setBackgroundCoverId(Integer backgroundCoverId) {
            this.backgroundCoverId = backgroundCoverId;
        }

        public Object getBackgroundCoverUrl() {
            return backgroundCoverUrl;
        }

        public void setBackgroundCoverUrl(Object backgroundCoverUrl) {
            this.backgroundCoverUrl = backgroundCoverUrl;
        }

        public Integer getTitleImage() {
            return titleImage;
        }

        public void setTitleImage(Integer titleImage) {
            this.titleImage = titleImage;
        }

        public Object getTitleImageUrl() {
            return titleImageUrl;
        }

        public void setTitleImageUrl(Object titleImageUrl) {
            this.titleImageUrl = titleImageUrl;
        }

        public Object getEnglishTitle() {
            return englishTitle;
        }

        public void setEnglishTitle(Object englishTitle) {
            this.englishTitle = englishTitle;
        }

        public Boolean isOpRecommend() {
            return opRecommend;
        }

        public void setOpRecommend(Boolean opRecommend) {
            this.opRecommend = opRecommend;
        }

        public Object getRecommendInfo() {
            return recommendInfo;
        }

        public void setRecommendInfo(Object recommendInfo) {
            this.recommendInfo = recommendInfo;
        }

        public Integer getAdType() {
            return adType;
        }

        public void setAdType(Integer adType) {
            this.adType = adType;
        }

        public Long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(Long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public Integer getCloudTrackCount() {
            return cloudTrackCount;
        }

        public void setCloudTrackCount(Integer cloudTrackCount) {
            this.cloudTrackCount = cloudTrackCount;
        }

        public Integer getSubscribedCount() {
            return subscribedCount;
        }

        public void setSubscribedCount(Integer subscribedCount) {
            this.subscribedCount = subscribedCount;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(Boolean highQuality) {
            this.highQuality = highQuality;
        }

        public Long getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(Long coverImgId) {
            this.coverImgId = coverImgId;
        }

        public Long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }

        public Boolean isNewImported() {
            return newImported;
        }

        public void setNewImported(Boolean newImported) {
            this.newImported = newImported;
        }

        public Boolean isAnonimous() {
            return anonimous;
        }

        public void setAnonimous(Boolean anonimous) {
            this.anonimous = anonimous;
        }

        public Integer getSpecialType() {
            return specialType;
        }

        public void setSpecialType(Integer specialType) {
            this.specialType = specialType;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public Integer getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(Integer trackCount) {
            this.trackCount = trackCount;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public Integer getTotalDuration() {
            return totalDuration;
        }

        public void setTotalDuration(Integer totalDuration) {
            this.totalDuration = totalDuration;
        }

        public Integer getPrivacy() {
            return privacy;
        }

        public void setPrivacy(Integer privacy) {
            this.privacy = privacy;
        }

        public Long getTrackUpdateTime() {
            return trackUpdateTime;
        }

        public void setTrackUpdateTime(Long trackUpdateTime) {
            this.trackUpdateTime = trackUpdateTime;
        }

        public Integer getPlayCount() {
            return playCount;
        }

        public void setPlayCount(Integer playCount) {
            this.playCount = playCount;
        }

        public Boolean isOrdered() {
            return ordered;
        }

        public void setOrdered(Boolean ordered) {
            this.ordered = ordered;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCoverImgId_str() {
            return coverImgId_str;
        }

        public void setCoverImgId_str(String coverImgId_str) {
            this.coverImgId_str = coverImgId_str;
        }

        public List<?> getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(List<?> subscribers) {
            this.subscribers = subscribers;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        public static class CreatorBean implements Serializable {
            /**
             * defaultAvatar : false
             * province : 110000
             * authStatus : 0
             * followed : false
             * avatarUrl : http://p1.music.126.net/Uod614kFPptcj661BPLsOg==/109951165380951600.jpg
             * accountStatus : 0
             * gender : 1
             * city : 110101
             * birthday : 749404800000
             * userId : 122121024
             * userType : 0
             * nickname : 麻辣炖土豆儿
             * signature : 爱音乐爱自己
             * description :
             * detailDescription :
             * avatarImgId : 109951165380951600
             * backgroundImgId : 2002210674180201
             * backgroundUrl : http://p1.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg
             * authority : 0
             * mutual : false
             * expertTags : null
             * experts : null
             * djStatus : 0
             * vipType : 0
             * remarkName : null
             * authenticationTypes : 0
             * avatarDetail : null
             * avatarImgIdStr : 109951165380951600
             * backgroundImgIdStr : 2002210674180201
             * anchor : false
             * avatarImgId_str : 109951165380951600
             */

            private Boolean defaultAvatar;
            private Integer province;
            private Integer authStatus;
            private Boolean followed;
            private String avatarUrl;
            private Integer accountStatus;
            private Integer gender;
            private Integer city;
            private Long birthday;
            private Integer userId;
            private Integer userType;
            private String nickname;
            private String signature;
            private String description;
            private String detailDescription;
            private Long avatarImgId;
            private Long backgroundImgId;
            private String backgroundUrl;
            private Integer authority;
            private Boolean mutual;
            private Object expertTags;
            private Object experts;
            private Integer djStatus;
            private Integer vipType;
            private Object remarkName;
            private Integer authenticationTypes;
            private Object avatarDetail;
            private String avatarImgIdStr;
            private String backgroundImgIdStr;
            private Boolean anchor;
            private String avatarImgId_str;

            public Boolean isDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(Boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }

            public Integer getProvince() {
                return province;
            }

            public void setProvince(Integer province) {
                this.province = province;
            }

            public Integer getAuthStatus() {
                return authStatus;
            }

            public void setAuthStatus(Integer authStatus) {
                this.authStatus = authStatus;
            }

            public Boolean isFollowed() {
                return followed;
            }

            public void setFollowed(Boolean followed) {
                this.followed = followed;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public Integer getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(Integer accountStatus) {
                this.accountStatus = accountStatus;
            }

            public Integer getGender() {
                return gender;
            }

            public void setGender(Integer gender) {
                this.gender = gender;
            }

            public Integer getCity() {
                return city;
            }

            public void setCity(Integer city) {
                this.city = city;
            }

            public Long getBirthday() {
                return birthday;
            }

            public void setBirthday(Long birthday) {
                this.birthday = birthday;
            }

            public Integer getUserId() {
                return userId;
            }

            public void setUserId(Integer userId) {
                this.userId = userId;
            }

            public Integer getUserType() {
                return userType;
            }

            public void setUserType(Integer userType) {
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

            public Long getAvatarImgId() {
                return avatarImgId;
            }

            public void setAvatarImgId(Long avatarImgId) {
                this.avatarImgId = avatarImgId;
            }

            public Long getBackgroundImgId() {
                return backgroundImgId;
            }

            public void setBackgroundImgId(Long backgroundImgId) {
                this.backgroundImgId = backgroundImgId;
            }

            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }

            public Integer getAuthority() {
                return authority;
            }

            public void setAuthority(Integer authority) {
                this.authority = authority;
            }

            public Boolean isMutual() {
                return mutual;
            }

            public void setMutual(Boolean mutual) {
                this.mutual = mutual;
            }

            public Object getExpertTags() {
                return expertTags;
            }

            public void setExpertTags(Object expertTags) {
                this.expertTags = expertTags;
            }

            public Object getExperts() {
                return experts;
            }

            public void setExperts(Object experts) {
                this.experts = experts;
            }

            public Integer getDjStatus() {
                return djStatus;
            }

            public void setDjStatus(Integer djStatus) {
                this.djStatus = djStatus;
            }

            public Integer getVipType() {
                return vipType;
            }

            public void setVipType(Integer vipType) {
                this.vipType = vipType;
            }

            public Object getRemarkName() {
                return remarkName;
            }

            public void setRemarkName(Object remarkName) {
                this.remarkName = remarkName;
            }

            public Integer getAuthenticationTypes() {
                return authenticationTypes;
            }

            public void setAuthenticationTypes(Integer authenticationTypes) {
                this.authenticationTypes = authenticationTypes;
            }

            public Object getAvatarDetail() {
                return avatarDetail;
            }

            public void setAvatarDetail(Object avatarDetail) {
                this.avatarDetail = avatarDetail;
            }

            public String getAvatarImgIdStr() {
                return avatarImgIdStr;
            }

            public void setAvatarImgIdStr(String avatarImgIdStr) {
                this.avatarImgIdStr = avatarImgIdStr;
            }

            public String getBackgroundImgIdStr() {
                return backgroundImgIdStr;
            }

            public void setBackgroundImgIdStr(String backgroundImgIdStr) {
                this.backgroundImgIdStr = backgroundImgIdStr;
            }

            public Boolean isAnchor() {
                return anchor;
            }

            public void setAnchor(Boolean anchor) {
                this.anchor = anchor;
            }

            public String getAvatarImgId_str() {
                return avatarImgId_str;
            }

            public void setAvatarImgId_str(String avatarImgId_str) {
                this.avatarImgId_str = avatarImgId_str;
            }
        }
    }
}
