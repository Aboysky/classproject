package cn.edu.sicnu.cs.datamapper;


import cn.edu.sicnu.cs.base.BaseMapper;
import cn.edu.sicnu.cs.dto.LogSmallDto;
import cn.edu.sicnu.cs.entity.Log;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogSmallMapper extends BaseMapper<LogSmallDto, Log> {

}
