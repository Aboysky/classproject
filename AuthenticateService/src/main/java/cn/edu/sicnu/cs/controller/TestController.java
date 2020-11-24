package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.constant.ResultCode;
import cn.edu.sicnu.cs.utils.ResUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/11/22 10:16
 * @Created by Huan
 */
@RestController
public class TestController {

//    {
//        goDiret: [], //提交去向
//        prodesc: "", //问题简要
//                protype: "", //问题类型
//            proscene: "", //问题出现场景/操作步骤
//            isReapper: "", //是否可以重现
//            softversion: "", //软件版本
//            enviroment: "", //系统环境
//            operversion: "", //操作系统版本
//            databaseversion: "", //数据库版本
//            jdkversion: "", //JDK版本
//            otherinfo: "", //其他重要信息
//            goid: "", //提交去向编号，0:商务经理，1:工程师，2:产品建议
    @PostMapping("/${soft_version}/order")
    public String addOrder(HttpServletRequest request) throws IOException {
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String  prodesc = null,protype = null,
                proscene = null, isReapper = null,softversion = null,
                enviroment = null, operversion = null,databaseversion = null,
                jdkversion = null, otherinfo = null,goid = null;
        if(StringUtils.hasText(body)) {
            JSONObject jsonObj = JSON.parseObject(body);
            prodesc = jsonObj.getString("prodesc");
            protype = jsonObj.getString("protype");
            proscene = jsonObj.getString("proscene");
            isReapper = jsonObj.getString("isReapper");
            softversion = jsonObj.getString("softversion");
            enviroment = jsonObj.getString("enviroment");
            operversion = jsonObj.getString("operversion");
            databaseversion = jsonObj.getString("databaseversion");
            jdkversion = jsonObj.getString("jdkversion");
            otherinfo = jsonObj.getString("otherinfo");
            goid = jsonObj.getString("goid");
        }

        return ResUtil.getJsonStr(ResultCode.OK,"接收到了工单 prodesc : "+prodesc+" protype : "+protype+" proscene : "+proscene
                +" isReapper : "+isReapper+" softversion : "+softversion+" enviroment : "+enviroment+" operversion : "+operversion
                +"dateBaseversion : "+databaseversion+" jdkversion : "+jdkversion+" otherinfo : "+otherinfo+" goid : "+goid );
    }
}
