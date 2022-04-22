package com.yegecali.MsOperation.client.service;

import com.netflix.discovery.converters.Auto;
import com.yegecali.MsOperation.client.Api.AccountApi;
import com.yegecali.MsOperation.client.dto.AccountDto;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

@Service
public class AccountService {
//    @Autowired
//    private AccountApi accountApi;
    private AccountApi accountApi;

    public AccountService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8002/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        this.accountApi = retrofit.create(AccountApi.class);
    }

    public Single<List<AccountDto>> getAll(){
        return accountApi.listAccount();
    }
}
