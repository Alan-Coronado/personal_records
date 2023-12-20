package com.alancoronado.personalfinancialrecordsapi.mapper;


import com.alancoronado.personalfinancialrecordsapi.dto.RecordDTO;
import com.alancoronado.personalfinancialrecordsapi.model.Record;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RecordMapper {

    RecordDTO toDTO(Record model);

}
