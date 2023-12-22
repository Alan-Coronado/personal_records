package com.alancoronado.personalfinancialrecordsapi.service;

import com.alancoronado.personalfinancialrecordsapi.mapper.AccountMapper;
import com.alancoronado.personalfinancialrecordsapi.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

    @Autowired
    AccountMapper mapper;

}
