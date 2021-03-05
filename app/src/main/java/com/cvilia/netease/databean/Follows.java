package com.cvilia.netease.databean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/27
 * describe：用户关注实体类
 */
public class Follows {
    /**
     * follow : [{"py":"xlcf","time":0,"vipType":11,"follows":26,"followeds":120847,"remarkName":null,"authStatus":1,"gender":0,"expertTags":null,"experts":null,"mutual":false,"accountStatus":0,"avatarUrl":"http://p2.music.126.net/vQwnsxGoxKjgVUasVk5NnA==/109951165235602333.jpg","nickname":"新乐尘符","followed":true,"userType":4,"avatarDetail":{"userType":4,"identityLevel":null,"identityIconUrl":"https://p6.music.126.net/obj/wo3DlcOGw6DClTvDisK1/4446731426/3450/28dd/a428/61e423de0df3790d9b38649f3640c12a.png"},"userId":528023968,"signature":"新乐尘符，一个致力于流行音乐厂牌建设的原创音乐社团。","vipRights":{"associator":{"vipCode":100,"rights":true},"musicPackage":null,"redVipAnnualCount":1,"redVipLevel":0},"blacklist":false,"eventCount":221,"playlistCount":4},{"py":"hat","time":0,"vipType":0,"follows":5,"followeds":22199,"remarkName":null,"authStatus":1,"gender":2,"expertTags":null,"experts":null,"mutual":false,"accountStatus":0,"avatarUrl":"http://p2.music.126.net/19dmV6Y4b6-k8YfvO_IvdA==/109951164411923732.jpg","nickname":"胡艾彤","followed":true,"userType":4,"avatarDetail":{"userType":4,"identityLevel":null,"identityIconUrl":"https://p6.music.126.net/obj/wo3DlcOGw6DClTvDisK1/4446731426/3450/28dd/a428/61e423de0df3790d9b38649f3640c12a.png"},"userId":447420076,"signature":"原创歌手 代表作(大叔不要跑,大圈圈,樱树花）","vipRights":{"associator":null,"musicPackage":null,"redVipAnnualCount":-1,"redVipLevel":0},"blacklist":false,"eventCount":75,"playlistCount":6},{"py":"xyztyx","time":0,"vipType":11,"follows":46,"followeds":11,"remarkName":null,"authStatus":0,"gender":2,"expertTags":null,"experts":null,"mutual":false,"accountStatus":0,"avatarUrl":"http://p2.music.126.net/FY37NBaEWqHWi89P516N5A==/1413971969140590.jpg","nickname":"相遇在太阳系","followed":true,"userType":0,"avatarDetail":null,"userId":336869044,"signature":"花果山扛把子","vipRights":{"associator":{"vipCode":100,"rights":true},"musicPackage":null,"redVipAnnualCount":1,"redVipLevel":0},"blacklist":false,"eventCount":3,"playlistCount":10},{"py":"MTkoala","time":0,"vipType":11,"follows":4,"followeds":74425,"remarkName":null,"authStatus":0,"gender":2,"expertTags":null,"experts":null,"mutual":false,"accountStatus":0,"avatarUrl":"http://p2.music.126.net/jMxtqXPFJsnbrpRXoOdBOw==/109951164204910038.jpg","nickname":"MTkoala","followed":true,"userType":0,"avatarDetail":null,"userId":118113993,"signature":"晚安，好梦~@MTkoala","vipRights":{"associator":{"vipCode":100,"rights":true},"musicPackage":null,"redVipAnnualCount":1,"redVipLevel":0},"blacklist":false,"eventCount":152,"playlistCount":20},{"py":"cyqac","time":0,"vipType":11,"follows":19,"followeds":585648,"remarkName":null,"authStatus":1,"gender":2,"expertTags":null,"experts":null,"mutual":false,"accountStatus":0,"avatarUrl":"http://p2.music.126.net/JDrYK3GpfebNIdtg5Y4GzQ==/109951164722479886.jpg","nickname":"陈壹千ac","followed":true,"userType":4,"avatarDetail":{"userType":4,"identityLevel":null,"identityIconUrl":"https://p6.music.126.net/obj/wo3DlcOGw6DClTvDisK1/4446731426/3450/28dd/a428/61e423de0df3790d9b38649f3640c12a.png"},"userId":102113052,"signature":"Dark but Kind. 邮箱：amyyiqian@163.com","vipRights":{"associator":{"vipCode":100,"rights":true},"musicPackage":null,"redVipAnnualCount":1,"redVipLevel":0},"blacklist":false,"eventCount":35,"playlistCount":8}]
     * touchCount : 0
     * more : false
     * code : 200
     */

    private int touchCount;
    private boolean more;
    private int code;
    private List<FollowBean> follow;

    public int getTouchCount() {
        return touchCount;
    }

