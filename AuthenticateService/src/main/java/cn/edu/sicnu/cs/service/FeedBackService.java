package cn.edu.sicnu.cs.service;


import cn.edu.sicnu.cs.model.Userform;


import java.util.List;
import java.util.Map;

public interface FeedBackService {

    List<Map<String,Object>> FindHotUserFormList(String page);

    Userform FindUserFormByFid(long fid);


    List<Userform> FindSelfUserFormList(String uid);

    String SubmitUserForm(Userform userform);

    List<Map<String,Object>> FindUserFormList(long cid, long page, long pagenum, String status);


    int TodayUserFormCnt(long cid,String type);

    long FindUserFormCnt(long cid, String status);
}
