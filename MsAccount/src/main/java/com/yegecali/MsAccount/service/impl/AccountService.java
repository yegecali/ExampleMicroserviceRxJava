package com.yegecali.MsAccount.service.impl;

import com.yegecali.MsAccount.dto.AccountDto;
import com.yegecali.MsAccount.exceptions.EntityNotFoundException;
import com.yegecali.MsAccount.model.Account;
import com.yegecali.MsAccount.repository.AccountRepository;
import com.yegecali.MsAccount.service.IAccountService;
import io.reactivex.Completable;
import io.reactivex.Single;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        return Completable.create(completableEmitter -> {
            Optional<Account> account = accountRepository.findById(s);
            if(!account.isPresent()){
                completableEmitter.onError(new EntityNotFoundException("id", s));
            }else {
                Account acDto = account.get();
                acDto.setBalance(e.getBalance());
                acDto.setNumberAccount(e.getNumberAccount());
                acDto.setNumberDocumentPerson(e.getNumberDocumentPerson());
                accountRepository.save(acDto);
                completableEmitter.onComplete();
            }
        });
    }

    @Override
    public Single<List<AccountDto>> getAll() {
        return Single.create(singleEmitter -> {
            List<AccountDto> listAc = accountRepository
                    .findAll()
                    .stream()
                    .map(x -> mapper.map(x, AccountDto.class))
                    .collect(Collectors.toList());
           singleEmitter.onSuccess(listAc);
        });
    }

    @Override
    public Single<AccountDto> getById(String id) {
        return Single.create(singleEmitter -> {
            Optional<Account> opAcc = accountRepository.findById(id);
            if (!opAcc.isPresent()) {
                singleEmitter.onError(new EntityNotFoundException("id", id));
            } else {
                AccountDto accDto = mapper.map(opAcc.get(), AccountDto.class);
                singleEmitter.onSuccess(accDto);
            }
        });
    }

    @Override
    public Completable deleteById(String s) {
        return Completable.create(completableEmitter -> {
            Optional<Account> account = accountRepository.findById(s);
            if(!account.isPresent()){
                completableEmitter.onError(new EntityNotFoundException("id", s));
            }else {
                accountRepository.deleteById(s);
                completableEmitter.onComplete();
            }
        });
    }

    @Override
    public Single<AccountDto> findByNumberAccount(String numberAccount) {
        return Single.create(singleEmitter -> {
            Optional<Account> opAcc = accountRepository.findByNumberAccount(numberAccount);
            if (!opAcc.isPresent()) {
                singleEmitter.onError(new EntityNotFoundException("numberAccount", numberAccount));
            } else {
                AccountDto accDto = mapper.map(opAcc.get(), AccountDto.class);
                singleEmitter.onSuccess(accDto);
            }
        });
    }
}
