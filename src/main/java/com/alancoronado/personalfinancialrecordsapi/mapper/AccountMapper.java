package com.alancoronado.personalfinancialrecordsapi.mapper;

import com.alancoronado.personalfinancialrecordsapi.dto.AccountDTO;
import com.alancoronado.personalfinancialrecordsapi.dto.CreateAccountDTO;
import com.alancoronado.personalfinancialrecordsapi.model.Account;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AccountMapper {

    AccountDTO toDTO(Account model);

    @Mapping(target = "id", ignore = true)
    Account toModel(CreateAccountDTO dto);

    @Mapping(target = "id")
    Account toModel(AccountDTO dto);
}
