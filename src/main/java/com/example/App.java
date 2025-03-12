package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Hello world!
 */
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

        Student s1 = new Student("James", "Art", "15404", logger);

        
        

        logger.tidyUp();


    }
/* 
    public static void objectSerialization(Student stu) {
        try {
            // Creating FileOutputStream object.
            FileOutputStream fos = new FileOutputStream("iofiles\\student.ser");

            // Creating ObjectOutputStream object.
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // write object.
            oos.writeObject(stu);

            // close streams.
            oos.close();
            fos.close();

            System.out.println("Serialized data is saved in " +
                    "iofiles\\student.ser");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void objectSerializationArray() {
        try {
            // Creating FileOutputStream object.
            FileOutputStream fos = new FileOutputStream("iofiles\\studentList.ser");

            // Creating ObjectOutputStream object.
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // write object.
            // for (Student s:studentList){
            oos.writeObject(studentList);
            // }

            // close streams.
            oos.close();
            fos.close();

            System.out.println("Serialized data is saved in " +
                    "iofiles\\studentList.ser");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Student objectDeSerialization() {
        Student stu = null;
        try {

            // Creating FileOutputStream object.
            FileInputStream fis = new FileInputStream("iofiles\\student.ser");

            // Creating ObjectOutputStream object.
            ObjectInputStream ois = new ObjectInputStream(fis);

            // write object.
            stu = (Student) ois.readObject();

            // close streams.
            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return stu;
    }

    @SuppressWarnings("unchecked")
    public static void objectDeSerializationArray() {
        try {

            // Creating FileOutputStream object.
            FileInputStream fis = new FileInputStream("iofiles\\studentList.ser");

            // Creating ObjectOutputStream object.
            ObjectInputStream ois = new ObjectInputStream(fis);

            // write object.
            studentListLoaded = (ArrayList<Student>) ois.readObject();

            // close streams.
            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void buildStudentList() {
        String[] names = { "John Smith", "Sally Fields", "Duck Rogers", "Ford Prefect", "Tricia Macmillian" };
        String[] classNames = { "Art", "History", "Maths", "History", "Art" };
        String[] rollNo = { "11092", "11298", "10043", "10032", "78654" };

        for (int loop = 0; loop < 5; loop++) {
            studentList.add(new Student(names[loop], classNames[loop], rollNo[loop]));
        }
    }

    public void simpleDataRW() {
        myFile outputFile = new myFile("out.txt");

        String outputString = "Some stuff to write to a file";

        outputFile.outputToFile(outputString);

        System.out.println(outputFile.readFromFile("iofiles/out.txt"));

    }
        */
}
