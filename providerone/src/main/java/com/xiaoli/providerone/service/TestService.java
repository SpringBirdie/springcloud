package com.xiaoli.providerone.service;


import com.xiaoli.providerone.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestMapper testDao;

    public String TestMethod(){
        return "你好，李冬1";
    }

    public String getValue() {
        return testDao.getValue();
    }
}
