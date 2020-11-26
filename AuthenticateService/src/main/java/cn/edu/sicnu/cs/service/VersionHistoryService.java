package cn.edu.sicnu.cs.service;


import cn.edu.sicnu.cs.model.Versionhistory;

import java.util.List;

public interface VersionHistoryService {

    List<Versionhistory>  FindVersionHistoryVBIG();

    List<Versionhistory> FindVersionHistoryListByVBIG(String vbig);

    Versionhistory FindVersionHistoryByVersion(String version);

}
