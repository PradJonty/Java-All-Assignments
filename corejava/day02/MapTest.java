package com.valtech.training.corejava.day02;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.valtech.training.corejava.day01.point;

public class MapTest {

	@Test
	public void testHashMap() {
		Map<String,point> points = new HashMap();
	    points.put("1,1", new point(1,1));
	    points.put("1,2", new point(1,1));
	    points.put("2,2", new point(1,1));	
	    points.put("1,2", new point(1,1));
	    assertEquals(3, points.size());
	    Set<String> keys = points.keySet();
	    for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println("Key "+key+ "value "+points.get(key));
		}    
	    
	
		}    
	
	}


