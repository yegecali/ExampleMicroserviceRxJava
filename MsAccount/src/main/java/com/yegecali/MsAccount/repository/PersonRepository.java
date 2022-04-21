package com.yegecali.MsAccount.repository;

import com.yegecali.MsAccount.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByNumberDocument(String numberDocument);
}
