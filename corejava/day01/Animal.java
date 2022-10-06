package com.valtech.training.corejava.day01;

public interface Animal {
 
	 int NUMBER_OF_LEGS = 4; // can use it to call it since its public static final instance can be created from an abstract class.
	 
	 void makeSound(); // cannot define a body and need'nt have any members abstract class will have a constructor but we cannot call them.
}
