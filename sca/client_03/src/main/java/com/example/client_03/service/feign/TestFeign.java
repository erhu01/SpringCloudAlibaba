package com.example.client_03.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: xiong
 * @Date: 2020/10/20 10:13
 */
@FeignClient(name = "client-01")  //name表示请求的服务名称
public interface TestFeign {

    @PostMapping("getAbc")
    String getAbc();

}
