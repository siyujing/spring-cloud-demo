package com.testingedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy						// 加上注解 @EnableZuulProxy，开启zuul的功能(路由转发)
@EnableEurekaClient
@SpringBootApplication
public class Testing4CloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Testing4CloudZuulApplication.class, args);
	}
}
