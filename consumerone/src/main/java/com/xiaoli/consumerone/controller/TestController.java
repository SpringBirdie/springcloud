package com.xiaoli.consumerone.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getHystrix")
    @GetMapping("/test/get")
    public String TestMethod() {
        //此参数为注册在Eureka中的服务
        String ticketName = restTemplate.getForObject("http://provider-one//xl/test/get", String.class);
        return ticketName;
    }

    @GetMapping("/test")
    public String getValue() {
        //此参数为注册在Eureka中的服务
        String ticketName = restTemplate.getForObject("http://provider-one//xl/test", String.class);
        return ticketName;
    }

    public String getHystrix() {
		//测试提交
        return "getHystrix";
    }
}