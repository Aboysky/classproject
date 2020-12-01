package cn.edu.sicnu.cs.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 获取地址类
 *
 * @author perye
 * @email peryedev@gmail.com
 * @date 2019/12/31
 */
public class AddressUtils {
    private static final Logger log = LoggerFactory.getLogger(AddressUtils.class);

    public static final String IP_URL = "http://ip.taobao.com/service/getIpInfo.php";

    public static final String IP_URL1 = "http://ip-api.com/json/"; //?ip=xxx.xxx.xxx.xxx&json=true
    // {
//    {
//        "query": "182.150.102.207",
//            "status": "success",
//            "country": "中国",
//            "countryCode": "CN",
//            "region": "SC",
//            "regionName": "四川省",
//            "city": "成都",
//            "zip": "",
//            "lat": 30.6667,
//            "lon": 104.0667,
//            "timezone": "Asia/Shanghai",
//            "isp": "Chinanet",
//            "org": "Chinanet SC",
//            "as": "AS4134 CHINANET-BACKBONE"
//    }

    public static String getRealAddressByIP(String ip) {
        String address = "未知";
        // 内网不查询
        if (IpUtils.internalIp(ip)) {
            return "内网IP";
        }
        String rspStr = HttpUtils.sendPost(IP_URL, "ip=" + ip);
        if (StringUtils.isEmpty(rspStr)) {
            log.error("获取地理位置异常 {}" , ip);
            return address;
        }
        JSONObject obj = JSONObject.parseObject(rspStr);

        if ("0".equals(obj.getString("code"))){
            JSONObject data = obj.getObject("data" , JSONObject.class);
            String region = data.getString("region");
            String city = data.getString("city");
            String isp = data.getString("isp");
            address = region + " " + city + " " + isp;
            return address;
        }
        // 数据格式  {"ip":"221.218.209.125","pro":"北京市",
        // "proCode":"110000","city":"北京市","cityCode":"110000",
        // "region":"海淀区","regionCode":"110108",
        // "addr":"北京市海淀区 联通ADSL","regionNames":"","err":""}
        rspStr = HttpUtils.sendGet(IP_URL1+ip, "lang=zh-CN");
        obj = JSONObject.parseObject(rspStr);
        String region = obj.getString("country");
        String city = obj.getString("regionName");
        String isp = obj.getString("city");
        address = region + " " + city + " " + isp;
        return address;
    }

}
