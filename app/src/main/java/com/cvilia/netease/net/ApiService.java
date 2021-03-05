package com.cvilia.netease.net;

import com.cvilia.netease.databean.BestPlayListCategory;
import com.cvilia.netease.databean.BindInfo;
import com.cvilia.netease.databean.CheckMusic;
import com.cvilia.netease.databean.CloudHotComment;
import com.cvilia.netease.databean.CountryInfo;
import com.cvilia.netease.databean.DefaultKeywords;
import com.cvilia.netease.databean.DetailHotSearchList;
import com.cvilia.netease.databean.Follows;
import com.cvilia.netease.databean.HeartbeatMode;
import com.cvilia.netease.databean.HotSearchList;
import com.cvilia.netease.databean.HotTopic;
import com.cvilia.netease.databean.MessageCode;
import com.cvilia.netease.databean.PlayListCategory;
import com.cvilia.netease.databean.PlayRecord;
import com.cvilia.netease.databean.Search;
import com.cvilia.netease.databean.SearchMultiMatch;
import com.cvilia.netease.databean.SearchSuggest;
import com.cvilia.netease.databean.SingerList;
import com.cvilia.netease.databean.SingerSongs;
import com.cvilia.netease.databean.SongUrl;
import com.cvilia.netease.databean.SubCount;
import com.cvilia.netease.databean.TopPlayList;
import com.cvilia.netease.databean.User;
import com.cvilia.netease.databean.UserLevelInfo;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * author: lzy
 * date: 2020/10/10
 * describe：描述
 */
public interface ApiService {

    String BASE_SERVER = "http://121.89.204.40:3000";

    /**
     * 手机号登录
     *
     * @param phone    手机号
     * @param password 密码
     * @return
     */
    @GET("/login/cellphone")
    Observable<User> loginByPhone(@Query("phone") String phone, @Query("md5_password") String password);

    /**
     * 邮箱登录
     *
     * @param email    网易邮箱账号
     * @param password 密码
     * @return
     */
    @GET("/login")
    Observable<User> loginByEmail(@Query("email") String email, @Query("md5_password") String password);

    /**
     * 刷新token
     *
     * @return
     */
    @GET("/login/refresh")
    Observable<String> refreshToken();

    /**
     * 发送验证码
     *
     * @param phone  手机号
     * @param ctcode 可选参数 ctcode 国家码 默认86中国,传null代表默认
     * @return
     */
    @GET("/captcha/sent")
    Observable<MessageCode> sendMessageCode(@Query("phone") String phone, @Query("ctcode") String ctcode);

    /**
     * 验证验证码
     *
     * @param phone   手机号
     * @param captcha 验证码
     * @param ctcode  国家码，可选参数，默认86中国，穿null代表默认
     * @return
     */
    @GET("/captcha/verify")
    Observable<String> verifyMessageCode(@Query("phone") String phone, @Query("captcha") String captcha, @Query("ctcode") String ctcode);

    /**
     * 注册或者修改密码
     *
     * @param captcha  验证码
     * @param phone    注册手机号
     * @param password 密码
     * @param nickname 昵称
     * @return
     */
    @GET("/register/cellphone")
    Observable<String> registerOrModifyPassword(@Query("captcha") String captcha, @Query("phone") String phone, @Query("password") String password, @Query("nickname") String nickname);

    /**
     * 监测手机号是否注册
     *
     * @param phone
     * @param countrycode 国家码 可选参数
     * @return
     */
    @GET("/cellphone/existence/check")
    Observable<String> isPhoneRegistered(@Query("phone") String phone, @Query("countrycode") String countrycode);

    /**
     * 刚注册的账号（刚登录），调用此接口可初始化昵称
     *
     * @param nickname
     * @return
     */
    @GET("/activate/init/profile")
    Observable<String> initNickName(@Query("nickname") String nickname);

