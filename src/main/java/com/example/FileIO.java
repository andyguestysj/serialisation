package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {

  String folder;

  OutputStream output;
  InputStream input;

  FileIO(String folder) {

    this.folder = folder;
    File folderHandle = new File(folder);
    if (!folderHandle.exists()) {
      folderHandle.mkdirs();
    }

  }

  public void saveStudent(Student s, String file, Logger logger) {
    try (
        // Creating FileOutputStream object.
        FileOutputStream fos = new FileOutputStream(folder + "\\" + file);
        // Creating ObjectOutputStream object.
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
      // write object.
      oos.writeObject(s);
      logger.log("Student [" + s.getName() + "] saved to file [" + folder + "\\" + file +"]");

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public Student loadStudent(String file, Logger logger) {
    try (
        // Creating FileOutputStream object.
        FileInputStream fis = new FileInputStream(folder + "\\" + file);
        // Creating ObjectOutputStream object.
        ObjectInputStream ois = new ObjectInputStream(fis);) {
      // load object

      // write object.
      Student s = (Student) ois.readObject();
      logger.log("Student [" + s.getName() + "] loaded from file [" + folder + "\\" + file +"]");
      return s;
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    
  }

  public void saveStudentList(StudentList sl, String file, Logger logger) {
    try (
        // Creating FileOutputStream object.
        FileOutputStream fos = new FileOutputStream(folder + "\\" + file);
        // Creating ObjectOutputStream object.
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
      // write object.
      oos.writeObject(sl.getArray());
      logger.log("Student list saved to file [" + folder + "\\" + file +"]");

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public  ArrayList<Student> loadStudentList(String file, Logger logger) {
    try (
        // Creating FileOutputStream object.
        FileInputStream fis = new FileInputStream(folder + "\\" + file);
        // Creating ObjectOutputStream object.
        ObjectInputStream ois = new ObjectInputStream(fis);) {
      // load object

      // write object.
      ArrayList<Student> sl = ( ArrayList<Student>) ois.readObject();
      logger.log("Student list loaded from file [" + folder + "\\" + file +"]");
      return sl;
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    
  }

}
