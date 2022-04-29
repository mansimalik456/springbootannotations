package com.spring.boot.annotation;

public class Student {
	
	
	String name;
	

	public Student(String name) {
		this.name = name;
	}


	public void studing() {
		System.out.println(this.name + " " +"Student is Studing");
	}

	
}