    /**
     * 更换绑定的手机 需要先发送验证码到旧手机，推拿后再发送验证码到新手机，然后调用此接口
     *
     * @param oldcaptcha 旧手机验证码
     * @param captcha    新手机验证码
     * @param phone      新手机
     * @param ctcode     国家码，默认86，传null表示默认
     * @return
     */
    @GET("rebind")
    Observable<String> changePhone(@Query("oldcaptcha") String oldcaptcha, @Query("captcha") String captcha, @Query("phone") String phone, @Query("ctcode") String ctcode);

    /**
     * 退出登录
     *
     * @return
     */
    @GET("/logout")
    Observable<Integer> logout();

    /**
     * 获取登录状态
     *
     * @return
     */
    @GET("/login/status")
    Observable<String> getLoginStatus();

    /**
     * 获取用户详情
     *
     * @param userId 用户id
     * @return
     */
    @GET("/user/detail")
    Observable<Integer> getUserDetail(@Query("uid") String userId);

    /**
     * 获取用户信息，歌单，收藏，mv，dj数量
     *
     * @return
     */
    @GET("/user/subcount")
    Observable<SubCount> getSubCount();

    /**
     * 获取用户等级信息
     *
     * @return
     */
    @GET("user/level")
    Observable<UserLevelInfo> getUserLevel();

    /**
     * 获取用户绑定信息
     *
     * @param userId
     * @return
     */
    @GET("/user/binding")
    Observable<BindInfo> getBindInfo(@Query("uid") String userId);

    /**
     * 用户绑定手机 登录后调用此接口可以更换绑定手机
     *
     * @param phone
     * @param oldcaptcha
     * @param captcha
     * @return
     */
    @GET("/user/replacephone")
    Observable<String> bindPhone(@Query("phone") String phone, @Query("oldcaptcha") String oldcaptcha,
                                 @Query("captcha") String captcha);

    /**
     * 更新用户信息
     *
     * @param gender    0 = 保密 1 = 男 2 = 女
     * @param birthday  出生日期，时间戳 unix timestamp
     * @param nickname  用户昵称
     * @param province  省份id
     * @param city      城市id
     * @param signature 用户签名
     * @return
     */
    @GET("/user/update")
    Observable<String> updateUserInfo(@Query("gender") String gender, @Query("birthday") String birthday,
                                      @Query("nickname") String nickname, @Query("province") String province,
                                      @Query("city") String city, @Query("signature") String signature);

    /**
     * 上传头像，使用'Content-Type': 'multipart/form-data'，上传图片formData(name为imgFile)
     * 参考:https://github.com/Binaryify/NeteaseCloudMusicApi/blob/master/public/avatar_update.html
     *
     * @param migSize 图片尺寸，默认300
     * @param imgX    水平裁剪偏移,方形图片可不传,默认为0 imgY : 垂直裁剪偏移,方形图片可不传,默认为0
     * @return
     */
    @GET("/avatar/upload")
    Observable<String> uploadAvatar(@Query("imgSize") Integer migSize, @Query("imgX") Integer imgX);

    /**
     * 获取国家编码信息
     *
     * @return
     */
    @GET("/countries/code/list")
    Observable<CountryInfo> getCountryCode();

    /**
     * 获取用户歌单
     *
     * @param userId 用户id
     * @param limit  返回数量 默认30
     * @param offset 便宜数量，用于分页，如（页数-1）*30,30为limit的值，默认为0
     * @return
     */
    @GET("/user/playlist")
    Observable<String> getPlayList(@Query("uid") String userId, @Query("limit") Integer limit, @Query("offset") Integer offset);

    /**
     * 更新歌单信息
     *
     * @param playListId 歌单id
     * @param name       歌单名字
     * @param desc       歌单描述
     * @param tags       歌单标签 多个标签用分号";"隔开，只能用官方标签
     * @return
     */
    @GET("/playlist/update")
    Observable<String> updatePlayListInfo(@Query("id") String playListId, @Query("name") String name, @Query("desc") String desc, @Query("tags") String tags);

