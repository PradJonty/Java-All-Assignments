package com.valtech.training.corejava.day05;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordChecker5415 {

@Test
public void testcheckLower() {
    PasswordStrengthChecker lwr=new PasswordStrengthChecker ();
    assertEquals(true, lwr.checklower("abcdefgh"));



}



@Test
public void testUpperLower() {
    PasswordStrengthChecker  upr=new PasswordStrengthChecker ();
    assertEquals(true, upr.checkupper("ABCDEFGH"));
}



@Test
public void testdigit() {
    PasswordStrengthChecker dig=new PasswordStrengthChecker();
    assertEquals(true, dig.checkdigit("1,2,3,4,5,6,7,8,9"));
}




@Test
public void testSpecialChar() {
    PasswordStrengthChecker spc=new PasswordStrengthChecker();
    assertEquals(33, spc.checkspecialchar( "!@#$%&*()'+,-./:;<=>?[]^_`{|}"));
}



}