    public void setTouchCount(int touchCount) {
        this.touchCount = touchCount;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<FollowBean> getFollow() {
        return follow;
    }

    public void setFollow(List<FollowBean> follow) {
        this.follow = follow;
    }

    public static class FollowBean {
        /**
         * py : xlcf
         * time : 0
         * vipType : 11
         * follows : 26
         * followeds : 120847
         * remarkName : null
         * authStatus : 1
         * gender : 0
         * expertTags : null
         * experts : null
         * mutual : false
         * accountStatus : 0
         * avatarUrl : http://p2.music.126.net/vQwnsxGoxKjgVUasVk5NnA==/109951165235602333.jpg
         * nickname : 新乐尘符
         * followed : true
         * userType : 4
         * avatarDetail : {"userType":4,"identityLevel":null,"identityIconUrl":"https://p6.music.126.net/obj/wo3DlcOGw6DClTvDisK1/4446731426/3450/28dd/a428/61e423de0df3790d9b38649f3640c12a.png"}
         * userId : 528023968
         * signature : 新乐尘符，一个致力于流行音乐厂牌建设的原创音乐社团。
         * vipRights : {"associator":{"vipCode":100,"rights":true},"musicPackage":null,"redVipAnnualCount":1,"redVipLevel":0}
         * blacklist : false
         * eventCount : 221
         * playlistCount : 4
         */

        private String py;
        private int time;
        private int vipType;
        private int follows;
        private int followeds;
        private Object remarkName;
        private int authStatus;
        private int gender;
        private Object expertTags;
        private Object experts;
        private boolean mutual;
        private int accountStatus;
        private String avatarUrl;
        private String nickname;
        private boolean followed;
        private int userType;
        private AvatarDetailBean avatarDetail;
        private int userId;
        private String signature;
        private VipRightsBean vipRights;
        private boolean blacklist;
        private int eventCount;
        private int playlistCount;

        public String getPy() {
            return py;
        }

        public void setPy(String py) {
            this.py = py;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getFollows() {
            return follows;
        }

        public void setFollows(int follows) {
            this.follows = follows;
        }

        public int getFolloweds() {
            return followeds;
        }

        public void setFolloweds(int followeds) {
            this.followeds = followeds;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public int getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
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

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public int getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public AvatarDetailBean getAvatarDetail() {
            return avatarDetail;
        }

        public void setAvatarDetail(AvatarDetailBean avatarDetail) {
            this.avatarDetail = avatarDetail;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public VipRightsBean getVipRights() {
            return vipRights;
        }

        public void setVipRights(VipRightsBean vipRights) {
            this.vipRights = vipRights;
        }

        public boolean isBlacklist() {
            return blacklist;
        }

        public void setBlacklist(boolean blacklist) {
            this.blacklist = blacklist;
        }

        public int getEventCount() {
            return eventCount;
        }

        public void setEventCount(int eventCount) {
            this.eventCount = eventCount;
        }

        public int getPlaylistCount() {
            return playlistCount;
        }

        public void setPlaylistCount(int playlistCount) {
            this.playlistCount = playlistCount;
        }

        public static class AvatarDetailBean {
            /**
             * userType : 4
             * identityLevel : null
             * identityIconUrl : https://p6.music.126.net/obj/wo3DlcOGw6DClTvDisK1/4446731426/3450/28dd/a428/61e423de0df3790d9b38649f3640c12a.png
             */

            private int userType;
            private Object identityLevel;
            private String identityIconUrl;

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public Object getIdentityLevel() {
                return identityLevel;
            }

            public void setIdentityLevel(Object identityLevel) {
                this.identityLevel = identityLevel;
            }

            public String getIdentityIconUrl() {
                return identityIconUrl;
            }

            public void setIdentityIconUrl(String identityIconUrl) {
                this.identityIconUrl = identityIconUrl;
            }
        }

        public static class VipRightsBean {
            /**
             * associator : {"vipCode":100,"rights":true}
             * musicPackage : null
             * redVipAnnualCount : 1
             * redVipLevel : 0
             */

            private AssociatorBean associator;
            private Object musicPackage;
            private int redVipAnnualCount;
            private int redVipLevel;

            public AssociatorBean getAssociator() {
                return associator;
            }

            public void setAssociator(AssociatorBean associator) {
                this.associator = associator;
            }

            public Object getMusicPackage() {
                return musicPackage;
            }

            public void setMusicPackage(Object musicPackage) {
                this.musicPackage = musicPackage;
            }

            public int getRedVipAnnualCount() {
                return redVipAnnualCount;
            }

            public void setRedVipAnnualCount(int redVipAnnualCount) {
                this.redVipAnnualCount = redVipAnnualCount;
            }

            public int getRedVipLevel() {
                return redVipLevel;
            }

            public void setRedVipLevel(int redVipLevel) {
                this.redVipLevel = redVipLevel;
            }

            public static class AssociatorBean {
                /**
                 * vipCode : 100
                 * rights : true
                 */

                private int vipCode;
                private boolean rights;

                public int getVipCode() {
                    return vipCode;
                }

                public void setVipCode(int vipCode) {
                    this.vipCode = vipCode;
                }

                public boolean isRights() {
                    return rights;
                }

                public void setRights(boolean rights) {
                    this.rights = rights;
                }
            }
        }
    }
}
