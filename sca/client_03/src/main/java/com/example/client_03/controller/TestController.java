package com.example.client_03.controller;

import com.example.client_03.service.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiong
 * @Date: 2020/10/20 10:16
 */
@RestController
public class TestController {

    @Autowired
    TestFeign testFeign;

    @PostMapping("/getAbc")
    public String getAbc(){
        return testFeign.getAbc();
    }

}
