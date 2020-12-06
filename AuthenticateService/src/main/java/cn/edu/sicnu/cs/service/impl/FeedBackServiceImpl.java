package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.dao.UserformMapper;
import cn.edu.sicnu.cs.model.Userform;
import cn.edu.sicnu.cs.model.UserformExample;
import cn.edu.sicnu.cs.service.FeedBackService;
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
    public List<Map<String,Object>> FindHotUserFormList(long page,long pagenum) {

        page = ((page-1) * pagenum);
        List<Map<String,Object>> list = userformMapper.findHotUserFormList(page,pagenum);
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
    public List<Map<String,Object>> FindSelfUserFormList(long page,long pagenum,long uid) {
        List<Map<String,Object>> list = userformMapper.findSelfUserFormList(page,pagenum,uid);

        return list;
    }

    @Override
    public String SubmitUserForm(Userform userform) {

         userformMapper.insert(userform);
         return "success";
    }


    @Override
    public List<Map<String,Object>> FindUserFormList(long cid, long page, long pagenum, String status) {
        page =((page-1) * pagenum);
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

    @Override
    public long FindHotUserFormListCnt() {
        return userformMapper.findHotUserFormListCnt();
    }

    @Override
    public long StatisticsYouthCnt(long uid) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String time = sdf.format(new Date());
        time = time + "%";
        return userformMapper.statisticsTimeCnt(uid,time);
    }

    @Override
    public long StatisticsWeekCnt(long uid) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String time = sdf.format(new Date());
        time = time + "%";
        return userformMapper.statisticsTimeCnt(uid,time);
    }

    @Override
    public long StatisticsTotalCnt(long uid) {
        return 0;
    }

}
