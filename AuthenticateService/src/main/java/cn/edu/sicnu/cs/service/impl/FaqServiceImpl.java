package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.service.FaqService;
import cn.edu.sicnu.cs.dao.FaqMapper;
import cn.edu.sicnu.cs.model.Faq;
import cn.edu.sicnu.cs.model.FaqExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FaqServiceImpl implements FaqService {

    @Resource
    private FaqMapper faqMapper;

    @Override
    public List<Faq> FindFaqListByType(String type) {

        List<Faq> list = faqMapper.findFaqListByType(type);
        //返回FAQ的名字
        return list;
    }

    @Override
    public Faq FindFaqName(String name) {
        FaqExample faqExample = new FaqExample();
        FaqExample.Criteria criteria = faqExample.createCriteria();
        criteria.andQnameEqualTo(name);
        List<Faq> list = faqMapper.selectByExample(faqExample);
        return list.get(0);
    }
}
