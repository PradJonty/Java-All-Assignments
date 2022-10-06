package com.valtech.training.corejava.day01;

public class Point3d extends point {
    public static final Point3d ORIGIN = new Point3d();
	private int z;
	public Point3d() {} 
	public Point3d(int x,int y,int z) {
    	super(x,y);
        this.z=z;
        }
    
    @Override
    public double distance() {
     System.out.println("distance of point3d");
    	return Math.sqrt(x*x+y*y+z*z);
    }
    
    public double distance(int x,int y,int z) {
    	int dx = this.x=x;
    	int dy = this.y=y;
    	int dz = this.z=z;
        return Math.sqrt(dx*dx+dy*dy+dz*dz);
        }
	
    public int getZ() {
		return z;
	}

    public void setZ(int z) {
		this.z = z;
	}


    public static void main(String[] args) {
    	System.out.println(new Point3d());
    	point p = new Point3d(10,20,30);
    	System.out.println(p.distance());
    }
}
