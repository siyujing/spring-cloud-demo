package com.testingedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * dev	开发环境配置文件
 * test 测试环境
 * pro	正式环境
 * <p>
 * 如 访问的文件:test-pro 访问正式环境:pro  则访问路径:http://localhost:8888/test-pro/pro
 * result:{
 * "name": "test",
 * "profiles": ["dev"],
 * "label": null,
 * "version": null,
 * "state": null,
 * "propertySources": [
 * {
 * "name": "https://github.com/siyujing/heziyu/testFail/test-dev.properties",
 * "source": {
 * "foo": "nihao dev"
 * }
 * }]
 * }
 */
@SpringBootApplication
@EnableConfigServer                        // @EnableConfigServer注解开启配置服务器的功能
public class Testing5CloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Testing5CloudConfigApplication.class, args);
    }
}
