package com.yegecali.MsOperation.client.Api;

import com.yegecali.MsOperation.client.dto.AccountDto;
import io.reactivex.Completable;
import io.reactivex.Single;
import org.springframework.cloud.square.retrofit.core.RetrofitClient;
import org.springframework.stereotype.Component;
import retrofit2.http.*;

import java.util.List;

@RetrofitClient("ms-account")
public interface AccountApi {
    @GET("api/account")
    Single<List<AccountDto>> listAccount();
    @GET("api/account/{id}")
    Single<AccountDto> getById(@Path("id") String id);
    @GET("api/account/account-number/{accountnumber}")
    Single<AccountDto> getByNumberAccount(@Path("accountnumber") String accountnumber);
    @POST("api/account")
    Single<AccountDto> addAccount(@Body AccountDto accountDto);
    @PUT("api/account/{id}")
    Completable updateAccount(@Body AccountDto accountDto, @Path("id") String id);
    @DELETE("api/account/{id}")
    Completable deleteAccount(@Path("id") String id);
}
