package com.cvilia.netease.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-04-05-22:14
 * describe: 每日推荐歌曲实体类
 */
@lombok.NoArgsConstructor
@lombok.Data
public class RecommendPerDayEntity {

    /**
     * code : 200
     * data : {"dailySongs":[{"name":"Neptune（海王星）","id":1416840914,"pst":0,"t":0,"ar":[{"id":33577055,"name":"祝一可","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":9,"crbt":null,"cf":"","al":{"id":84922554,"name":"Neptune（海王星）","picUrl":"http://p3.music.126.net/JDRxcUUYyG64p6x9iu_poA==/109951164629315010.jpg","tns":[],"pic_str":"109951164629315010","pic":109951164629315000},"dt":247950,"h":{"br":320000,"fid":0,"size":9920305,"vd":-34562},"m":{"br":192000,"fid":0,"size":5952200,"vd":-31942},"l":{"br":128000,"fid":0,"size":3968148,"vd":-30259},"a":null,"cd":"01","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":64,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 爱与狂想","privilege":{"id":1416840914,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":66,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"nearlineBased_t"},{"name":"鲸落万物生","id":1498076671,"pst":0,"t":0,"ar":[{"id":12258760,"name":"灼夭","tns":[],"alias":[]},{"id":12852319,"name":"小田音乐社","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":3,"crbt":null,"cf":"","al":{"id":98748362,"name":"鲸落万物生","picUrl":"http://p4.music.126.net/OqQXs2rUg3PIDMr6CRap4A==/109951165495889901.jpg","tns":[],"pic_str":"109951165495889901","pic":109951165495889900},"dt":176141,"h":{"br":320002,"fid":0,"size":7048365,"vd":-45127},"m":{"br":192002,"fid":0,"size":4229037,"vd":-42555},"l":{"br":128002,"fid":0,"size":2819373,"vd":-40974},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416318,"mv":0,"publishTime":1606233600000,"reason":"根据你可能喜欢的单曲 聊生","privilege":{"id":1498076671,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"nearlineBased_t"},{"name":"不美","id":1327975428,"pst":0,"t":0,"ar":[{"id":12271646,"name":"郁欢","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":35,"crbt":null,"cf":"","al":{"id":74486505,"name":"不美","picUrl":"http://p4.music.126.net/2P24DBmWcVg2J-q-TLr2PQ==/109951163683622801.jpg","tns":[],"pic_str":"109951163683622801","pic":109951163683622800},"dt":253033,"h":{"br":320000,"fid":0,"size":10124060,"vd":-30800},"m":{"br":192000,"fid":0,"size":6074453,"vd":-28400},"l":{"br":128000,"fid":0,"size":4049650,"vd":-26600},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mark":64,"originCoverType":2,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":1542963265902,"reason":"根据你可能喜欢的单曲 看不见","privilege":{"id":1327975428,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":66,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"nearlineBased_t"},{"name":"恋爱频率","id":1391425499,"pst":0,"t":0,"ar":[{"id":12271427,"name":"蓝褶","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":8,"v":8,"crbt":null,"cf":"","al":{"id":81666857,"name":"恋爱频率","picUrl":"http://p4.music.126.net/7VHzyv9ezV8SUWFC_c4O3A==/109951164369853561.jpg","tns":[],"pic_str":"109951164369853561","pic":109951164369853570},"dt":208822,"h":{"br":320000,"fid":0,"size":8355048,"vd":-47215},"m":{"br":192000,"fid":0,"size":5013046,"vd":-44722},"l":{"br":128000,"fid":0,"size":3342045,"vd":-42834},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 少女作妖日记","privilege":{"id":1391425499,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"nearlineBased_t"},{"name":"千鸟与目黑","id":1339031165,"pst":0,"t":0,"ar":[{"id":1039314,"name":"叶里","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":8,"crbt":null,"cf":"","al":{"id":75148987,"name":"我的意中人","picUrl":"http://p3.music.126.net/tBVDJDG6Pst6Gj3G3TI8sg==/109951163787950709.jpg","tns":[],"pic_str":"109951163787950709","pic":109951163787950700},"dt":243000,"h":{"br":320000,"fid":0,"size":9722819,"vd":-2},"m":{"br":192000,"fid":0,"size":5833709,"vd":-2},"l":{"br":128000,"fid":0,"size":3889154,"vd":-2},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":64,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 36.5℃","privilege":{"id":1339031165,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":258,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"nearlineBased_t"},{"name":"谢谢你的路过","id":1475616230,"pst":0,"t":0,"ar":[{"id":12472506,"name":"习谱予","tns":[],"alias":[]}],"alia":[],"pop":65,"st":0,"rt":"","fee":8,"v":4,"crbt":null,"cf":"","al":{"id":94767447,"name":"谢谢你的路过","picUrl":"http://p4.music.126.net/bkIceDUh7Z9GxZ6wjbRs2g==/109951165287534982.jpg","tns":[],"pic_str":"109951165287534982","pic":109951165287534980},"dt":190268,"h":{"br":320000,"fid":0,"size":7613170,"vd":-28536},"m":{"br":192000,"fid":0,"size":4567920,"vd":-25933},"l":{"br":128000,"fid":0,"size":3045294,"vd":-24280},"a":null,"cd":"01","no":0,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":534013,"mv":10956047,"publishTime":0,"reason":"根据你可能喜欢的单曲 开心就好","privilege":{"id":1475616230,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"nearlineBased_t"},{"name":"画皮","id":1448183660,"pst":0,"t":0,"ar":[{"id":12227865,"name":"阿YueYue","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":12,"crbt":null,"cf":"","al":{"id":89628156,"name":"画皮","picUrl":"http://p4.music.126.net/p8ahicdvF8QiSBFc3pr7rA==/109951164998715208.jpg","tns":[],"pic_str":"109951164998715208","pic":109951164998715200},"dt":224869,"h":{"br":320000,"fid":0,"size":8997660,"vd":-48474},"m":{"br":192000,"fid":0,"size":5398613,"vd":-45797},"l":{"br":128000,"fid":0,"size":3599090,"vd":-43835},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":8192,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 官方回答","privilege":{"id":1448183660,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":68,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"nearlineBased_t"},{"name":"直觉","id":1422462379,"pst":0,"t":0,"ar":[{"id":12227509,"name":"程嘉敏","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":6,"crbt":null,"cf":"","al":{"id":85633628,"name":"直觉","picUrl":"http://p4.music.126.net/TRqjC0EMETz7tNJ8bBhrDg==/109951164696742874.jpg","tns":[],"pic_str":"109951164696742874","pic":109951164696742880},"dt":208796,"h":{"br":320000,"fid":0,"size":8352958,"vd":-42732},"m":{"br":192000,"fid":0,"size":5011792,"vd":-40125},"l":{"br":128000,"fid":0,"size":3341209,"vd":-38427},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":2,"originSongSimpleData":{"songId":1335580481,"name":"直觉","artists":[{"id":12349011,"name":"李学仕"}],"albumMeta":{"id":74977939,"name":"直觉"}},"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 爱与狂想","privilege":{"id":1422462379,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":128,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"等雨","id":1452851247,"pst":0,"t":0,"ar":[{"id":32042995,"name":"糯米Nomi","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":3,"crbt":null,"cf":"","al":{"id":90313876,"name":"等雨","picUrl":"http://p4.music.126.net/iJFmSpjrm_qHsk2QD6xr6g==/109951165035478564.jpg","tns":[],"pic_str":"109951165035478564","pic":109951165035478560},"dt":183745,"h":{"br":320000,"fid":0,"size":7352991,"vd":-49098},"m":{"br":192000,"fid":0,"size":4411812,"vd":-46519},"l":{"br":128000,"fid":0,"size":2941222,"vd":-44974},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416649,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 聊生","privilege":{"id":1452851247,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"未来式情歌","id":1434429128,"pst":0,"t":0,"ar":[{"id":12571830,"name":"零6","tns":[],"alias":[]},{"id":34283831,"name":"陆怡雯","tns":[],"alias":[]},{"id":34283853,"name":"吕帅","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":4,"crbt":null,"cf":"","al":{"id":86883936,"name":"未来式情歌","picUrl":"http://p4.music.126.net/ZS80L7M1hM0NAKiEAgj_VQ==/109951164845438766.jpg","tns":[],"pic_str":"109951164845438766","pic":109951164845438770},"dt":178010,"h":{"br":320000,"fid":0,"size":7123113,"vd":-34778},"m":{"br":192000,"fid":0,"size":4273885,"vd":-32209},"l":{"br":128000,"fid":0,"size":2849271,"vd":-30526},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":1584115200000,"reason":"根据你可能喜欢的单曲 三千遍我爱你","privilege":{"id":1434429128,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"念无痕","id":1391525386,"pst":0,"t":0,"ar":[{"id":12308198,"name":"西二","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":10,"crbt":null,"cf":"","al":{"id":81624538,"name":"念无痕","picUrl":"http://p4.music.126.net/49svWhHmTtOeP5ZNBoUtKA==/109951164370555420.jpg","tns":[],"pic_str":"109951164370555420","pic":109951164370555420},"dt":209598,"h":{"br":320000,"fid":0,"size":8386395,"vd":-29787},"m":{"br":192000,"fid":0,"size":5031854,"vd":-27162},"l":{"br":128000,"fid":0,"size":3354584,"vd":-25382},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":2,"originSongSimpleData":{"songId":1339725804,"name":"念无痕","artists":[{"id":13228114,"name":"周子琰"}],"albumMeta":{"id":75136833,"name":"念无痕"}},"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 爱与狂想","privilege":{"id":1391525386,"fee":0,"payed":0,"st":0,"pl":320000,"dl":999000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":128,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"Rise","id":1467363772,"pst":0,"t":0,"ar":[{"id":12120174,"name":"Biscuits","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":5,"crbt":null,"cf":"","al":{"id":74275915,"name":"Rise (Cover)","picUrl":"http://p4.music.126.net/UP7t8sHknOBgHb_SgChzkQ==/109951163656999368.jpg","tns":[],"pic_str":"109951163656999368","pic":109951163656999360},"dt":206497,"h":{"br":320000,"fid":0,"size":8261007,"vd":-54497},"m":{"br":192000,"fid":0,"size":4956622,"vd":-51862},"l":{"br":128000,"fid":0,"size":3304429,"vd":-50097},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":262144,"originCoverType":2,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 爱与狂想","privilege":{"id":1467363772,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":128,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"一切关于你","id":1299550660,"pst":0,"t":0,"ar":[{"id":28389489,"name":"Grace","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":56,"crbt":null,"cf":"","al":{"id":72071156,"name":"一切关于你","picUrl":"http://p3.music.126.net/qWvV9Ug3iPkc6G2NTEY2tw==/109951163448335005.jpg","tns":[],"pic_str":"109951163448335005","pic":109951163448335000},"dt":124412,"h":{"br":320000,"fid":0,"size":4978982,"vd":-21300},"m":{"br":192000,"fid":0,"size":2987407,"vd":-18800},"l":{"br":128000,"fid":0,"size":1991619,"vd":-17200},"a":null,"cd":"01","no":0,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416268,"mv":0,"publishTime":1533830400007,"reason":"根据你的口味","privilege":{"id":1299550660,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_sdm_short"},{"name":"同样","id":1432156509,"pst":0,"t":0,"ar":[{"id":31668975,"name":"Lambert","tns":[],"alias":[]},{"id":31051426,"name":"杨胖雨","tns":[],"alias":[]},{"id":1053121,"name":"PonySoore","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":3,"crbt":null,"cf":"","al":{"id":86629529,"name":"同样","picUrl":"http://p4.music.126.net/MZZRZu-1aJzCZP9G-9e4iw==/109951164818119859.jpg","tns":[],"pic_str":"109951164818119859","pic":109951164818119860},"dt":199199,"h":{"br":320000,"fid":0,"size":7970525,"vd":-47708},"m":{"br":192000,"fid":0,"size":4782333,"vd":-45147},"l":{"br":128000,"fid":0,"size":3188236,"vd":-43580},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416649,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 Sweetie(Be_Mine)","privilege":{"id":1432156509,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"With U","id":1434295491,"pst":0,"t":0,"ar":[{"id":31051426,"name":"杨胖雨","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":3,"crbt":null,"cf":"","al":{"id":86865401,"name":"Eighteen","picUrl":"http://p3.music.126.net/-dq8WLPTVFpvrnvYsrl_Sg==/109951164843983261.jpg","tns":[],"pic_str":"109951164843983261","pic":109951164843983260},"dt":216007,"h":{"br":320000,"fid":0,"size":8643440,"vd":-50784},"m":{"br":192000,"fid":0,"size":5186081,"vd":-48196},"l":{"br":128000,"fid":0,"size":3457402,"vd":-46568},"a":null,"cd":"01","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":8192,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416517,"mv":0,"publishTime":0,"reason":"根据你的口味","privilege":{"id":1434295491,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":68,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_ytb_click"},{"name":"那面墙","id":27570273,"pst":0,"t":0,"ar":[{"id":8583,"name":"梁一贞","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":85,"crbt":null,"cf":"","al":{"id":2336329,"name":"秘密呼吸","picUrl":"http://p3.music.126.net/4mSU5gOJzHtvgIosPxZXVw==/5652589278469217.jpg","tns":[],"pic":5652589278469217},"dt":237217,"h":{"br":320000,"fid":0,"size":9489807,"vd":-2},"m":{"br":192000,"fid":0,"size":5693902,"vd":-2},"l":{"br":128000,"fid":0,"size":3795949,"vd":-2},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416634,"mv":5338239,"publishTime":1354636800007,"reason":"根据你的口味","privilege":{"id":27570273,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_sdm_short"},{"name":"他","id":1492902319,"pst":0,"t":0,"ar":[{"id":12023202,"name":"赵方婧","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":4,"crbt":null,"cf":"","al":{"id":97891135,"name":"他","picUrl":"http://p3.music.126.net/cXw4dU6FPf4th2YqodvfpQ==/109951165439403009.jpg","tns":[],"pic_str":"109951165439403009","pic":109951165439403000},"dt":128257,"h":{"br":320000,"fid":0,"size":5132582,"vd":-45781},"m":{"br":192000,"fid":0,"size":3079567,"vd":-43227},"l":{"br":128000,"fid":0,"size":2053059,"vd":-41582},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":8192,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416678,"mv":0,"publishTime":1604678400000,"reason":"根据你的口味","privilege":{"id":1492902319,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":4,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_sdm_short"},{"name":"只不过","id":493285225,"pst":0,"t":0,"ar":[{"id":12532848,"name":"小潘潘（潘柚彤）","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":28,"crbt":null,"cf":"","al":{"id":35834342,"name":"只不过","picUrl":"http://p4.music.126.net/yoNb_4wKQnQ4Vppy8SeMmQ==/18581746511427312.jpg","tns":[],"pic_str":"18581746511427312","pic":18581746511427310},"dt":217058,"h":{"br":320000,"fid":0,"size":8685236,"vd":-2},"m":{"br":192000,"fid":0,"size":5211159,"vd":-2},"l":{"br":128000,"fid":0,"size":3474120,"vd":-2},"a":null,"cd":"01","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":8192,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416673,"mv":0,"publishTime":1501084800000,"reason":"根据你的口味","privilege":{"id":493285225,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":4,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_sdm_short"},{"name":"幼时","id":1449655886,"pst":0,"t":0,"ar":[{"id":33613818,"name":"泽典","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":3,"crbt":null,"cf":"","al":{"id":89729312,"name":"幼时","picUrl":"http://p4.music.126.net/Ndx7beqeDOWJG-uriaDQbw==/109951165003745880.jpg","tns":[],"pic_str":"109951165003745880","pic":109951165003745890},"dt":201315,"h":{"br":320000,"fid":0,"size":8055162,"vd":-14760},"m":{"br":192000,"fid":0,"size":4833115,"vd":-12171},"l":{"br":128000,"fid":0,"size":3222091,"vd":-10490},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416318,"mv":0,"publishTime":1590076800000,"reason":"根据你可能喜欢的单曲 聊生","privilege":{"id":1449655886,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"大碗宽面","id":1359595520,"pst":0,"t":0,"ar":[{"id":964108,"name":"吴亦凡","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":19,"crbt":null,"cf":"","al":{"id":78590461,"name":"大碗宽面","picUrl":"http://p3.music.126.net/yDFbKhM9wIO0GWEuOvxhVg==/109951164007799327.jpg","tns":[],"pic_str":"109951164007799327","pic":109951164007799330},"dt":221544,"h":{"br":320000,"fid":0,"size":8862868,"vd":-14500},"m":{"br":192000,"fid":0,"size":5317738,"vd":-12000},"l":{"br":128000,"fid":0,"size":3545173,"vd":-10500},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":270464,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":7003,"mv":10879020,"publishTime":1555603200000,"reason":"根据你的口味","privilege":{"id":1359595520,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":128000,"toast":false,"flag":5,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_sdm_long"},{"name":"Here With You","id":27583305,"pst":0,"t":0,"ar":[{"id":28727,"name":"Asher Monroe","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":21,"crbt":null,"cf":"","al":{"id":2641180,"name":"Here With You","picUrl":"http://p4.music.126.net/-z8-eSWMp3DoM0vDHoSqiA==/109951164851177024.jpg","tns":[],"pic_str":"109951164851177024","pic":109951164851177020},"dt":225500,"h":{"br":320000,"fid":0,"size":9022738,"vd":-62390},"m":{"br":192000,"fid":0,"size":5413660,"vd":-59870},"l":{"br":128000,"fid":0,"size":3609121,"vd":-58251},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mark":270336,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416729,"mv":508081,"publishTime":1346169600007,"reason":"根据你可能喜欢的单曲 Apologize","privilege":{"id":27583305,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":4,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"熬夜上瘾","id":1417082727,"pst":0,"t":0,"ar":[{"id":15059542,"name":"刘亦心（可乐就是力量）","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":75,"crbt":null,"cf":"","al":{"id":85023829,"name":"熬夜上瘾","picUrl":"http://p4.music.126.net/8yTX8fyzze_VQLno34PAxw==/109951164630895933.jpg","tns":[],"pic_str":"109951164630895933","pic":109951164630895940},"dt":198122,"h":{"br":320000,"fid":0,"size":7927725,"vd":-51477},"m":{"br":192000,"fid":0,"size":4756653,"vd":-48901},"l":{"br":128000,"fid":0,"size":3171117,"vd":-47259},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1416503,"mv":10911962,"publishTime":1579536000000,"reason":"根据你可能喜欢的单曲 少女作妖日记","privilege":{"id":1417082727,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"全部都是你","id":465920905,"pst":0,"t":0,"ar":[{"id":12333145,"name":"DP龙猪","tns":[],"alias":[]},{"id":12191014,"name":"宝楽CNBALLER","tns":[],"alias":[]},{"id":12131566,"name":"CLOUDWANG 王云","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":44,"crbt":null,"cf":"","al":{"id":35287218,"name":"全部都是你","picUrl":"http://p3.music.126.net/g0OOHCJyDFzso-SEaa_O-w==/109951165309098267.jpg","tns":[],"pic_str":"109951165309098267","pic":109951165309098270},"dt":203625,"h":{"br":320000,"fid":0,"size":8148158,"vd":-3},"m":{"br":192000,"fid":0,"size":4888912,"vd":-2},"l":{"br":128000,"fid":0,"size":3259289,"vd":-2},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":262208,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1374819,"mv":5556833,"publishTime":1489593600000,"reason":"根据你可能喜欢的单曲 My Heart Will Go On","privilege":{"id":465920905,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":322,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"沉默的誓言","id":1329745023,"pst":0,"t":0,"ar":[{"id":189873,"name":"南征北战NZBZ","tns":[],"alias":[]}],"alia":[],"pop":90,"st":0,"rt":null,"fee":8,"v":5,"crbt":null,"cf":"","al":{"id":74674618,"name":"沉默的誓言","picUrl":"http://p3.music.126.net/u2oj9qY11m5ZVnWvWLJoWg==/109951163695576106.jpg","tns":[],"pic_str":"109951163695576106","pic":109951163695576110},"dt":233547,"h":{"br":320000,"fid":0,"size":9344566,"vd":-43500},"m":{"br":192000,"fid":0,"size":5606757,"vd":-40900},"l":{"br":128000,"fid":0,"size":3737853,"vd":-39600},"a":null,"cd":"01","no":0,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1382819,"mv":0,"publishTime":1543507200007,"reason":"根据你可能喜欢的单曲 我的天坑","privilege":{"id":1329745023,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":256,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"自由 Part II","id":1321580023,"pst":0,"t":0,"ar":[{"id":12291562,"name":"Quinn葵因","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":36,"crbt":null,"cf":"","al":{"id":74134095,"name":"自由 Part II","picUrl":"http://p4.music.126.net/eeKRUaGFeC4795xngWge6Q==/109951163635016899.jpg","tns":[],"pic_str":"109951163635016899","pic":109951163635016900},"dt":146582,"h":{"br":320000,"fid":0,"size":5866101,"vd":-52983},"m":{"br":192000,"fid":0,"size":3519678,"vd":-50392},"l":{"br":128000,"fid":0,"size":2346466,"vd":-48750},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":64,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":1540873245150,"reason":"根据你可能喜欢的单曲 三千遍我爱你","privilege":{"id":1321580023,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":322,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"飞 (完整版) (翻自 王恩信Est / 二胖u) ","id":1412030522,"pst":0,"t":0,"ar":[{"id":13642178,"name":"大神慧","tns":[],"alias":[]},{"id":12270985,"name":"十七草","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":5,"crbt":null,"cf":"","al":{"id":84360269,"name":"飞 (完整版)","picUrl":"http://p4.music.126.net/moCls2ann4OX8aAoffXEyg==/109951164579487317.jpg","tns":[],"pic_str":"109951164579487317","pic":109951164579487310},"dt":198086,"h":{"br":320000,"fid":0,"size":7925595,"vd":-37921},"m":{"br":192000,"fid":0,"size":4755374,"vd":-35336},"l":{"br":128000,"fid":0,"size":3170264,"vd":-33821},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":2,"originSongSimpleData":{"songId":1386259535,"name":"飞","artists":[{"id":12904290,"name":"王恩信Est"},{"id":12923493,"name":"二胖u（王訫）"}],"albumMeta":{"id":81090004,"name":"飞"}},"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":1413823,"mv":0,"publishTime":0,"reason":"根据你的口味","privilege":{"id":1412030522,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":0,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_sdm_long"},{"name":"懒人","id":1462427219,"pst":0,"t":0,"ar":[{"id":1056002,"name":"三无MarBlue","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":7,"crbt":null,"cf":"","al":{"id":85091825,"name":"翻唱合集（更新到《今日重到苏澜桥》","picUrl":"http://p4.music.126.net/ExC40_fFwxUgydQINzjqAQ==/109951164669111492.jpg","tns":[],"pic_str":"109951164669111492","pic":109951164669111490},"dt":206733,"h":{"br":320000,"fid":0,"size":8271456,"vd":-64087},"m":{"br":192000,"fid":0,"size":4962891,"vd":-61464},"l":{"br":128000,"fid":0,"size":3308608,"vd":-59705},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":128,"originCoverType":2,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的单曲 少女作妖日记","privilege":{"id":1462427219,"fee":0,"payed":0,"st":0,"pl":320000,"dl":999000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":129,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"等我回家（쓰레기 remix）","id":521435363,"pst":0,"t":0,"ar":[{"id":12084142,"name":"螺丝刀RoseDoggy","tns":[],"alias":[]},{"id":1194094,"name":"孤矢","tns":[],"alias":[]},{"id":15196131,"name":"FI鳗鱼同学","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":25,"crbt":null,"cf":"","al":{"id":36865562,"name":"等我回家的猫","picUrl":"http://p4.music.126.net/_nN11DDcLYTw7TBtrovryw==/109951163072560881.jpg","tns":[],"pic_str":"109951163072560881","pic":109951163072560880},"dt":234538,"h":{"br":320000,"fid":0,"size":9384272,"vd":-28100},"m":{"br":192000,"fid":0,"size":5630581,"vd":-25500},"l":{"br":128000,"fid":0,"size":3753735,"vd":-24000},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":262144,"originCoverType":2,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":530019,"mv":0,"publishTime":1511930047090,"reason":"根据你可能喜欢的单曲 三千遍我爱你","privilege":{"id":521435363,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"每年这两天我只想要你","id":1335382287,"pst":0,"t":0,"ar":[{"id":12798217,"name":"刘思鉴","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":13,"crbt":null,"cf":"","al":{"id":74965055,"name":"每年这两天我只想要你.","picUrl":"http://p4.music.126.net/ouZAE4QXbRUhz73QAe64rQ==/109951163745779409.jpg","tns":[],"pic_str":"109951163745779409","pic":109951163745779410},"dt":227605,"h":{"br":320000,"fid":0,"size":9107374,"vd":-2},"m":{"br":192000,"fid":0,"size":5464442,"vd":-2},"l":{"br":128000,"fid":0,"size":3642976,"vd":-2},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":1545585114264,"reason":"根据你可能喜欢的单曲 Sweetie(Be_Mine)","privilege":{"id":1335382287,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":64,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"itembased"},{"name":"奶茶加糖","id":1361361165,"pst":0,"t":0,"ar":[{"id":27862793,"name":"贰茉儿EMO","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":11,"crbt":null,"cf":"","al":{"id":78725105,"name":"奶茶加糖","picUrl":"http://p4.music.126.net/Mz566Df61JkXCXFkjyxn2w==/109951164026087618.jpg","tns":[],"pic_str":"109951164026087618","pic":109951164026087620},"dt":232368,"h":{"br":320000,"fid":0,"size":9297546,"vd":-15599},"m":{"br":192000,"fid":0,"size":5578545,"vd":-13200},"l":{"br":128000,"fid":0,"size":3719044,"vd":-11600},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":64,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你的口味","privilege":{"id":1361361165,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":258,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"on_sdm_short"},{"name":"罪逍遥","id":1808284139,"pst":0,"t":0,"ar":[{"id":12308136,"name":"纳豆nado","tns":[],"alias":[]},{"id":34954903,"name":"仙某某","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":5,"crbt":null,"cf":"","al":{"id":120971603,"name":"罪逍遥","picUrl":"http://p4.music.126.net/Ma1-gVHw-6TcCGzbGM919g==/109951165592584794.jpg","tns":[],"pic_str":"109951165592584794","pic":109951165592584800},"dt":181500,"h":{"br":320000,"fid":0,"size":7263129,"vd":-58844},"m":{"br":192000,"fid":0,"size":4357895,"vd":-56280},"l":{"br":128000,"fid":0,"size":2905278,"vd":-54683},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":64,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"rtype":0,"rurl":null,"mst":9,"cp":0,"mv":0,"publishTime":0,"reason":"根据你可能喜欢的歌手 纳豆nado","privilege":{"id":1808284139,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":2,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"alg":"FSs2AR"}],"orderSongs":[],"recommendReasons":[{"songId":1416840914,"reason":"超73%人播放"},{"songId":1808284139,"reason":"纳豆nado的新歌速达"}]}
     */

