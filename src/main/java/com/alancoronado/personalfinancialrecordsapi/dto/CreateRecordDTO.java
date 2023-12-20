package com.alancoronado.personalfinancialrecordsapi.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateRecordDTO {
    private BigDecimal amount;
}
