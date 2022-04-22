package com.yegecali.MsAccount.repository;

import com.yegecali.MsAccount.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    Optional<Account> findByNumberAccount(String numberAccount);
}
