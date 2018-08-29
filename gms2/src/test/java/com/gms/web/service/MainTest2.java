package com.gms.web.service;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest2 {
	static class HelloWorld {
		   private String hello_str = "Hello World!";
		    
		   public void hello() {
		       System.out.println(hello_str);
		   }
		}
		 
		    /**
		     * @param args
		     */
		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 
		        System.setOut(new PrintStream(outContent));
		        HelloWorld hw = new HelloWorld();
		        hw.hello();
		        assertEquals("Hello World!", outContent.toString());
		 
		    }
}
