package com.yegecali.MsOperation.config;

import okhttp3.OkHttpClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.square.retrofit.EnableRetrofitClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableRetrofitClients
@Configuration
public class OkHttpClientConfig {

    @Bean
    @LoadBalanced
    public OkHttpClient.Builder okHttpClientBuilder(){
        return new OkHttpClient.Builder();
    }

}
