package com.alancoronado.personalfinancialrecordsapi.controller;

import com.alancoronado.personalfinancialrecordsapi.dto.CreateRecordDTO;
import com.alancoronado.personalfinancialrecordsapi.dto.RecordDTO;
import com.alancoronado.personalfinancialrecordsapi.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("records")
public class RecordController {

    @Autowired
    RecordService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecordDTO save(@RequestBody CreateRecordDTO data){
        return service.save(data);
    }

}
