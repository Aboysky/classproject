package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.service.FeedBackService;
import cn.edu.sicnu.cs.dao.UserformMapper;
import cn.edu.sicnu.cs.model.Userform;
import cn.edu.sicnu.cs.model.UserformExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Resource
    UserformMapper userformMapper;

    @Override
    public List<Map<String,Object>> FindHotUserFormList(String page) {
        List<Map<String,Object>> list = userformMapper.findHotUserFormList(page);
        return list;
    }

    @Override
    public Userform FindUserFormByFid(long fid) {

        UserformExample userformExample = new UserformExample();
        UserformExample.Criteria criteria = userformExample.createCriteria();
        criteria.andFidEqualTo(fid);
        List<Userform> list = userformMapper.selectByExample(userformExample);

        return list.get(0);
    }

    @Override
    public List<Userform> FindSelfUserFormList(String uid) {
        List<Userform> list = userformMapper.findSelfUserFormList(uid);

        return list;
    }

    @Override
    public String SubmitUserForm(Userform userform) {
        userformMapper.insert(userform);
        return "";
    }


    @Override
    public List<Map<String,Object>> FindUserFormList(long cid, long page, long pagenum, String status) {
        page =((page-1) * pagenum) +1;
        pagenum = page + pagenum - 1;
        List<Map<String,Object>> list = userformMapper.findUserFormList(cid,page,pagenum,status);
        return list;
    }


    @Override
    public int TodayUserFormCnt(long cid,String type) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(new Date());
        today = today + "%";
        List<Userform> list = userformMapper.todayUserFormCnt(cid,type,today);

        return list.size();
    }

    @Override
    public long FindUserFormCnt(long cid, String status) {
        return userformMapper.findUserFormCnt(cid,status);
    }

}
