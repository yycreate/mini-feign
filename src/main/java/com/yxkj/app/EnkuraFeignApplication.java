package com.yxkj.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.yxkj.function.service"})
@ComponentScan(basePackages = {"com.yxkj.function.controller"})
public class EnkuraFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnkuraFeignApplication.class, args);
	}
}
