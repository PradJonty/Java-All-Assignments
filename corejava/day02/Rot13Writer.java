package com.valtech.training.corejava.day02;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class Rot13Writer extends Writer {
   private Writer sink;

	
	
	public Rot13Writer(StringWriter stringWriter) {
	// TODO Auto-generated constructor stub
}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		char [] buffer = new char[cbuf.length];
		for (int i = 0; i < len; i++) {
			buffer[i] = (char) Rot13Utility.rotate(cbuf[i]);
		}
		sink.write(buffer,off,len);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	

}
