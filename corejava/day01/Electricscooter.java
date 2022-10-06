package com.valtech.training.corejava.day01;

public class Electricscooter extends Vehicle {

	@Override
	public void accelarate() {
		System.out.println("more power to the motor");
		
	}

	@Override
	public void applybrakes() {
		System.out.println("cut off power to the motor");
		
	}

}
