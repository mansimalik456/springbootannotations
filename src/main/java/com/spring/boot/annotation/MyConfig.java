package com.spring.boot.annotation;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"mypack"})
public class MyConfig {
	

	@Bean("student1")
	@Lazy
	public Student getStudent() {
		System.out.println("Creating first Student Object");
		return new Student("Student1");
	}
	
	@Bean("student2")
	@Lazy
	public Student createStudent() {
		System.out.println("Creating Second Student Object");
		return new Student("Student2");
	}
	
	@Bean
	public Date getdate() {
		System.out.println("Creating new date");
		return new Date(); 
	}

}