    /**
     * 更新歌单描述
     *
     * @param id   歌单id
     * @param desc 歌单描述
     * @return
     */
    @GET("/playlist/desc/update")
    Observable<String> updatePlayListDesc(@Query("id") String id, @Query("desc") String desc);

    /**
     * 更新歌单名字
     *
     * @param id   歌单id
     * @param name 歌单名
     * @return
     */
    @GET("/playlist/name/update")
    Observable<String> updatePlayListName(@Query("id") String id, @Query("name") String name);

    /**
     * 更新歌单标签
     *
     * @param id   歌单id
     * @param tags 歌单标签
     * @return
     */
    @GET("/playlist/desc/update")
    Observable<String> updatePlayListTags(@Query("id") String id, @Query("tags") String tags);

    /**
     * 上传歌单封面，使用'Content-Type': 'multipart/form-data'，上传图片formData(name为imgFile)
     * 参考:https://github.com/Binaryify/NeteaseCloudMusicApi/blob/master/public/avatar_update.html
     *
     * @param migSize 图片尺寸，默认300
     * @param imgX    水平裁剪偏移,方形图片可不传,默认为0 imgY : 垂直裁剪偏移,方形图片可不传,默认为0
     * @return
     */
    @GET("/playlist/cover/update")
    Observable<String> uploadPlayListCover(@Query("imgSize") Integer migSize, @Query("imgX") Integer imgX);

    /**
     * 调整歌单
     *
     * @param ids 歌单id列表
     * @return
     */
    @GET("/playlist/order/update")
    Observable<String> updatePlayListOrder(@Query("ids") String[] ids);

    /**
     * 调整歌单中歌曲的顺序
     *
     * @param playListId 歌单id
     * @param songIds    歌曲id列表
     * @return
     */
    @GET("/song/order/update")
    Observable<String> updateSongOrder(@Query("pid") String playListId, @Query("ids") String[] songIds);

    /**
     * 获取用户电台
     *
     * @param userId
     * @return
     */
    @GET("/user/dj")
    Observable<String> getDJStation(@Query("uid") String userId);

    /**
     * 获取关注列表
     *
     * @param userId
     * @param limit
     * @param offset
     * @return
     */
    @GET("/user/follows")
    Observable<Follows> getFollows(@Query("uid") String userId, @Query("limit") Integer limit, @Query("offset") Integer offset);

    /**
     * 获取粉丝列表
     *
     * @param userId 用户id
     * @param limit  返回数量 默认30
     * @param offset 便宜数量，用于分页，如（页数-1）*30,30为limit的值，默认为0
     * @return
     */
    @GET("/user/followeds")
    Observable<String> getFans(@Query("uid") String userId, @Query("limit") Integer limit, @Query("offset") Integer offset);

    /**
     * 获取用户动态
     *
     * @param userId   用户id
     * @param limit    返回数量 ，默认30
     * @param lasttime 返回数据的last time,默认传入-1，传入上一次返回结果的lasttime，将会返回下一页的数据
     * @return
     */
    @GET("/user/event")
    Observable<String> getUserDynamic(@Query("uid") String userId, @Query("limit") String limit, @Query("lasttime") String lasttime);

    /**
     * 转发用户动态
     *
     * @param userId   用户id
     * @param evId     被转发的动态id
     * @param forwards 转发的评论
     * @return
     */
    @GET("/event/forward")
    Observable<String> transferDynamic(@Query("uid") String userId, @Query("evId") String evId, @Query("forwards") String forwards);

    /**
     * 删除动态
     *
     * @param evId 动态id
     * @return
     */
    @GET("/event/del")
    Observable<String> deleteDynamic(@Query("evId") String evId);

    /**
     * 转发歌曲，电台，歌单，mv到自己的音乐动态
     *
     * @param id      待分享的资源id
     * @param type    资源类型，可选参数，默认是歌曲song，可传入(song,playlist,mv,djradio=电台,djprogram=电台节目)
     * @param content 转发的平路，最多140个字，支持emoji，@用户名（@see /user/follows接口获取的用户名，用户名和后面的内容应该有空格）暂不支持图片
     * @return
     * @see com.cvilia.netease.config.Constants.ResourceType
     */
    @GET("/share/resource")
    Observable<String> share2Dynamic(@Query("id") String id, @Query("type") String type, @Query("msg") String content);

