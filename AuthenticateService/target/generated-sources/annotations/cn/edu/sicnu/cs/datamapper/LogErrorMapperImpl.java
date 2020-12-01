package cn.edu.sicnu.cs.datamapper;

import cn.edu.sicnu.cs.dto.LogErrorDto;
import cn.edu.sicnu.cs.entity.Log;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-01T15:24:32+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 12.0.2 (Oracle Corporation)"
)
@Component
public class LogErrorMapperImpl implements LogErrorMapper {

    @Override
    public Log toEntity(LogErrorDto dto) {
        if ( dto == null ) {
            return null;
        }

        Log log = new Log();

        return log;
    }

    @Override
    public LogErrorDto toDto(Log entity) {
        if ( entity == null ) {
            return null;
        }

        LogErrorDto logErrorDto = new LogErrorDto();

        return logErrorDto;
    }

    @Override
    public List<Log> toEntity(List<LogErrorDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Log> list = new ArrayList<Log>( dtoList.size() );
        for ( LogErrorDto logErrorDto : dtoList ) {
            list.add( toEntity( logErrorDto ) );
        }

        return list;
    }

    @Override
    public List<LogErrorDto> toDto(List<Log> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LogErrorDto> list = new ArrayList<LogErrorDto>( entityList.size() );
        for ( Log log : entityList ) {
            list.add( toDto( log ) );
        }

        return list;
    }
}
