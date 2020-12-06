package cn.edu.sicnu.cs.service;


import cn.edu.sicnu.cs.model.Userform;

import java.util.List;
import java.util.Map;

public interface FeedBackService {

    List<Map<String,Object>> FindHotUserFormList(long page,long pagenum);

    Userform FindUserFormByFid(long fid);


    List<Map<String,Object>> FindSelfUserFormList(long page,long pagenum,long uid);

    String SubmitUserForm(Userform userform);

    List<Map<String,Object>> FindUserFormList(long cid, long page, long pagenum, String status);


    int TodayUserFormCnt(long cid,String type);

    long FindUserFormCnt(long cid, String status);

    long FindHotUserFormListCnt();

    long StatisticsYouthCnt(long uid);

    long StatisticsWeekCnt(long uid);

    long StatisticsTotalCnt(long uid);
}
