package com.valtech.training.corejava.day05;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactsTest {

	@Test
	public void test() {
		Facts cf = new Facts();
		assertEquals(24,cf.fact(4));
		assertEquals(120,cf.fact(5));
		assertEquals(720,cf.fact(6));
		
		
	}

}
