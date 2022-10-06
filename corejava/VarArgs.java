package com.valtech.training.corejava;

public class VarArgs {
  
	public int add(int ... a) {
		int result = 0;
		for(int i : a) {
			result+=i;
			
		}
		
		return result;
		
		
	}
}
