package com.valtech.training.corejava.day02;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class Rot13WriterTest {

	@Test
	public void test() throws Exception{
		Writer strWriter = new Rot13Writer(new StringWriter());
       String msg = "Hello World";
		strWriter.write(msg);
		 String res = strWriter.toString();
		 System.out.println("after rotation "+res);
		 strWriter.close();
		 Reader reader = new StringReader (res);
        char [] buffer = new char[1024];
        int i = reader.read(buffer);
        assertEquals(msg, new String(buffer,0,i));
        System.out.println("after rotation again " +new String(buffer,0,i));
        reader.close();
	
	}

}