    /**
     * 获取动态的评论
     *
     * @param id 动态id，可通过/event,/user/event接口获取
     * @return
     */
    @GET("/comment/event")
    Observable<String> getComments(@Query("threadId") String id);

    /**
     * 关注或取消关注
     *
     * @param id   被取消和关注的用户id
     * @param type 1=关注 ，others = 取消关注
     * @return
     */
    @GET("/follow")
    Observable<String> aboutFollow(@Query("id") String id, @Query("t") int type);

    /**
     * 获取用户播放记录
     *
     * @param userId 用户id
     * @param type   1=只返回weekData，0=allData
     * @return
     */
    @GET("/user/record")
    Observable<PlayRecord> getPlayRecord(@Query("uid") String userId, @Query("type") int type);

    /**
     * 获取热门话题
     *
     * @param limit  取出评论数量，默认30
     * @param offset 偏移数量，用于分页，如评论页数1*20 其中20为limit
     * @return
     */
    @GET("/hot/topic")
    Observable<HotTopic> getHotTopic(@Query("limit") Integer limit, @Query("offset") Integer offset);

    /**
     * 获取云村热评
     *
     * @return
     */
    @GET("/comment/hotwall/list")
    Observable<CloudHotComment> getCloudHotComment();

    /**
     * 开启心动模式/智能播放
     *
     * @param songId 歌曲id
     * @param pid    歌单id
     * @param sid    可选参数 要开始播放的歌曲的id
     * @return
     */
    @GET("/playmode/intelligence/list")
    Observable<HeartbeatMode> getHeartbeatModeList(@Query("id") String songId, @Query("pid") String pid, @Query("sid") String sid);

    /**
     * 获取动态消息
     *
     * @param pageSize 每页数据，默认20
     * @param lasttime 返回数据的lasttime，默认-1，传入上一次返回结果的lasttime，将返回下一页的数据
     * @return
     */
    @GET("/event")
    Observable<String> getDynamicMessage(@Query("pagesize") int pageSize, @Query("lasttime") String lasttime);

    /**
     * 获取歌手分类列表
     *
     * @param limit   返回数量，默认30
     * @param offset  分页偏移数量
     * @param initial 如果按首字母索引则传入英文或名字拼音首字母，需要热门排序传入-1，#传入0
     * @param type    -1=全部 1=男歌手 2=女歌手 3=乐队
     * @param area    -1=全部 7=话语 96=欧美 8=日本 16=韩国 0=其他
     * @return
     */
    @GET("/artist/list")
    Observable<SingerList> getSingerList(@Query("limit") Integer limit, @Query("offset") Integer offset, @Query("initial") String initial, @Query("type") int type, @Query("area") int area);

    /**
     * 收藏、取消收藏歌手
     *
     * @param id   歌手id
     * @param type 1=收藏 others= 取消收藏
     * @return
     */
    @GET("/artist/sub")
    Observable<String> starSinger(@Query("id") String id, @Query("t") int type);

    /**
     * 获取歌手热门50首歌
     *
     * @param id 歌手id
     * @return
     */
    @GET("/artist/top/song")
    Observable<SingerSongs> getSingerTop50(@Query("id") String id);

    /**
     * 获取歌手所有歌曲
     *
     * @param id     歌手id
     * @param order  结果的排列方式 hot=热门 time=时间
     * @param limit  默认50
     * @param offset
     * @return
     */
    @GET("/artist/songs")
    Observable<SingerSongs> getSingerAllSongs(@Query("id") String id, @Query("order") String order, @Query("limit") Integer limit, @Query("offset") Integer offset);

    /**
     * 获取收藏的歌手列表
     *
     * @return
     */
    @GET("/artist/sublist")
    Observable<String> getStarSingers();

