package com.xiaoli.providerone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiaoli.providerone.dao")
public class ProvideroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideroneApplication.class, args);
    }

}
