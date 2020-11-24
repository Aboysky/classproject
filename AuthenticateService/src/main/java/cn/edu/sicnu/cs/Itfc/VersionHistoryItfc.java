package cn.edu.sicnu.cs.Itfc;


import cn.edu.sicnu.cs.model.Versionhistory;

import java.util.List;

public interface VersionHistoryItfc {

    List<Versionhistory>  FindVersionHistoryVBIG();

    List<Versionhistory> FindVersionHistoryListByVBIG(String vbig);

    Versionhistory FindVersionHistoryByVersion(String version);

}
