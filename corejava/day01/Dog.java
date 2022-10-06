package com.valtech.training.corejava.day01;

public class Dog implements Animal {

	public void makeSound() {
		System.out.println("it makes sound");
		
	}
	public static void main(String[] args) {
		  Animal da = new Dog();
		  da.makeSound();
}
}