package com.mdt.java.string;
import java.io.*;
import java.lang.*;

public class stringexampl {
	

	    public static void main(String[] args) {
	      
	        // Declare String without using new operator
	        String name = "GeeksforGeeks"; //saved  in String constant pool

	        // Prints the String.
	        System.out.println("String name = " + name);

	        // Declare String using new operator
	        String newString = new String("GeeksforGeeks"); // not saved in String constant pool

	        // Prints the String.
	        System.out.println("String newString = " + newString);
	        
	        String internedStr=newString.intern(); // now  saved in String constant pool
	        
	        System.out.println("String internedStr = " + internedStr);
	    }
	

}
