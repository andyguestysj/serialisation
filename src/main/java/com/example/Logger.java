package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Logger {
  
  OutputStream output;

  Logger(String folder, String file){

    // Check to see if the output folder exists and if does not then make it
    File folderHandle = new File(folder);
    if (!folderHandle.exists())
    {
      folderHandle.mkdirs();
    }

    // create/open the file for logging
    try {
      output = new FileOutputStream(folder+"\\"+file,true); // true to append, false/missing to create new blank file
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }

  }

  public void tidyUp(){
    // close the file safely
    try {
      output.close();
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
  }

  public void log(String logString){


    // write safely to file or crash gracefully(ish)
    try {
      output.write(logString.getBytes());
      output.write(System.lineSeparator().getBytes());
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);      
    }
  }

}
