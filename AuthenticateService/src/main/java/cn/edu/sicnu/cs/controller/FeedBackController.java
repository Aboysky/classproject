package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.model.Userform;
import cn.edu.sicnu.cs.service.FeedBackService;


import cn.edu.sicnu.cs.utils.ResUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "FeedBack",value = "反馈")
@RequestMapping("/feedback/")
public class FeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    @GetMapping("browse/hot/userform/list")
    @ApiOperation(value = "FindHotUserFormList",notes = "查看热门问题列表,page是第几页")
    @ResponseBody
    public String FindHotUserFormList(long page,long pagenum){
        List<Map<String,Object>> list = feedBackService.FindHotUserFormList(page,pagenum);

        for (Map<String, Object> map : list) {
            String  decs = ((String)map.get("fcontent")).substring(0,1);
            map.put("decs",decs);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return ResUtil.getJsonStr(1, "成功",map);
    }

    @GetMapping("browse/hot/userform/{fid}")
    @ResponseBody
    @ApiOperation(value = "FindSelfUserFormByFid",notes = "问题详情")
    public Userform FindUserFormByFid(@PathVariable long fid){
        Userform userform = feedBackService.FindUserFormByFid(fid);
        return userform;
    }


    @GetMapping("browse/self/userform/list")
    @ResponseBody
    @ApiOperation(value = "FindSelfUserFormList",notes = "自己已提交的问题列表")
    public String FindSelfUserFormList(long page,long pagenum,long uid){
        List<Map<String,Object>> list = feedBackService.FindSelfUserFormList(page,pagenum,uid);
        Map<String,Object> map = new HashMap<>();

        map.put("list",list);
        return ResUtil.getJsonStr(1, "成功",map);
    }

    @GetMapping("browse/self/userform/{fid}")
    @ResponseBody
    @ApiOperation(value = "FindSelfUserFormByFid",notes = "自己已提交的问题详情")
    public Userform FindSelfUserFormByFid(@PathVariable long fid){
        Userform userform = feedBackService.FindUserFormByFid(fid);
        return userform;
    }



    @PostMapping("sumbmit/userform")
    @ResponseBody
    @ApiOperation(value = "SumbmitUserForm",notes = "用户提交问题")
    public String SumbmitUserForm(HttpServletRequest request) throws Exception {

        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        if (StringUtils.hasText(body)){
            Userform userform = JSON.parseObject(body,Userform.class);
            System.out.println(body);
            System.out.println(userform.toString());

            long fid = 20201129;
            userform.setFid(fid);
            //还需要一个分配id的函数、

            int userid = 123;
            userform.setFassignedtoId(userid);
            //还需要一个随机分配给客服的函数

            //插入当天的时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String today = sdf.format(new Date());
            Date day = new Date();
            day.equals(today);
            userform.setFcreatetime(day);

            //还需要判断很多字段的插入


            feedBackService.SubmitUserForm(userform);
            return ResUtil.getJsonStr(1, "成功");
        }else{
            return ResUtil.getJsonStr(0, "失败");
        }



    }

//    //将前端返回来的map里面的value封入实体类中
//    public <T>T getObject(Map<String,Object> map, Class<T> c) throws Exception {
//        T t = c.getDeclaredConstructor().newInstance();//创建一个一个类型为T对象t
//        //1.拆开map
//        Set<Map.Entry<String, Object>> entries = map.entrySet();
//        for (Map.Entry<String, Object> entry : entries) {//获取集合里面的元素
//            String key = entry.getKey();//得到key的值（类T的的成员属性）
//            //2.将map中的值存入T这个类的对象属性中
//            Field f = c.getDeclaredField(key);//获取类的所有字段
//            f.setAccessible(true);//简单的理解：设置访问权限
//            f.set(t,entry.getValue());//给T对象赋值
//        }
//        return t;
//    }
}
