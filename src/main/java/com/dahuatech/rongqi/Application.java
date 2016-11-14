package com.dahuatech.rongqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication  //是以上三个替代
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
