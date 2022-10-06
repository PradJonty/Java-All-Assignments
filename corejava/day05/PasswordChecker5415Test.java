package com.valtech.training.corejava.day05;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordChecker5415Test {

	@Test
	public void testcheckLower() {
        PasswordStrength lwr=new PasswordStrength ();
        assertEquals(true, lwr.checkTestLower("abcdefgh"));
        System.out.println(l.value);
		return false;
		

	}
	public boolean testUpper() {
		String a = "VALTEch";
		PasswordStrength l = new PasswordStrength();
		assertEquals('5',l.checkupper(a));
		System.out.println(l.value);
		return false;
		
	}
	public boolean TestSpecial() {
		String a = "valtech@#$%";
		PasswordStrength l = new PasswordStrength();
		assertEquals('5',l.checkspecialchar(a));
		System.out.println(l.value);
		return false;
	}
	public boolean TestDigit() {
		String a = "valtech1238967";
		PasswordStrength l = new PasswordStrength();
		assertEquals('5',l.checkdigit(a));
		System.out.println(l.value);
		return false;
	}
	
	public boolean TestScore() {
		String a = "valtecH@#$123";
		PasswordStrength l = new PasswordStrength();
		assertEquals('5',l.checkScore(a));
		System.out.println(l.value);
		return false;
				
	}
}