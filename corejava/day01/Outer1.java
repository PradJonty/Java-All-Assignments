package com.valtech.training.corejava.day01;

public class Outer1 {
  private int x =8;
  private static class Inner1 {
	  private int y =5;
	  void printX(Outer1 o)  {
		  System.out.println("X= "+0.);
	  }
	  public void increment(Outer o) {
		  o.x++;
	  }
  }

public static void main(String[] args) {
	Outer1 o = new Outer1();
	Inner1 i = new Inner1();
    o.printY(i);
    i.printX(O);

}
}
