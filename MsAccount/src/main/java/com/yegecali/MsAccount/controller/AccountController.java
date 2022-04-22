package com.yegecali.MsAccount.controller;

import com.yegecali.MsAccount.dto.AccountDto;
import com.yegecali.MsAccount.service.IAccountService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @PostMapping
    public Single<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return accountService.add(accountDto);
    }
}
