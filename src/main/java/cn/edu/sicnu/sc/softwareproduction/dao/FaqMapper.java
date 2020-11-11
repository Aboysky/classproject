package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Faq;
import cn.edu.sicnu.sc.softwareproduction.model.FaqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaqMapper {
    long countByExample(FaqExample example);

    int deleteByExample(FaqExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Faq record);

    int insertSelective(Faq record);

    List<Faq> selectByExampleWithBLOBs(FaqExample example);

    List<Faq> selectByExample(FaqExample example);

    Faq selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Faq record, @Param("example") FaqExample example);

    int updateByExampleWithBLOBs(@Param("record") Faq record, @Param("example") FaqExample example);

    int updateByExample(@Param("record") Faq record, @Param("example") FaqExample example);

    int updateByPrimaryKeySelective(Faq record);

    int updateByPrimaryKeyWithBLOBs(Faq record);

    int updateByPrimaryKey(Faq record);
}