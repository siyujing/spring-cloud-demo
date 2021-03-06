package com.testingedu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String clientService(String name){
        return restTemplate.getForObject("http://TESTING1-CLOUD-EUREKA-CLIENT/hi?name="+name,String.class);
//        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String clientError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
