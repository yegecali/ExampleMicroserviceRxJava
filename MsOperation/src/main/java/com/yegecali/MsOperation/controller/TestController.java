package com.yegecali.MsOperation.controller;

import com.netflix.discovery.converters.Auto;
import com.yegecali.MsOperation.client.dto.AccountDto;
import com.yegecali.MsOperation.client.service.AccountService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public Single<List<AccountDto>> getall(){
        return accountService.getAll();
    }

}
