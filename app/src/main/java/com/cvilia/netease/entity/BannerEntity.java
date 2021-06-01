package com.cvilia.netease.entity;

import com.cvilia.netease.framework.BubbleEntity;

import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-04-05-21:59
 * describe:
 */
public class BannerEntity implements BubbleEntity {
    /**
     * banners : [{"imageUrl":"http://p1.music.126.net/xoHr5sKAzH5vrMySSI46Xg==/109951165854321664.jpg","targetId":183261314123456787,"adid":"","targetType":1,"titleColor":"red","typeTitle":"独家","url":"","exclusive":false,"encodeId":"1832613147","scm":"1.music-homepage.homepage_banner_force.banner.2772058.483281937.null"}]
     * code : 200
     */

    private List<BannersBean> banners;
    private int code;

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class BannersBean {
        /**
         * imageUrl : http://p1.music.126.net/xoHr5sKAzH5vrMySSI46Xg==/109951165854321664.jpg
         * targetId : 183261314123456787
         * adid :
         * targetType : 1
         * titleColor : red
         * typeTitle : 独家
         * url :
         * exclusive : false
         * encodeId : 1832613147
         * scm : 1.music-homepage.homepage_banner_force.banner.2772058.483281937.null
         */

        private String imageUrl;
        private long targetId;
        private String adid;
        private int targetType;
        private String titleColor;
        private String typeTitle;
        private String url;
        private boolean exclusive;
        private String encodeId;
        private String scm;

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public long getTargetId() {
            return targetId;
        }

        public void setTargetId(long targetId) {
            this.targetId = targetId;
        }

        public String getAdid() {
            return adid;
        }

        public void setAdid(String adid) {
            this.adid = adid;
        }

        public int getTargetType() {
            return targetType;
        }

        public void setTargetType(int targetType) {
            this.targetType = targetType;
        }

        public String getTitleColor() {
            return titleColor;
        }

        public void setTitleColor(String titleColor) {
            this.titleColor = titleColor;
        }

        public String getTypeTitle() {
            return typeTitle;
        }

        public void setTypeTitle(String typeTitle) {
            this.typeTitle = typeTitle;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isExclusive() {
            return exclusive;
        }

        public void setExclusive(boolean exclusive) {
            this.exclusive = exclusive;
        }

        public String getEncodeId() {
            return encodeId;
        }

        public void setEncodeId(String encodeId) {
            this.encodeId = encodeId;
        }

        public String getScm() {
            return scm;
        }

        public void setScm(String scm) {
            this.scm = scm;
        }
    }
}
