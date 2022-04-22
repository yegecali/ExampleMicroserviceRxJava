package com.yegecali.MsAccount.service;


import io.reactivex.Completable;
import io.reactivex.Single;

import java.util.List;

public interface BaseService<ENTITY, ID> {
    Single<ENTITY> add(ENTITY e);
    Completable update(ENTITY e, ID id);
    Single<List<ENTITY>> getAll();
    Single<ENTITY> getById();
    Completable deleteById(ID id);

}
