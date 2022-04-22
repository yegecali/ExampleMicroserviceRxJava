package com.yegecali.MsAccount.service.impl;

import com.yegecali.MsAccount.dto.AccountDto;
import com.yegecali.MsAccount.model.Account;
import com.yegecali.MsAccount.repository.AccountRepository;
import com.yegecali.MsAccount.service.IAccountService;
import io.reactivex.Completable;
import io.reactivex.Single;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Single<AccountDto> add(AccountDto e) {
        return Single.create(singleEmitter -> {
            Account acInsert = mapper.map(e, Account.class);
            AccountDto acDto = mapper.map(accountRepository.save(acInsert), AccountDto.class);
            singleEmitter.onSuccess(acDto);
        });
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
