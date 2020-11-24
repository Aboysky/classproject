package cn.edu.sicnu.cs.service;


import cn.edu.sicnu.cs.Itfc.CustomersServiceItfc;
import cn.edu.sicnu.cs.model.Userform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustomersServiceService  implements CustomersServiceItfc {

    @Autowired
    FeedBackService feedBackService;


    @Override
    public int TodayUserFormCnt(String cid,String type) {
        int cnt = feedBackService.TodayUserFormCnt(cid,type);
        return cnt;
    }

    @Override
    public List<Map<String,Object>> FindUserFormList(String cid, long page, long pagenum, String status) {
        return feedBackService.FindUserFormList(cid,page,pagenum,status);
    }

    @Override
    public Userform FindUserFormByFid(long fid) {
        return null;
    }


}
