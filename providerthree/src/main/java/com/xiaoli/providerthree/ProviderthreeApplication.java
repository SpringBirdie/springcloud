package com.xiaoli.providerthree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiaoli.providerthree.dao")
public class ProviderthreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderthreeApplication.class, args);
    }

}
