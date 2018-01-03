package com.testingedu.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by boxfish on 17/10/30.
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
