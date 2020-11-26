package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.VersionhistoryMapper;
import cn.edu.sicnu.cs.model.Versionhistory;
import cn.edu.sicnu.cs.service.VersionHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VersionHistoryServiceImpl implements VersionHistoryService {

    @Resource
    VersionhistoryMapper versionhistoryMapper;


    @Override
    public List<Versionhistory> FindVersionHistoryVBIG() {
        List<Versionhistory> list = versionhistoryMapper.findVersionHistoryVBIG();

        return list;
    }

    @Override
    public List<Versionhistory> FindVersionHistoryListByVBIG(String vbig) {

        List<Versionhistory> list = versionhistoryMapper.findVersionHistoryListByVBIG();
        return list;
    }

    @Override
    public Versionhistory FindVersionHistoryByVersion(String version) {

        List<Versionhistory> list = versionhistoryMapper.findVersionHistoryByVersion(version);
        return list.get(0);
    }
}
