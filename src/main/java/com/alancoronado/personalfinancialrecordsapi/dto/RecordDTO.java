package com.alancoronado.personalfinancialrecordsapi.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RecordDTO {
    private long id;
    private BigDecimal amount;
    private AccountDisplayDTO account;
}
