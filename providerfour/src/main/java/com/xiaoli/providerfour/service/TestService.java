package com.xiaoli.providerfour.service;

import com.xiaoli.providerfour.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public String TestMethod(){
        return "你好，张庭燕4";
    }

    public String getValue() {
        return testMapper.getValue();
    }
}
