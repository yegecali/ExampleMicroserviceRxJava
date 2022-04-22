package com.yegecali.MsAccount.controller;

import com.yegecali.MsAccount.dto.AccountDto;
import com.yegecali.MsAccount.service.IAccountService;
import io.reactivex.Completable;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @GetMapping("/{id}")
    public Single<AccountDto> getById(@PathVariable("id") String id){
        return accountService.getById(id);
    }

    @GetMapping("/account-number/{accountnumber}")
    public Single<AccountDto> getbyNumberAccount(@PathVariable("accountnumber") String accountnumber){
        return accountService.findByNumberAccount(accountnumber);
    }

    @PostMapping
    public Single<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return accountService.add(accountDto);
    }

    @PutMapping("/{id}")
    public Completable updateAccount(@RequestBody AccountDto accountDto, @PathVariable("id") String id){
        return accountService.update(accountDto, id);
    }

    @DeleteMapping("/{id}")
    public Completable deleteAccountById(@PathVariable("id") String id){
        return accountService.deleteById(id);
    }

}
