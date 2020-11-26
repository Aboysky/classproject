package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.model.Versionhistory;
import cn.edu.sicnu.cs.service.impl.VersionHistoryServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "Version",value = "版本库")
@RequestMapping("/version/")
public class VersionHistoryController {

    @Autowired
    VersionHistoryServiceImpl versionHistoryService;

    @GetMapping("history/vbig")
    @ApiOperation(value = "FindVersionHistoryVBIG",notes = "大版本列表")
    @ResponseBody
    public List<Versionhistory> FindVersionHistoryVBIG(){
        List<Versionhistory> list = versionHistoryService.FindVersionHistoryVBIG();
        return list;
    }


    @GetMapping("history/{vbig}")
    @ApiOperation(value = "FindVersionHistoryList",notes = "大版本下的历史版本名称列表")
    @ResponseBody
    public List<Versionhistory> FindVersionHistoryListByVBIG(@PathVariable String vbig){
        List<Versionhistory> list = versionHistoryService.FindVersionHistoryListByVBIG(vbig);
        return list;
    }

    @GetMapping("history/{version}")
    @ApiOperation(value = "FindVersionHistoryByVersion",notes = "通过版本号查找内容")
    @ResponseBody
    public Versionhistory FindVersionHistoryByVersion(@PathVariable String version){
        Versionhistory versionhistory = versionHistoryService.FindVersionHistoryByVersion(version);
        return versionhistory;
    }


}
