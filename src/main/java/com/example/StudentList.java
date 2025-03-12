package com.example;

import java.util.ArrayList;

public class StudentList {

  Logger logger;

  private ArrayList<Student> students = new ArrayList<Student>();

  StudentList(Logger logger){		
    this.logger = logger;
    logger.log("Student list created");
	}

  public void addStudent(String name, String className, String rollNo){
    students.add(new Student(name, className, rollNo, logger));    
    logger.log("Student added to list [" + name + ", " + className + ", " + rollNo + "]");
  }

  public void populateStudentList(Logger logger){
    String theStudents[][] = {
        {"John Smith","Art","11932"},
        {"Sally Brown","Maths","13154"},
        {"Tom Hanks","History","98872"},
        {"Chloe Burns","Art","72893"},
        {"Halle Berry","Physics","43451"}
    };

    for (int i = 0; i< theStudents.length; i++){
        addStudent(theStudents[i][0],theStudents[i][1],theStudents[i][2]);
    }

    logger.log("Student list populated");
  }

  public void displayList(){
    System.out.println("List contains:");
    for (Student s:students){
      System.out.print("\t");
      s.displayStudent();
    }
  }

  public Student getStudent(){
    return students.get(0);
  }

  public  ArrayList<Student> getArray() { return students;}

  public void setStudentList(ArrayList<Student> arrayStudents, Logger logger){
    students = (ArrayList)arrayStudents.clone();
    logger.log("Student list cloned");
  }

}
