package com.yegecali.MsAccount.service;

import com.yegecali.MsAccount.dto.AccountDto;
import io.reactivex.Single;
import org.springframework.stereotype.Service;


public interface IAccountService extends BaseService<AccountDto, String> {
    Single<AccountDto> findByNumberAccount(String numberAccount);
}
