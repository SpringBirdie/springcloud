package com.xiaoli.serverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServeroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServeroneApplication.class, args);
    }

}
