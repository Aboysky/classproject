package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Faq;

import java.util.List;

public interface FaqService {
    List<Faq> FindFaqListByType(String type);

    Faq FindFaqName(String name);
}
