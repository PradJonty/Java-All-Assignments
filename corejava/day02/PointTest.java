package com.valtech.training.corejava.day02;

import static org.junit.Assert.*;

import org.junit.Test;


import com.valtech.training.corejava.day1.point;



public class PointTest {



   @Test
    
        public void testEquals() {
        PointTest p=new point(2,3);
        PointTest p1=new point(2,3);
        Point p2=p;
        assertTrue(p==p2);
        assertFalse(p==p1);
        assertTrue(p.equals(p1));
        assertEquals(p.hashcode(),p1.hashcode());
    }
    public void testDistance() {
        Point p=new Point(0, 0);
        assertEquals(0.0,p.distance(),0.0000001);
        p=new Point(10,20);
        assertEquals(Math.sqrt(10*10+20*20),p.distance(),0.0000001);
    }    
    public void testSetGet() {
        Point p=new Point (0, 0);
        p.setX(10);
        assertEquals(10, p.getX());
        p.setY(20);
        assertEquals(20, p.getY());
            
        }
    
    public void testPointCtor() {
        Point p=new Point(0, 0);
            assertEquals(0,p.getX());
            assertEquals(0,p.getY());
            
            Point p1 = new Point(2,3);
            assertEquals(2, p1.getX());
            assertEquals(3, p1.getX());
    }



}










public class PointTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
