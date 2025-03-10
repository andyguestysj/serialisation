package com.example;

import java.io.Serializable;

public class Student implements Serializable{

  String name;
	String className;
	String rollNo;
 
	//Constructor.
	Student(String name, String className, String rollNo){
		this.name = name;
		this.className = className;
		this.rollNo = rollNo;
	}

}
