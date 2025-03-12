package com.example;

public final class App {


    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        FileIO fileHandler = new FileIO("iofiles");
        Logger logger = new Logger("iofiles","log.txt");
        StudentList allStudents = new StudentList(logger);

        allStudents.addStudent("James", "Art", "15404");        
        allStudents.populateStudentList(logger);
        allStudents.displayList();

        fileHandler.saveStudent(allStudents.getStudent(), "student_save.ser",logger);
        fileHandler.loadStudent("student_save.ser",logger).displayStudent();

        fileHandler.saveStudentList(allStudents, "student_save.ser", logger);

        StudentList newList = new StudentList(logger);
        newList.setStudentList(fileHandler.loadStudentList("student_save.ser", logger), logger);

        newList.displayList();

        logger.tidyUp();


    }
}