package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring cloud 为开发人员提供了快速构建分布式系统的一些工具，包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等。它运行环境简单，可以在开发人员的电脑上跑。另外说明spring cloud是基于springboot的.
 * eureka是一个服务注册和发现模块。
 *
 * 使用高可用的服务注册中心需要修改文件 etc/hosts:
 * linux系统通过vim /etc/hosts（或者使用sudo vim +fileName :修改只读文件）
 * windows电脑，在c:/windows/systems/drivers/etc/hosts 修改
 * 新增两行内容:
 * 127.0.0.1 peer1
 * 127.0.0.1 peer2
 * 分别启动配置peer1,peer2
 *
 * 注: eureka.instance.preferIpAddress=true是通过设置ip让eureka让其他服务注册它。也许能通过去改变去通过改变host的方式。
 * Eureka-server peer1 8761,Eureka-eserver peer2 8769相互感应，当有服务注册时，
 * 两个Eureka-server是对等的，它们都存有相同的信息，这就是通过服务器的冗余来增加可靠性，当有一台服务器宕机了，服务并不会终止，因为另一台服务存有相同的数据。
 *
 * 测试：启动一个服务（testing1-cloud-eureka-client）注册到8761 或者8769 中任意一个服务，可以看到两个eureka 中都有这个新注册的服务。
 */
@EnableEurekaServer
@SpringBootApplication
public class Testing1CloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Testing1CloudEurekaApplication.class, args);
	}
}
