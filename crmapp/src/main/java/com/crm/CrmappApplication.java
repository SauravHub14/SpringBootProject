package com.crm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages= "com.crm.controller,"+"com.crm.entities,"+"com.crm.repositories,"+"com.crm.services,"+"com.crm.utilities")
public class CrmappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmappApplication.class, args);
	}

}