    @SerializedName("code")
    private Integer code;
    @SerializedName("data")
    private Data data;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class Data {
        @SerializedName("dailySongs")
        private List<DailySongs> dailySongs;
        @SerializedName("recommendReasons")
        private List<RecommendReasons> recommendReasons;

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class DailySongs {
            /**
             * name : Neptune（海王星）
             * id : 1416840914
             * pst : 0
             * t : 0
             * ar : [{"id":33577055,"name":"祝一可","tns":[],"alias":[]}]
             * alia : []
             * pop : 100
             * st : 0
             * rt :
             * fee : 8
             * v : 9
             * crbt : null
             * cf :
             * al : {"id":84922554,"name":"Neptune（海王星）","picUrl":"http://p3.music.126.net/JDRxcUUYyG64p6x9iu_poA==/109951164629315010.jpg","tns":[],"pic_str":"109951164629315010","pic":109951164629315000}
             * dt : 247950
             * h : {"br":320000,"fid":0,"size":9920305,"vd":-34562}
             * m : {"br":192000,"fid":0,"size":5952200,"vd":-31942}
             * l : {"br":128000,"fid":0,"size":3968148,"vd":-30259}
             * a : null
             * cd : 01
             * no : 2
             * rtUrl : null
             * ftype : 0
             * rtUrls : []
             * djId : 0
             * copyright : 0
             * s_id : 0
             * mark : 64
             * originCoverType : 0
             * originSongSimpleData : null
             * single : 0
             * noCopyrightRcmd : null
             * rtype : 0
             * rurl : null
             * mst : 9
             * cp : 0
             * mv : 0
             * publishTime : 0
             * reason : 根据你可能喜欢的单曲 爱与狂想
             * privilege : {"id":1416840914,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":66,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"freeTrialPrivilege":{"resConsumable":false,"userConsumable":false},"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]}
             * alg : nearlineBased_t
             */

            @SerializedName("name")
            private String name;
            @SerializedName("id")
            private Integer id;
            @SerializedName("ar")
            private List<Ar> ar;
            @SerializedName("alia")
            private List<?> alia;
            @SerializedName("pop")
            private Integer pop;
            @SerializedName("al")
            private Al al;
            @SerializedName("h")
            private H h;
            @SerializedName("m")
            private M m;
            @SerializedName("l")
            private L l;
            @SerializedName("originCoverType")
            private Integer originCoverType;
            @SerializedName("originSongSimpleData")
            private Object originSongSimpleData;
            @SerializedName("reason")
            private String reason;

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class Al {
                /**
                 * id : 84922554
                 * name : Neptune（海王星）
                 * picUrl : http://p3.music.126.net/JDRxcUUYyG64p6x9iu_poA==/109951164629315010.jpg
                 * tns : []
                 * pic_str : 109951164629315010
                 * pic : 109951164629315000
                 */

                @SerializedName("id")
                private Integer id;
                @SerializedName("name")
                private String name;
                @SerializedName("picUrl")
                private String picUrl;
                @SerializedName("tns")
                private List<?> tns;
                @SerializedName("pic_str")
                private String picStr;
                @SerializedName("pic")
                private Long pic;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class H {
                /**
                 * br : 320000
                 * fid : 0
                 * size : 9920305
                 * vd : -34562
                 */

                @SerializedName("br")
                private Integer br;
                @SerializedName("fid")
                private Integer fid;
                @SerializedName("size")
                private Integer size;
                @SerializedName("vd")
                private Integer vd;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class M {
                /**
                 * br : 192000
                 * fid : 0
                 * size : 5952200
                 * vd : -31942
                 */

                @SerializedName("br")
                private Integer br;
                @SerializedName("fid")
                private Integer fid;
                @SerializedName("size")
                private Integer size;
                @SerializedName("vd")
                private Integer vd;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class L {
                /**
                 * br : 128000
                 * fid : 0
                 * size : 3968148
                 * vd : -30259
                 */

                @SerializedName("br")
                private Integer br;
                @SerializedName("fid")
                private Integer fid;
                @SerializedName("size")
                private Integer size;
                @SerializedName("vd")
                private Integer vd;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class Privilege {
                /**
                 * id : 1416840914
                 * fee : 8
                 * payed : 0
                 * st : 0
                 * pl : 128000
                 * dl : 0
                 * sp : 7
                 * cp : 1
                 * subp : 1
                 * cs : false
                 * maxbr : 999000
                 * fl : 128000
                 * toast : false
                 * flag : 66
                 * preSell : false
                 * playMaxbr : 999000
                 * downloadMaxbr : 999000
                 * freeTrialPrivilege : {"resConsumable":false,"userConsumable":false}
                 * chargeInfoList : [{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]
                 */

                @SerializedName("id")
                private Integer id;
                @SerializedName("fee")
                private Integer fee;
                @SerializedName("payed")
                private Integer payed;
                @SerializedName("st")
                private Integer st;
                @SerializedName("pl")
                private Integer pl;
                @SerializedName("dl")
                private Integer dl;
                @SerializedName("sp")
                private Integer sp;
                @SerializedName("cp")
                private Integer cp;
                @SerializedName("subp")
                private Integer subp;
                @SerializedName("cs")
                private Boolean cs;
                @SerializedName("maxbr")
                private Integer maxbr;
                @SerializedName("fl")
                private Integer fl;
                @SerializedName("toast")
                private Boolean toast;
                @SerializedName("flag")
                private Integer flag;
                @SerializedName("preSell")
                private Boolean preSell;
                @SerializedName("playMaxbr")
                private Integer playMaxbr;
                @SerializedName("downloadMaxbr")
                private Integer downloadMaxbr;
                @SerializedName("freeTrialPrivilege")
                private FreeTrialPrivilege freeTrialPrivilege;
                @SerializedName("chargeInfoList")
                private List<ChargeInfoList> chargeInfoList;

                @lombok.NoArgsConstructor
                @lombok.Data
                public static class FreeTrialPrivilege {
                    /**
                     * resConsumable : false
                     * userConsumable : false
                     */

                    @SerializedName("resConsumable")
                    private Boolean resConsumable;
                    @SerializedName("userConsumable")
                    private Boolean userConsumable;
                }

                @lombok.NoArgsConstructor
                @lombok.Data
                public static class ChargeInfoList {
                    /**
                     * rate : 128000
                     * chargeUrl : null
                     * chargeMessage : null
                     * chargeType : 0
                     */

                    @SerializedName("rate")
                    private Integer rate;
                    @SerializedName("chargeUrl")
                    private Object chargeUrl;
                    @SerializedName("chargeMessage")
                    private Object chargeMessage;
                    @SerializedName("chargeType")
                    private Integer chargeType;
                }
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class Ar {
                /**
                 * id : 33577055
                 * name : 祝一可
                 * tns : []
                 * alias : []
                 */

                @SerializedName("id")
                private Integer id;
                @SerializedName("name")
                private String name;
                @SerializedName("tns")
                private List<?> tns;
                @SerializedName("alias")
                private List<?> alias;
            }
        }

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class RecommendReasons {
            /**
             * songId : 1416840914
             * reason : 超73%人播放
             */

            @SerializedName("songId")
            private Integer songId;
            @SerializedName("reason")
            private String reason;
        }
    }
}
