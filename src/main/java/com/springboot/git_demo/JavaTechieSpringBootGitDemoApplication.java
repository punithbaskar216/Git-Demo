package com.springboot.git_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTechieSpringBootGitDemoApplication {

	public void addData(String data) {
		if (data.equals(Constant.data_type)) {
			System.out.println("Welcome");
		}
	}
	
	public void addMethod()
	{
		System.out.println("new Method");
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaTechieSpringBootGitDemoApplication.class, args);
		System.out.println("Spring Boot Demo...");
	}

}
