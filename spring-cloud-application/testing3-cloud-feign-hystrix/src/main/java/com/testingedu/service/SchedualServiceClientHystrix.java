package com.testingedu.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * SchedualServiceClientHystrix 需要实现 SchedualServiceClient 接口，并注入到Ioc容器中（ 使用 @Component 注入 ）
 */
@Component
public class SchedualServiceClientHystrix implements SchedualServiceClient {

    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }

    @Override
    public String sayHelloFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}
