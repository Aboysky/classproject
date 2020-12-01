package cn.edu.sicnu.cs.datamapper;

import cn.edu.sicnu.cs.dto.LogErrorDto;
import cn.edu.sicnu.cs.entity.Log;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-01T11:36:06+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
@Component
public class LogErrorMapperImpl implements LogErrorMapper {

    @Override
    public Log toEntity(LogErrorDto dto) {
        if ( dto == null ) {
            return null;
        }

        Log log = new Log();

        log.setId( dto.getId() );
        log.setUsername( dto.getUsername() );
        log.setDescription( dto.getDescription() );
        log.setMethod( dto.getMethod() );
        log.setParams( dto.getParams() );
        log.setRequestIp( dto.getRequestIp() );
        log.setAddress( dto.getAddress() );
        log.setBrowser( dto.getBrowser() );
        log.setCreateTime( dto.getCreateTime() );

        return log;
    }

    @Override
    public LogErrorDto toDto(Log entity) {
        if ( entity == null ) {
            return null;
        }

        LogErrorDto logErrorDto = new LogErrorDto();

        logErrorDto.setId( entity.getId() );
        logErrorDto.setUsername( entity.getUsername() );
        logErrorDto.setDescription( entity.getDescription() );
        logErrorDto.setMethod( entity.getMethod() );
        logErrorDto.setParams( entity.getParams() );
        logErrorDto.setBrowser( entity.getBrowser() );
        logErrorDto.setRequestIp( entity.getRequestIp() );
        logErrorDto.setAddress( entity.getAddress() );
        logErrorDto.setCreateTime( entity.getCreateTime() );

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
