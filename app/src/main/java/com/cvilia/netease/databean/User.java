package com.cvilia.netease.databean;

import java.util.List;

/**
 * author: lzy
 * date: 2020/10/9
 * describe：登录返回的用户信息
 */
public class User {

    /**
     * account : {"anonimousUser":false,"ban":0,"baoyueVersion":0,"createTime":1452370506953,"donateVersion":0,"id":122121024,"salt":"[B@7c3e3a1e","status":0,"tokenVersion":1,"type":1,"userName":"1_18510909453","vipType":0,"viptypeVersion":0,"whitelistAuthority":0}
     * bindings : [{"bindingTime":1551079487559,"expired":false,"expiresIn":2147483647,"id":6808660939,"refreshTime":1551079487,"tokenJsonStr":"e}","type":1,"url":"","userId":122121024},{"bindingTime":1602301092614,"expired":true,"expiresIn":7200,"id":11117149469,"refreshTime":1602301092,"tokenJsonStr":"","type":10,"url":"","userId":122121024}]
     * code : 200
     * cookie : MUSIC
     * loginType : 0
     * profile : {"accountStatus":0,"authStatus":0,"authority":0,"avatarImgId":109951165380951600,"avatarImgIdStr":"109951165380951600","avatarImgId_str":"109951165380951600","avatarUrl":"https://p3.music.126.net/Uod614kFPptcj661BPLsOg==/109951165380951600.jpg","backgroundImgId":2002210674180201,"backgroundImgIdStr":"2002210674180201","backgroundUrl":"https://p1.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg","birthday":749404800000,"city":110101,"defaultAvatar":false,"description":"","detailDescription":"","djStatus":0,"eventCount":0,"expertTags":null,"experts":{},"followed":false,"followeds":0,"follows":5,"gender":2,"mutual":false,"nickname":"麻辣炖土豆儿","playlistBeSubscribedCount":0,"playlistCount":2,"province":110000,"remarkName":null,"signature":"爱音乐爱自己","userId":122121024,"userType":0,"vipType":0}
     * token : 256fe9cbf3f7ec84ad35d1743aa004095e8978d6bd757cdd8ef8f10d9fb0b0ee0931c3a9fbfe3df2
     */

    private AccountBean account;
    private int code;
    private String cookie;
    private int loginType;
    private ProfileBean profile;
    private String token;
    private List<BindingsBean> bindings;

    public AccountBean getAccount() {
        return account;
    }

