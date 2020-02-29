package com.xiaoli.providerthree.service;

import com.xiaoli.providerthree.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestMapper testDao;

    public String TestMethod(){
        return "你好，李冬3";
    }

    public String getValue() {
        return testDao.getValue();
    }
}
