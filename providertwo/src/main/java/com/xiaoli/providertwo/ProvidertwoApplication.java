package com.xiaoli.providertwo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiaoli.providertwo.dao")
public class ProvidertwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvidertwoApplication.class, args);
    }

}
