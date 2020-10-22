package com.example.client_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //注入到注册中心
@EnableFeignClients	//开启feign
public class Client03Application {

	public static void main(String[] args) {
		SpringApplication.run(Client03Application.class, args);
	}

}
