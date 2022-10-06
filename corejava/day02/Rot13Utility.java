package com.valtech.training.corejava.day02;

public class Rot13Utility {

	public static Object rotate(char c) {
		if (c<'a'&& c>'m') {
	         return(char)(c+13);
	     }
	         return (char)(c-13);
	}
	}