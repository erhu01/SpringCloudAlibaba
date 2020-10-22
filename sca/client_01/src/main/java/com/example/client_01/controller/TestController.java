package com.example.client_01.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiong
 * @Date: 2020/10/20 9:37
 */
@RestController
@RefreshScope//spring原生方法，自动刷新配置
public class TestController {

    //这是nacos原生的注解，但是这次还不能用
    //@NacosValue(value = "${test.test:avc}", autoRefreshed = true)
    @Value("${test.test:avbc}")//从远程获取属性值
    private String test;

    @PostMapping("getAbc")
    public String getAbc(){
        return "生产者1--------------"+test;
    }

}
