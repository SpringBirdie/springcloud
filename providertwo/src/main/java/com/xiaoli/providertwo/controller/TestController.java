package com.xiaoli.providertwo.controller;

import com.xiaoli.providertwo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/zty")
public class TestController {

    @Autowired
    private TestService testService;

    @Value("${xiaoli}")
    private String v;

    @RequestMapping(value = "/test/get",method = RequestMethod.GET)
    public String TestMethod(){
        return testService.TestMethod();
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getValue() {
        String result = testService.getValue();
        System.out.println(v);
        return result;
    }
}
