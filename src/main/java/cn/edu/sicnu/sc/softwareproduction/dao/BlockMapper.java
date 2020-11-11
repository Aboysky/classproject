package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Block;
import cn.edu.sicnu.sc.softwareproduction.model.BlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlockMapper {
    long countByExample(BlockExample example);

    int deleteByExample(BlockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Block record);

    int insertSelective(Block record);

    List<Block> selectByExampleWithBLOBs(BlockExample example);

    List<Block> selectByExample(BlockExample example);

    Block selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByExampleWithBLOBs(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByExample(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKeyWithBLOBs(Block record);

    int updateByPrimaryKey(Block record);
}