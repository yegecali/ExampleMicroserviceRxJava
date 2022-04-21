package com.yegecali.MsAccount.repository;

import com.yegecali.MsAccount.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    Account findByNumberAccount(String numberAccount);
}
