package com.valtech.training.corejava.day01;

import java.awt.Point;

public class point implements Comparable {
    public static final point ORIGIN= new point(0,0);
     
     
	protected int x;
	protected int y;
	public point() {
		super();
	}
	
	
	public point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int compareTo(Point o) {
		if (distance()< o.distance(o)) {
		    return -1;
		    
		}
		if (distance()== o.distance(o)) {
			if(x<o.x) {
				return -1;
			}
		    
		}
		        return 0;
		    }	
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Point ) {
	 Point p = (Point)obj;
		return p.x == x && p.y == y;
	
	}
	return false;
	
		
	}

	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	
	public double distance(int x ,int y) {
		int dx = this.x=x;
		int dy = this.y=y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	public double distance(point p) {
    return this.distance(p.x,p.y);
	}
    public int getX() {
       return x;
	}
	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}
    public static void main(String[] args) {
    	point p = new point(3,4);
    	System.out.println("x =" +p.getX()+ "y=" +p.getY());
        System.out.println(p.distance());
        System.out.println(p.distance(10,20));
        System.out.println(new point(10,30));
    
    }	
}
