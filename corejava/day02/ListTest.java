package com.valtech.training.corejava.day02;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


import org.junit.Test;

public class ListTest {
   
	@Test
	public void testStackandQueue() {
		Stack<String> animals = new Stack<>();
	    animals.push("Dog");
	    animals.push("Wolf");
	    animals.push("Lion");
	    assertEquals(3, animals.size());
	    System.out.println(animals.pop());
	    System.out.println(animals.pop());
        assertEquals(1, animals.size());
}
	
	@Test
	public void test() {
	   	List<String> names=new ArrayList<>();
        names.add("hello1");
        names.add("hello2");
        names.add("hello3");
        names.add("hello4");
        names.add(0,"hello5");
        names.add("hii");
        assertEquals(6, names.size());
        for (Iterator iterator = names.iterator(); iterator.hasNext();) {
            String string = (String) iterator.next();
            System.out.println(string);
        }
    }



}