package com.example;

import java.util.ArrayList;

public class StudentList {

  Logger logger;

  private ArrayList<Student> students = new ArrayList<Student>();

  StudentList(Logger logger){		
    this.logger = logger;
	}

  public void addStudent(String name, String className, String rollNo){
    students.add(new Student(name, className, rollNo, logger));    
    logger.log("Student added to list [" + name + ", " + className + ", " + rollNo + "]");
  }

}
