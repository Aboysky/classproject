package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.anotations.Log;
import cn.edu.sicnu.cs.constant.ResultCode;
import cn.edu.sicnu.cs.query.LogQueryCriteria;
import cn.edu.sicnu.cs.service.LogService;
import cn.edu.sicnu.cs.utils.ResUtil;
import cn.edu.sicnu.cs.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/${soft_version}/logs")
@Api(tags = "监控：日志管理")
public class LogController {

    private final Logger logger = LoggerFactory.getLogger(LogController.class);

    private final LogService logService;
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @Log("导出数据")
    @ApiOperation("导出数据")
    @GetMapping(value = "/download")
    public void download(HttpServletResponse response, LogQueryCriteria criteria) throws IOException {
        if ("ERROR".equals(criteria.getLogType())) {
            logService.downloadError(logService.queryAll(criteria), response);
        } else {
            logService.download(logService.queryAll(criteria), response);
        }
    }

//    @GetMapping
//    @ApiOperation("日志查询")
//    public ResponseEntity<Object> getLogs(LogQueryCriteria criteria, Pageable pageable){
//        criteria.setLogType("INFO");
//        return new ResponseEntity<>(logService.queryAll(criteria,pageable), HttpStatus.OK);
//    }

    @GetMapping
    @ApiOperation("日志查询")
    public String getLogs(LogQueryCriteria criteria, Pageable pageable){
        criteria.setLogType("INFO");
        return ResUtil.getJsonStr(ResultCode.OK,"查询成功",logService.queryAll(criteria,pageable));
    }

    @GetMapping(value = "/user")
    @ApiOperation("用户日志查询")
    public String getUserLogs(LogQueryCriteria criteria, Pageable pageable){
        criteria.setLogType("INFO");

        logger.debug("LogQueryCriteria :"+criteria+" pageable :" + pageable);

        criteria.setBlurry(SecurityUtils.getCurrentUsername());
        Object o = logService.queryAllByUser(criteria, pageable);
//        return new ResponseEntity<>(logService.queryAllByUser(criteria, pageable), HttpStatus.OK);
        return ResUtil.getJsonStr(ResultCode.OK,"查询成功",o);
    }


    @GetMapping(value = "/error")
    @ApiOperation("错误日志查询")
    public ResponseEntity<Object> getErrorLogs(LogQueryCriteria criteria, Pageable pageable){
        criteria.setLogType("ERROR");
        return new ResponseEntity<>(logService.queryAll(criteria,pageable), HttpStatus.OK);
    }

    @GetMapping(value = "/error/{id}")
    @ApiOperation("日志异常详情查询")
    public ResponseEntity<Object> getErrorLogs(@PathVariable Long id){
        return new ResponseEntity<>(logService.findByErrDetail(id), HttpStatus.OK);
    }


    @DeleteMapping(value = "/del/error")
    @Log("删除所有ERROR日志")
    @ApiOperation("删除所有ERROR日志")
    public ResponseEntity<Object> delAllByError(){
        logService.delAllByError();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/del/info")
    @Log("删除所有INFO日志")
    @ApiOperation("删除所有INFO日志")
    public ResponseEntity<Object> delAllByInfo(){
        logService.delAllByInfo();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
