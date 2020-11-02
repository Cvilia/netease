package com.cvilia.netease.bean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/27
 * describe：描述
 */
public class Fans {

    /**
     * code : 200
     * more : false
     * followeds : [{"py":"ymztde","time":1603766600899,"follows":4,"followeds":0,"remarkName":null,"nickname":"玉米煮土豆儿","mutual":false,"accountStatus":0,"avatarDetail":null,"authStatus":0,"gender":2,"expertTags":null,"experts":null,"userId":3950862642,"vipType":0,"avatarUrl":"http://p1.music.126.net/tPYgE8X8HJPx-SUZpJ0W7g==/109951165418386815.jpg","followed":false,"userType":0,"signature":"豆儿","eventCount":0,"playlistCount":1}]
     */

    private int code;
    private boolean more;
    private List<FollowedsBean> followeds;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public List<FollowedsBean> getFolloweds() {
        return followeds;
    }

    public void setFolloweds(List<FollowedsBean> followeds) {
        this.followeds = followeds;
    }

    public static class FollowedsBean {
        /**
         * py : ymztde
         * time : 1603766600899
         * follows : 4
         * followeds : 0
         * remarkName : null
         * nickname : 玉米煮土豆儿
         * mutual : false
         * accountStatus : 0
         * avatarDetail : null
         * authStatus : 0
         * gender : 2
         * expertTags : null
         * experts : null
         * userId : 3950862642
         * vipType : 0
         * avatarUrl : http://p1.music.126.net/tPYgE8X8HJPx-SUZpJ0W7g==/109951165418386815.jpg
         * followed : false
         * userType : 0
         * signature : 豆儿
         * eventCount : 0
         * playlistCount : 1
         */

        private String py;
        private long time;
        private int follows;
        private int followeds;
        private Object remarkName;
        private String nickname;
        private boolean mutual;
        private int accountStatus;
        private Object avatarDetail;
        private int authStatus;
        private int gender;
        private Object expertTags;
        private Object experts;
        private long userId;
        private int vipType;
        private String avatarUrl;
        private boolean followed;
        private int userType;
        private String signature;
        private int eventCount;
        private int playlistCount;

        public String getPy() {
            return py;
        }

        public void setPy(String py) {
            this.py = py;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
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

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
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

        public Object getAvatarDetail() {
            return avatarDetail;
        }

        public void setAvatarDetail(Object avatarDetail) {
            this.avatarDetail = avatarDetail;
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

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
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

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
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
    }
}
