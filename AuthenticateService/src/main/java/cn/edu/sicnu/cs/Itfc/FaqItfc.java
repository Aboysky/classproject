package cn.edu.sicnu.cs.Itfc;

import cn.edu.sicnu.cs.model.Faq;

import java.util.List;

public interface FaqItfc {
    List<Faq> FindFaqListByType(String type);

    Faq FindFaqName(String name);
}
