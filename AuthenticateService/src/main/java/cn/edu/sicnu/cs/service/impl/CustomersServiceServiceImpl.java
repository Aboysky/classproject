package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.service.CustomersService;
import cn.edu.sicnu.cs.model.Userform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustomersServiceServiceImpl implements CustomersService {

    @Autowired
    FeedBackServiceImpl feedBackService;


    @Override
    public int TodayUserFormCnt(long cid,String type) {
        int cnt = feedBackService.TodayUserFormCnt(cid,type);
        return cnt;
    }

    @Override
    public List<Map<String,Object>> FindUserFormList(long cid, long page, long pagenum, String status) {
        return feedBackService.FindUserFormList(cid,page,pagenum,status);
    }

    @Override
    public Userform FindUserFormByFid(long fid) {
        return feedBackService.FindUserFormByFid(fid);
    }

    @Override
    public Object FindUserFormCnt(long cid, String status) {
        long cnt = feedBackService.FindUserFormCnt(cid,status);
        return cnt;
    }


}
