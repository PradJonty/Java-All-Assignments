package com.valtech.training.corejava.day05;



import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PasswordStrengthCheckerTest {

	@Test
	public void testcheckLower() {
        PasswordStrength lwr=new PasswordStrength ();
        assertEquals(true, lwr.checkTestLower("abcdefgh"));


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
		
		
				
				
/* password strength checker
 *lower case 5
 *upper case 5
 *number 5,6.....
 * special character 5,7,9
 * password is strong if more than 25
 * 20 - 25 moderate
 * >20 poor
 * >8 weak
*/