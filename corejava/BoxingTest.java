package com.valtech.training.corejava;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxingTest {

	@Test
	public void test() {
		Integer i = new Integer(5);
		Integer j = 5;  // boxing is converting primitive to object
		int k = j.intValue();
		int l = j;  // unboxing is converting object into primitive
		
	}

}
