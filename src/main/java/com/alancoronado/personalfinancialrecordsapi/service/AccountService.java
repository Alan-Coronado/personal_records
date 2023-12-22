package com.alancoronado.personalfinancialrecordsapi.service;

import com.alancoronado.personalfinancialrecordsapi.dto.AccountDTO;
import com.alancoronado.personalfinancialrecordsapi.dto.CreateAccountDTO;
import com.alancoronado.personalfinancialrecordsapi.mapper.AccountMapper;
import com.alancoronado.personalfinancialrecordsapi.model.Account;
import com.alancoronado.personalfinancialrecordsapi.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

    @Autowired
    AccountMapper mapper;

    public AccountDTO save(CreateAccountDTO data){
        Account entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }

    public List<AccountDTO> findAll(){
        return repository.findAll().stream().map(mapper::toDTO).toList();
    }

}
