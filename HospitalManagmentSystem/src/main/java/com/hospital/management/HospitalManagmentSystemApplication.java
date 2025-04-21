package com.hospital.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hospital.management1")
public class HospitalManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagmentSystemApplication.class, args);
		System.out.println("Welcome to Hospital Managment System...");
	}

}
