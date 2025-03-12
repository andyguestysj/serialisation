package com.example;

import java.io.Serializable;

public class Student implements Serializable{

  String name;
	String className;
	String rollNo;
 
	//Constructor.
	Student(String name, String className, String rollNo, Logger logger){
		this.name = name;
		this.className = className;
		this.rollNo = rollNo;

		logger.log("Student created [" + this.name + ", " + this.className + ", " + this.rollNo + "]");
	}

	public void displayStudent(){
		System.out.println(this.name + ", " + this.className + ", " + this.rollNo);
	}

	public String getName() { return name;}

}
