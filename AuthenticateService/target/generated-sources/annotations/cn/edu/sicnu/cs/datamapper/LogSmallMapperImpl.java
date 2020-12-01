package cn.edu.sicnu.cs.datamapper;

import cn.edu.sicnu.cs.dto.LogSmallDto;
import cn.edu.sicnu.cs.entity.Log;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-01T15:24:05+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class LogSmallMapperImpl implements LogSmallMapper {

    @Override
    public Log toEntity(LogSmallDto dto) {
        if ( dto == null ) {
            return null;
        }

        Log log = new Log();

        return log;
    }

    @Override
    public LogSmallDto toDto(Log entity) {
        if ( entity == null ) {
            return null;
        }

        LogSmallDto logSmallDto = new LogSmallDto();

        return logSmallDto;
    }

    @Override
    public List<Log> toEntity(List<LogSmallDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Log> list = new ArrayList<Log>( dtoList.size() );
        for ( LogSmallDto logSmallDto : dtoList ) {
            list.add( toEntity( logSmallDto ) );
        }

        return list;
    }

    @Override
    public List<LogSmallDto> toDto(List<Log> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LogSmallDto> list = new ArrayList<LogSmallDto>( entityList.size() );
        for ( Log log : entityList ) {
            list.add( toDto( log ) );
        }

        return list;
    }
}
