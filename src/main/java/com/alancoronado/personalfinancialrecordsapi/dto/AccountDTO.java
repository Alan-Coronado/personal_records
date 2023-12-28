package com.alancoronado.personalfinancialrecordsapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class AccountDTO {
    private long id;
    private String name;
    private List<RecordDisplayDTO> records;
}
