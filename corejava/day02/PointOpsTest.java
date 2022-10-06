package com.valtech.training.corejava.day02;

import static org.junit.Assert.*;


import org.junit.Test;
import com.valtech.training.corejava.day01.point;

public class PointOpsTest {



	   @Test
	   public void testEquals() {
	        point p=new point(2,3);
	        point p1=new point(2,3);
	        point p2=p;
	        assertTrue(p==p2);
	        assertFalse(p==p1);
	        assertFalse(p.equals(p1));
	    }
	    public void testDistance() {
	        point p=new point(0, 0);
	        assertEquals(0.0,p.distance(),0.0000001);
	        p=new point(10,20);
	        assertEquals(Math.sqrt(10*10+20*20),p.distance(),0.0000001);
	    }    
	    public void testSetGet() {
	        point p=new point (0, 0);
	        p.setX(10);
	        assertEquals(10, p.getX());
	        p.setY(20);
	        assertEquals(20, p.getY());
	            
	        }
	    
	    public void testPointCtor() {
	        point p=new point(0, 0);
	            assertEquals(0,p.getX());
	            assertEquals(0,p.getY());
	            
	            point p1 = new point(2,3);
	            assertEquals(2, p1.getX());
	            assertEquals(3, p1.getX());
	    }



	}