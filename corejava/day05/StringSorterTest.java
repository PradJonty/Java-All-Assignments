package com.valtech.training.corejava.day05;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringSorterTest {

	@Test
	public void testVow() {
		 String[] words = { "hello", "name", "is", "ronaldo" };
		 Arrays.sort(words,new StringSorter());
		 assertArrayEquals(new String[] {"is","name","hello","ronaldo"},words);
	}
	
	@Test
	public void testAlph() {
		 String[] words = { "hello", "name", "is", "ronaldo" };
		 Arrays.sort(words,new StringSorter());
		 assertArrayEquals(new String[] {"is","name","hello","ronaldo"},words);
	}
	
	
	@Test
	public void testLen() {
	  String[] words = { "hello", "name", "is", "ronaldo" };
	  Arrays.sort(words,new StringSorter());
	  assertArrayEquals(new String[] { "is", "name", "hello", "ronaldo" },words);
	  
	  
	 
	  
	  
	
		
	}

}

// customer
// name
// type diamond,plainum,gold,silver
// money spent