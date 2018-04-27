package com.testingedu.web;

import com.testingedu.service.SchedualServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {

    @Autowired
    SchedualServiceClient schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @CrossOrigin
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return schedualServiceHi.sayHelloFromClientOne(name);
    }
}
