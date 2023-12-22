package com.alancoronado.personalfinancialrecordsapi.controller;

import com.alancoronado.personalfinancialrecordsapi.dto.AccountDTO;
import com.alancoronado.personalfinancialrecordsapi.dto.CreateAccountDTO;
import com.alancoronado.personalfinancialrecordsapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    AccountService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AccountDTO save(@RequestBody CreateAccountDTO data){
        return service.save(data);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AccountDTO> findAll(){
        return service.findAll();
    }

}
