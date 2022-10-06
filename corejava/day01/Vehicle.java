package com.valtech.training.corejava.day01;

public abstract class Vehicle {
  public  void start() {
	  System.out.println("start button pressed...");
  }
  public  void stop() {
	  System.out.println("stop button pressed...");
  }
  public abstract void accelarate();
  public abstract void applybrakes();
  
  public void drivesomedistance() {
	  start();
	  accelarate(); // abstract class can contain abstract methods
	  applybrakes();
	  stop();
  }
  
  public static void main(String[] args) {
	  Vehicle es = new Electricscooter();
	  es.drivesomedistance();
  }
}