    /**
     * 收藏、取消收藏视频
     *
     * @param id   视频id
     * @param type 1=收藏，others= 取消收藏
     * @return
     */
    @GET("/video/sub")
    Observable<String> starVideo(@Query("id") String id, @Query("t") String type);

    /**
     * 收藏、取消收藏MV
     *
     * @param id   mv id
     * @param type 1=收藏，others= 取消收藏
     * @return
     */
    @GET("/mv/sub")
    Observable<String> starMV(@Query("mvid") String id, @Query("t") String type);

    /**
     * 获取收藏的MV列表
     *
     * @return
     */
    @GET("/mv/sublist")
    Observable<String> getStarMVList();

    /**
     * 获取歌单分类
     *
     * @return
     */
    @GET("/playlist/catlist")
    Observable<PlayListCategory> getPlayListCategory();

    /**
     * 获取热门的歌单分类
     *
     * @return
     */
    @GET("/playlist/hot")
    Observable<PlayListCategory> getHotPlayListCategory();

    /**
     * 获取网友精选碟（歌单）
     *
     * @param order    可选值为 new ,hot,表示最新和最热，默认为hot
     * @param category 分类从 /playlist/catlist 接口获取
     * @param limit    默认50
     * @param offset   偏移量，分页
     * @return
     */
    @GET("/top/playlist")
    Observable<TopPlayList> getTopPlayList(@Query("order") String order, @Query("cat") String category, @Query("limit") Integer limit, @Query("offset") Integer offset);

    /**
     * 获取精品歌单列表
     *
     * @return
     */
    @GET("/playlist/highquality/tags")
    Observable<BestPlayListCategory> getBestPlayListCategory();

    /**
     * 获取精品歌单
     * 参数均为可选参数
     *
     * @param category   歌单分类 从接口 /playlist/highquality/tags 中获取
     * @param limit      默认20
     * @param offset     偏移量
     * @param updateTime 分页参数 上一页最后一个歌单的updatetime
     * @return
     */
    @GET("/top/playlist/highquality")
    Observable<String> getBestPlayList(@Query("cat") String category, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("before") String updateTime);

    /**
     * 获取相关歌单
     *
     * @param id 歌单id
     * @return
     */
    @GET("/related/playlist")
    Observable<String> getRelatePlayList(@Query("id") String id);

    /**
     * 获取歌单详情
     * <p>
     * 歌单能看到歌单名字, 但看不到具体歌单内容 , 调用此接口 , 传入歌单 id,
     * 可以获取对应歌单内的所有的音乐(未登录状态只能获取不完整的歌单,登录后是完整的)，但是返回的trackIds是完整的，
     * tracks 则是不完整的，可拿全部 trackIds 请求一次 song/detail 接口获取所有歌曲的详情
     *
     * @param id 歌单id
     * @param s  歌单最近的收藏着个数，默认为8
     * @return
     */
    @GET(" /playlist/detail")
    Observable<String> getPlayListInfo(@Query("id") String id, @Query("s") Integer s);

    /**
     * 获取音乐url
     *
     * @param id 音乐id 多个音乐之间用英文逗号" ，"隔开
     * @param br 音乐码率 默认999000，即最大码率，如果要320k，这可设置为320000，其他类推
     * @return
     */
    @GET("/song/url")
    Observable<SongUrl> getSongUrl(@Query("id") String id, @Query("br") String br);

    /**
     * 检测音乐是否可用
     *
     * @param id 歌曲id 只能传入单个音乐的id
     * @param br 音乐码率 默认999000，即最大码率，如果要320k，这可设置为320000，其他类推
     * @return
     */
    @GET("/check/music")
    Observable<CheckMusic> checkMusic(@Query("id") String id, @Query("br") String br);

