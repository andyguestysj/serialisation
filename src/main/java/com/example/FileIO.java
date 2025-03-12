package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO {

  String folder;
  
  File   fStudent; // File to store a single student
  File   fStudentList; // File to store a list of students

  OutputStream output;
  InputStream input;

  FileIO(String folder){

    File folderHandle = new File(folder);
    if (!folderHandle.exists())
    {
      folderHandle.mkdirs();
    }

  }

}
