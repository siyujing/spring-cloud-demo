package com.testingedu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by boxfish on 17/10/27.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

// @HystrixCommand 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串，字符串为”hi,”+name+”,sorry,error!”
    @HystrixCommand(fallbackMethod = "clientError")
    public String clientService(String name){
        return restTemplate.getForObject("http://boxfish1-cloud-eureka-client/hi?name="+name,String.class);
    }

    public String clientError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