    /**
     * 搜索
     * 调用此接口 , 传入搜索关键词可以搜索该音乐 / 专辑 / 歌手 / 歌单 / 用户 , 关键词可以多个 , 以空格隔开 ,
     * 如 " 周杰伦 搁浅 "( 不需要登录 ),
     * 搜索获取的 mp3url 不能直接用 , 可通过 /song/url 接口传入歌曲 id 获取具体的播放链接
     *
     * @param keywords 关键词
     * @param offset   偏移量
     * @param limit    默认30
     * @param type     1=单曲(默认) 10=专辑 100=歌手，1000=歌单，1002=用户 1004=MV 1006=歌词 1009=电台 1014=视频 1018=综合
     * @return
     */
    @GET("/search")
    Observable<Search> search(@Query("keywords") String keywords, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("type") Integer type);

    /**
     * 更全面的搜索
     * <p>
     * 调用此接口 , 传入搜索关键词可以搜索该音乐 / 专辑 / 歌手 / 歌单 / 用户 , 关键词可以多个 , 以空格隔开 ,
     * 如 " 周杰伦 搁浅 "( 不需要登录 ),
     * 搜索获取的 mp3url 不能直接用 , 可通过 /song/url 接口传入歌曲 id 获取具体的播放链接
     *
     * @param keywords 关键词
     * @param offset   偏移量
     * @param limit    默认30
     * @param type     1=单曲(默认) 10=专辑 100=歌手，1000=歌单，1002=用户 1004=MV 1006=歌词 1009=电台 1014=视频 1018=综合
     * @return
     */
    @GET("/cloudsearch")
    Observable<Search> allSearch(@Query("keywords") String keywords, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("type") Integer type);

    /**
     * 获取默认的搜索关键词
     *
     * @return
     */
    @GET("/search/default")
    Observable<DefaultKeywords> getDefaultKeywords();

    /**
     * 获取默认的搜索关键词 简略的
     *
     * @return
     */
    @GET("/search/default")
    Observable<HotSearchList> getHotSearchList();

    /**
     * 获取默认的搜索关键词 详细的
     *
     * @return
     */
    @GET("/search/hot/detail")
    Observable<DetailHotSearchList> getDetailHotSearchList();

    /**
     * 获取搜索建议 传入搜索关键词可获得搜索建议 , 搜索结果同时包含单曲 , 歌手 , 歌单 ,mv 信息
     *
     * @param keywords 关键词
     * @param type     移动端传入 mobile(必须穿如mobile，否则实体类{@link SearchSuggest}将不适用)
     * @return
     */
    @GET("/search/suggest")
    Observable<SearchSuggest> getSearchSuggest(@Query("keywors") String keywords, @Query("type") String type);

    /**
     * 获取搜索多重匹配
     * 调用此接口 , 传入搜索关键词可获得搜索结果
     *
     * @param keywords 关键词
     * @return
     */
    @GET("/search/multimatch")
    Observable<SearchMultiMatch> getSearchMultiMatch(@Query("keywords") String keywords);

    /**
     * 创建歌单
     *
     * @param name    名字
     * @param privacy 是否设置为隐私歌单，默认否，传10表示隐私歌单
     * @param type    歌单类型，默认为NORMAL，传VIDEO为视频歌单
     * @return
     */
    @GET("/playlist/create")
    Observable<String> createPlayList(@Query("name") String name, @Query("privacy") Integer privacy, @Query("type") String type);

    /**
     * 删除歌单
     *
     * @param id 歌单id
     * @return
     */
    @GET("/playlist/delete")
    Observable<String> deletePlayList(@Query("id") String id);

    /**
     * 收藏，取消搜藏歌单
     *
     * @param id   歌单id
     * @param type 1=收藏 2=取消收藏
     * @return
     */
    @GET("/playlist/subscribe")
    Observable<String> starPlayList(@Query("id") String id, @Query("t") int type);

    /**
     * 获取歌单搜藏者
     * @param id 歌单id
     * @param limit 默认20
     * @param offset 偏移量
     * @return
     */
    @GET("/playlist/subscribers")
    Observable<String> getStarUsersPlayList(@Query("id")String id,@Query("limit")Integer limit,@Query("offset")Integer offset);


















































    /**
     *
     */

}
