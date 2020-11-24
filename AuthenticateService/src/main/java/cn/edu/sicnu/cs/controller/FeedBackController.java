package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.Itfc.FeedBackItfc;

import cn.edu.sicnu.cs.model.Userform;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@Api(tags = "FeedBack",value = "反馈")
@RequestMapping("/feedback/")
public class FeedBackController {

    @Autowired
    private FeedBackItfc feedBackService;

    @GetMapping("browse/hot/userform/list/{page}")
    @ApiOperation(value = "FindHotUserFormList",notes = "查看热门问题列表,page是第几页")
    @ResponseBody
    public List<Map<String,Object>> FindHotUserFormList(@PathVariable String page){
        List<Map<String,Object>> list = feedBackService.FindHotUserFormList(page);
        return list;
    }

    @GetMapping("browse/hot/userform/{fid}")
    @ResponseBody
    @ApiOperation(value = "FindSelfUserFormByFid",notes = "问题详情")
    public Userform FindUserFormByFid(@PathVariable long fid){
        Userform userform = feedBackService.FindUserFormByFid(fid);
        return userform;
    }


    @GetMapping("browse/self/userform/list/{uid}")
    @ResponseBody
    @ApiOperation(value = "FindSelfUserFormList",notes = "自己已提交的问题列表")
    public List<Userform> FindSelfUserFormList(@PathVariable String uid){
        List<Userform> list = feedBackService.FindSelfUserFormList(uid);
        return list;
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
    public String SumbmitUserForm(@RequestBody Map<String, Object> map) throws Exception {
        if(map!=null){
            Userform userform = getObject(map,Userform.class);

            //还需要一个随机分配给客服的函数

            feedBackService.SubmitUserForm(userform);
        }
        return"";
    }

    //将前端返回来的map里面的value封入实体类中
    public <T>T getObject(Map<String,Object> map, Class<T> c) throws Exception {
        T t = c.getDeclaredConstructor().newInstance();//创建一个一个类型为T对象t
        //1.拆开map
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {//获取集合里面的元素
            String key = entry.getKey();//得到key的值（类T的的成员属性）
            //2.将map中的值存入T这个类的对象属性中
            Field f = c.getDeclaredField(key);//获取类的所有字段
            f.setAccessible(true);//简单的理解：设置访问权限
            f.set(t,entry.getValue());//给T对象赋值
        }
        return t;
    }
}