    public void setAccount(AccountBean account) {
        this.account = account;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public ProfileBean getProfile() {
        return profile;
    }

    public void setProfile(ProfileBean profile) {
        this.profile = profile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<BindingsBean> getBindings() {
        return bindings;
    }

    public void setBindings(List<BindingsBean> bindings) {
        this.bindings = bindings;
    }

    public static class AccountBean {
        /**
         * anonimousUser : false
         * ban : 0
         * baoyueVersion : 0
         * createTime : 1452370506953
         * donateVersion : 0
         * id : 122121024
         * salt : [B@7c3e3a1e
         * status : 0
         * tokenVersion : 1
         * type : 1
         * userName : 1_18510909453
         * vipType : 0
         * viptypeVersion : 0
         * whitelistAuthority : 0
         */

        private boolean anonimousUser;
        private int ban;
        private int baoyueVersion;
        private long createTime;
        private int donateVersion;
        private int id;
        private String salt;
        private int status;
        private int tokenVersion;
        private int type;
        private String userName;
        private int vipType;
        private int viptypeVersion;
        private int whitelistAuthority;

        public boolean isAnonimousUser() {
            return anonimousUser;
        }

        public void setAnonimousUser(boolean anonimousUser) {
            this.anonimousUser = anonimousUser;
        }

        public int getBan() {
            return ban;
        }

        public void setBan(int ban) {
            this.ban = ban;
        }

        public int getBaoyueVersion() {
            return baoyueVersion;
        }

        public void setBaoyueVersion(int baoyueVersion) {
            this.baoyueVersion = baoyueVersion;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getDonateVersion() {
            return donateVersion;
        }

        public void setDonateVersion(int donateVersion) {
            this.donateVersion = donateVersion;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getTokenVersion() {
            return tokenVersion;
        }

        public void setTokenVersion(int tokenVersion) {
            this.tokenVersion = tokenVersion;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getViptypeVersion() {
            return viptypeVersion;
        }

        public void setViptypeVersion(int viptypeVersion) {
            this.viptypeVersion = viptypeVersion;
        }

        public int getWhitelistAuthority() {
            return whitelistAuthority;
        }

        public void setWhitelistAuthority(int whitelistAuthority) {
            this.whitelistAuthority = whitelistAuthority;
        }
    }

    public static class ProfileBean {
        /**
         * accountStatus : 0
         * authStatus : 0
         * authority : 0
         * avatarImgId : 109951165380951600
         * avatarImgIdStr : 109951165380951600
         * avatarImgId_str : 109951165380951600
         * avatarUrl : https://p3.music.126.net/Uod614kFPptcj661BPLsOg==/109951165380951600.jpg
         * backgroundImgId : 2002210674180201
         * backgroundImgIdStr : 2002210674180201
         * backgroundUrl : https://p1.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg
         * birthday : 749404800000
         * city : 110101
         * defaultAvatar : false
         * description :
         * detailDescription :
         * djStatus : 0
         * eventCount : 0
         * expertTags : null
         * experts : {}
         * followed : false
         * followeds : 0
         * follows : 5
         * gender : 2 = 女 1 = 男 0 = 未知
         * mutual : false
         * nickname : 麻辣炖土豆儿
         * playlistBeSubscribedCount : 0
         * playlistCount : 2
         * province : 110000
         * remarkName : null
         * signature : 爱音乐爱自己
         * userId : 122121024
         * userType : 0
         * vipType : 0
         */

        private int accountStatus;
        private int authStatus;
        private int authority;
        private long avatarImgId;
        private String avatarImgIdStr;
        private String avatarImgId_str;
        private String avatarUrl;
        private long backgroundImgId;
        private String backgroundImgIdStr;
        private String backgroundUrl;
        private long birthday;
        private int city;
        private boolean defaultAvatar;
        private String description;
        private String detailDescription;
        private int djStatus;
        private int eventCount;
        private Object expertTags;
        private ExpertsBean experts;
        private boolean followed;
        private int followeds;
        private int follows;
        private int gender;
        private boolean mutual;
        private String nickname;
        private int playlistBeSubscribedCount;
        private int playlistCount;
        private int province;
        private Object remarkName;
        private String signature;
        private int userId;
        private int userType;
        private int vipType;

        public int getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public int getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }

        public int getAuthority() {
            return authority;
        }

        public void setAuthority(int authority) {
            this.authority = authority;
        }

        public long getAvatarImgId() {
            return avatarImgId;
        }

        public void setAvatarImgId(long avatarImgId) {
            this.avatarImgId = avatarImgId;
        }

        public String getAvatarImgIdStr() {
            return avatarImgIdStr;
        }

        public void setAvatarImgIdStr(String avatarImgIdStr) {
            this.avatarImgIdStr = avatarImgIdStr;
        }

        public String getAvatarImgId_str() {
            return avatarImgId_str;
        }

        public void setAvatarImgId_str(String avatarImgId_str) {
            this.avatarImgId_str = avatarImgId_str;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public long getBackgroundImgId() {
            return backgroundImgId;
        }

        public void setBackgroundImgId(long backgroundImgId) {
            this.backgroundImgId = backgroundImgId;
        }

        public String getBackgroundImgIdStr() {
            return backgroundImgIdStr;
        }

        public void setBackgroundImgIdStr(String backgroundImgIdStr) {
            this.backgroundImgIdStr = backgroundImgIdStr;
        }

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
        }

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public boolean isDefaultAvatar() {
            return defaultAvatar;
        }

        public void setDefaultAvatar(boolean defaultAvatar) {
            this.defaultAvatar = defaultAvatar;
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

        public int getDjStatus() {
            return djStatus;
        }

        public void setDjStatus(int djStatus) {
            this.djStatus = djStatus;
        }

        public int getEventCount() {
            return eventCount;
        }

        public void setEventCount(int eventCount) {
            this.eventCount = eventCount;
        }

        public Object getExpertTags() {
            return expertTags;
        }

        public void setExpertTags(Object expertTags) {
            this.expertTags = expertTags;
        }

        public ExpertsBean getExperts() {
            return experts;
        }

        public void setExperts(ExpertsBean experts) {
            this.experts = experts;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public int getFolloweds() {
            return followeds;
        }

        public void setFolloweds(int followeds) {
            this.followeds = followeds;
        }

        public int getFollows() {
            return follows;
        }

        public void setFollows(int follows) {
            this.follows = follows;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getPlaylistBeSubscribedCount() {
            return playlistBeSubscribedCount;
        }

        public void setPlaylistBeSubscribedCount(int playlistBeSubscribedCount) {
            this.playlistBeSubscribedCount = playlistBeSubscribedCount;
        }

        public int getPlaylistCount() {
            return playlistCount;
        }

        public void setPlaylistCount(int playlistCount) {
            this.playlistCount = playlistCount;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public static class ExpertsBean {
        }
    }

    public static class BindingsBean {
        /**
         * bindingTime : 1551079487559
         * expired : false
         * expiresIn : 2147483647
         * id : 6808660939
         * refreshTime : 1551079487
         * tokenJsonStr : e}
         * type : 1
         * url :
         * userId : 122121024
         */

        private long bindingTime;
        private boolean expired;
        private int expiresIn;
        private long id;
        private int refreshTime;
        private String tokenJsonStr;
        private int type;
        private String url;
        private int userId;

        public long getBindingTime() {
            return bindingTime;
        }

        public void setBindingTime(long bindingTime) {
            this.bindingTime = bindingTime;
        }

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(int refreshTime) {
            this.refreshTime = refreshTime;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
