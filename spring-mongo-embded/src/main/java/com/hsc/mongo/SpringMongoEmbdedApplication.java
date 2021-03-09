package com.hsc.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hsc.mongo")
public class SpringMongoEmbdedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoEmbdedApplication.class, args);
	}

}
