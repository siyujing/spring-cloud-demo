package com.testingedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient 							// 在工程的启动类中,通过 @EnableDiscoveryClient 向服务中心注册
public class Testing2CloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(Testing2CloudRibbonApplication.class, args);
	}

	@Bean										// 向程序的ioc注入一个 bean: restTemplate
	@LoadBalanced								// @LoadBalanced 注解表明这个restRemplate开启负载均衡的功能
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
