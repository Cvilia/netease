package com.cvilia.netease.sqlmodel;


import androidx.annotation.NonNull;

import java.io.Serializable;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * author: lzy
 * date: 3/5/21
 * describe：本地音乐实体类
 */
@Entity
public class LocalMusic implements Serializable {
    @Id
    private long id;
    private String path;//音乐路径
    private String name;//音乐名称
    private long size;//音乐大小
    private long duration;//时长
    private boolean isFavorite;//是否收藏
    private String artist;//歌手
    private String album;//专辑
    private String albumCover;//专辑封面
    private String playTimes;//播放次数
    private String addTime;//创建时间
    private String type;//文件类型
    private boolean isLocal;//是否是本地文件 true = 是 false = 在线
    private String folder;//用于创建本地歌单
    private long recentPlayTime;//最近播放时间


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(String albumCover) {
        this.albumCover = albumCover;
    }

    public String getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(String playTimes) {
        this.playTimes = playTimes;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public long getRecentPlayTime() {
        return recentPlayTime;
    }

    public void setRecentPlayTime(long recentPlayTime) {
        this.recentPlayTime = recentPlayTime;
    }

}
