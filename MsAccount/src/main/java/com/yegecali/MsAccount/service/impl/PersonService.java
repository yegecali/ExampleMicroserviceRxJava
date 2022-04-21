package com.yegecali.MsAccount.service.impl;

import com.yegecali.MsAccount.dto.PersonDto;
import com.yegecali.MsAccount.service.IPersonService;
import io.reactivex.Completable;
import io.reactivex.Single;

import java.util.List;

public class PersonService implements IPersonService {
    @Override
    public Single<PersonDto> add(String s) {
        return null;
    }

    @Override
    public Completable update(PersonDto e, String s) {
        return null;
    }

    @Override
    public Single<List<PersonDto>> getAll() {
        return null;
    }

    @Override
    public Single<PersonDto> getById() {
        return null;
    }

    @Override
    public Completable deleteById(String s) {
        return null;
    }

    @Override
    public Single<PersonDto> getByNumberDocument(String numberDocument) {
        return null;
    }
}
