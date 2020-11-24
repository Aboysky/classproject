package cn.edu.sicnu.cs.Itfc;

import cn.edu.sicnu.cs.model.Userform;

import java.util.List;
import java.util.Map;

public interface CustomersServiceItfc {

    int TodayUserFormCnt(String cid,String type);

    List<Map<String,Object>> FindUserFormList(String cid,long page,long pagenum,String status);

    Userform FindUserFormByFid(long fid);
}
