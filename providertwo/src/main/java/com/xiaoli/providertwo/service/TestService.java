package com.xiaoli.providertwo.service;


import com.xiaoli.providertwo.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public String TestMethod(){
        return "你好，张庭燕2";
    }

    public String getValue() {
        return testMapper.getValue();
    }
}
