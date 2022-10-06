package com.valtech.training.corejava.day02;

public class ExceptionTest {
	public int div(int a, int b) throws Exception {
		if(b==100) throw new Exception("b is 100 it is invalid");
		return a / b;

	}
public int calculateSimpleInterest(int p, int q, int r) {
	try {
		return div(p*q*r, 100);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Exception occured");
	} finally {
		System.out.println("this ode will always be executed");
	}
	return 0;
}
public static void main(String[] args) {
	ExceptionTest ExceptionTest = new ExceptionTest();
	int interest = test.calculateSimpleInterest(100,12,13);
	System.out.println(interest);
}
}
