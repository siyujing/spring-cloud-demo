package com.testingedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@CrossOrigin("*")
public class Boxfish0TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boxfish0TestApplication.class, args);
	}

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String test1(){
		return "ok";
	}
}
