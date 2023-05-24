package com.citi.testdriven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FrontConverterTestDrivenDevlopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontConverterTestDrivenDevlopmentApplication.class, args);
	}
	
	  @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }

}
