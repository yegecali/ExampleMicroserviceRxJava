package com.yegecali.MsAccount.service.impl;

import com.yegecali.MsAccount.dto.AccountDto;
import com.yegecali.MsAccount.service.IAccountService;
import io.reactivex.Completable;
import io.reactivex.Single;

import java.util.List;

public class AccountService implements IAccountService {
    @Override
    public Single<AccountDto> add(String s) {
        return null;
    }

    @Override
    public Completable update(AccountDto e, String s) {
        return null;
    }

    @Override
    public Single<List<AccountDto>> getAll() {
        return null;
    }

    @Override
    public Single<AccountDto> getById() {
        return null;
    }

    @Override
    public Completable deleteById(String s) {
        return null;
    }

    @Override
    public Single<AccountDto> findByNumberAccount(String numberAccount) {
        return null;
    }
}
