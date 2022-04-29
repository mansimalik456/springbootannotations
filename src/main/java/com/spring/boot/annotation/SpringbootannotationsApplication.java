package com.spring.boot.annotation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mypack.Dog;

@SpringBootApplication
public class SpringbootannotationsApplication implements CommandLineRunner{

	
	@Autowired 
	@Qualifier("student2")
	private Student student;
	
	@Autowired
	private Date date;
	
	@Autowired
	private Emp emp;
	
	
	@Autowired
	private Dog dog;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootannotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.student.studing();
		
		this.emp.whatsYourName();
		
		this.dog.eating();
		
	}

}
