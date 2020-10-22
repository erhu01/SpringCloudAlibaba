package com.example.client_04.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiong
 * @Date: 2020/10/20 9:37
 */
@RestController
public class TestController {
    @PostMapping("getAbc")
    public String getAbc(){
        return "生产者4";
    }
}
