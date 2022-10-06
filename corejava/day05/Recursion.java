package com.valtech.training.corejava.day05;

public class Recursion {
	public static void main(String[] args) {
		int n = 10;
		long fact = 1;
		if(n==0) {
			System.out.printf("fact doesnt exist");
			
		}
		// 5! = 4!*5, [n!=n*(n-1)!]
		for(int i = 1; i<n;++i)
		{
			fact = fact*i; // store the factorial in the array
			
		}
		System.out.printf("fact of %d = %d",n,fact); // return the size of the array
		
	}
	return fact;
}

