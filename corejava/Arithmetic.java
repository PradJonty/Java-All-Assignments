package com.valtech.training.corejava;
import com.valtech.training.corejava.day01.point;
public class Arithmetic<E extends Number>{
	
	public <F> void print(F obj) {
        System.out.println("Recd...Class"+obj.getClass().getName()+" "+obj);
    }
    public double add(E a,E b) {
          return a.doubleValue()+b.doubleValue();
	
		}
    public static void main(String[] args) {
		Arithmetic<Integer> a = new Arithmetic<>();
		System.out.println(a.add(2, 3));
		System.out.println(new Arithmetic<Double>().add(2.3, 4.5));
		a.print("HELLo");
		a.print(5);
		//System.out.println(new Arithmetic<point>().add(new point(2,3),new point(3,5)));
	}
}
