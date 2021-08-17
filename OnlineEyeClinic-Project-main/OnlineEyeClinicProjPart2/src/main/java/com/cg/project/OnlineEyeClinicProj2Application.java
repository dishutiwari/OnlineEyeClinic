package com.cg.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.project")
public class OnlineEyeClinicProj2Application {

	public static void main(String[] args) {
		SpringApplication.run(OnlineEyeClinicProj2Application.class, args);
	}

}
