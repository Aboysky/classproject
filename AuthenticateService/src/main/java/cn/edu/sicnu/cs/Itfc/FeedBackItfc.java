package cn.edu.sicnu.cs.Itfc;


import cn.edu.sicnu.cs.model.Userform;


import java.util.List;
import java.util.Map;

public interface FeedBackItfc {

    List<Map<String,Object>> FindHotUserFormList(String page);

    Userform FindUserFormByFid(long fid);


    List<Userform> FindSelfUserFormList(String uid);

    String SubmitUserForm(Userform userform);

    List<Map<String,Object>> FindUserFormList(String cid, long page, long pagenum, String status);


    int TodayUserFormCnt(String cid,String type);

}
