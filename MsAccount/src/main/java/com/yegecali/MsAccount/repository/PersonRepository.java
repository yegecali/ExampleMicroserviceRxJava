package com.yegecali.MsAccount.repository;

import com.yegecali.MsAccount.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    Optional<Person> findByNumberDocument(String numberDocument);
}
