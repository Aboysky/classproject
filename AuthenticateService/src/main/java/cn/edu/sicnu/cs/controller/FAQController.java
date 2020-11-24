package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.dao.FaqMapper;
import cn.edu.sicnu.cs.model.Faq;
import cn.edu.sicnu.cs.service.FaqService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "Faq",value = "知识库")
@RequestMapping("/faq/")
public class FAQController {

    @Autowired
    private FaqService faqService;

    @GetMapping("browse/{type}")
    @ResponseBody
    @ApiOperation(value = "findFaqByType",notes = "根据分类查询Faq")
    public List<Faq> findFaqByType(@PathVariable String type){
        List<Faq> list = faqService.FindFaqListByType(type);
        return list;
    }

    @GetMapping("browse/{name}")
    @ResponseBody
    @ApiOperation(value = "FindFaqName",notes = "根据标题查询Faq")
    public Faq FindFaqName(@PathVariable String name){
        Faq faq = faqService.FindFaqName(name);
        return faq;
    }

}
