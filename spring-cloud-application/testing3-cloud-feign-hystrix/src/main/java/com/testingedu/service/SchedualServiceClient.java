package com.testingedu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign 自带断路由,只需要在 SchedualServiceClient 接口的注解中加上fallback的指定类就行了
 */
@FeignClient(value = "boxfish1-cloud-eureka-client",fallback = SchedualServiceClientHystrix.class)
public interface SchedualServiceClient {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);

}
