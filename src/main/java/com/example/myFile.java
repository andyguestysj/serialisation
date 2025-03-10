package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class myFile {

  String filename;
  File   fileHandle;
  OutputStream output;
  InputStream input;

  public myFile(String filename){

    File dirHandle = new File("iofiles");
    if (!dirHandle.exists())
    {
      dirHandle.mkdirs();
    }

    this.filename = dirHandle + "\\" + filename;
    File fileHandle = new File(this.filename);

    if (!fileHandle.exists())
      {
        try {
          fileHandle.createNewFile();            
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }  

    // file exists

    

  }

  public void outputToFile(String outputString){

    try {
      this.output = new FileOutputStream(this.filename);
      this.output.write(outputString.getBytes());
      this.output.close();
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
      // shouldn't happen
    }
  }

  public String readFromFile(String inputFile){
    String readString = "";
    try {
      this.input = new FileInputStream(inputFile);

      int data = input.read();
      while (data!=-1){
        readString += (char)data;
        data = input.read();
      }
      

      this.input.close();
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
      // shouldn't happen
    }


    return readString;
  }

}


