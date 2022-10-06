package com.valtech.training.corejava.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.io.Reader;

public class IOExample {
 
	public void writeCharsToFile(String fileName,String data) throws Exception {
		File file = new File(fileName);
		Writer out = new BufferedWriter(new FileWriter(file));
		out.write(data);
		out.flush();
		out.close();
	}
    
	public String readCharsFromFile(String fileName,String data) throws Exception {
		char [] buffer = new char[4];
		File file = new File(fileName);
		Reader in = new BufferedReader(new FileReader(file));
		int i = -1;
		StringBuffer result = new StringBuffer();
		while((i=in.read(buffer))!=-1) {
			System.out.println("Size of Read = "+i);
		result.append(buffer,0,i); 
		}
		in.close();
		return result.toString();
	}
	
	public String readfromFile(String fileName) throws Exception {
		byte [] buffer = new byte[4];
		File file = new File(fileName);
		InputStream is = new FileInputStream(file);
		int i =1;
		StringBuffer sb = new StringBuffer();
		while((i=is.read(buffer))!=-1) {
		System.out.println("Size of Read = "+i);
        sb.append(new String(buffer,0,i));
        }
		is.close();
	    return sb.toString();
	}
	
	public void writetoFile(String fileName,String contents) throws Exception {
		byte [] data = contents.getBytes();
		File file = new File(fileName);
		OutputStream os = new FileOutputStream(file);
		os.write(data);
		os.close();
	}
	public static void main(String[] args) throws Exception  {
     IOExample ex = new IOExample(); 
     ex.writetoFile("hello.txt", "hello world");
     System.out.println(ex.readfromFile("hello.txt"));
     ex.readCharsFromFile("hello.txt", "");
	
	}
}
  