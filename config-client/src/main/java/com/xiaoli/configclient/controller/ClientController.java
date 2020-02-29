package com.xiaoli.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${BBB}")
    private String a;

    @RequestMapping("/hello")
    public String getValue(@RequestParam String name) {
        return name+":"+a;
    }

}
