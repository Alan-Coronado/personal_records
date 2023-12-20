package com.alancoronado.personalfinancialrecordsapi.service;

import com.alancoronado.personalfinancialrecordsapi.dto.CreateRecordDTO;
import com.alancoronado.personalfinancialrecordsapi.dto.RecordDTO;
import com.alancoronado.personalfinancialrecordsapi.mapper.RecordMapper;
import com.alancoronado.personalfinancialrecordsapi.model.Record;
import com.alancoronado.personalfinancialrecordsapi.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

    @Autowired
    RecordRepository repository;

    @Autowired
    RecordMapper mapper;

    public RecordDTO save(CreateRecordDTO data){
        Record entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }

}
