package com.alancoronado.personalfinancialrecordsapi.mapper;


import com.alancoronado.personalfinancialrecordsapi.dto.CreateRecordDTO;
import com.alancoronado.personalfinancialrecordsapi.dto.RecordDTO;
import com.alancoronado.personalfinancialrecordsapi.model.Record;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RecordMapper {

    RecordDTO toDTO(Record model);

    @Mapping(target = "id", ignore = true)
    Record toModel(CreateRecordDTO dto);

}
