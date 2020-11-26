package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Userform;

import java.util.List;
import java.util.Map;

public interface CustomersService {

    int TodayUserFormCnt(long cid,String type);

    List<Map<String,Object>> FindUserFormList(long cid,long page,long pagenum,String status);

    Userform FindUserFormByFid(long fid);

    Object FindUserFormCnt(long cid, String status);
}
