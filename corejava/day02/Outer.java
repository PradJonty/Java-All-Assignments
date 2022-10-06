package com.valtech.training.corejava.day02;
// 
public class Outer {
 private int x ;
 private class Inner{
	 private void printX() {
		 System.out.println("X= "+x);
	 }
 private void increment() {
	 x++;
 }
 }

public static void main(String[] args) {
	Outer o = new Outer();
	Outer.Inner i = o.new Inner();
	Outer.Inner i1 = o.createInner();
	i.printX();
	i1.printX();
	i.increment();
	i1.printX();
	Outer.Inner i2 = new Outer().createInner();
	i2.printX();
	
}

private Inner createInner() {
	// TODO Auto-generated method stub
	return null;
}
}

