package com.valtech.training.corejava;
 


import java.lang.reflect.Method;

import org.junit.Test;

import com.valtech.training.corejava.day01.point;

import org.junit.Test;



import com.valtech.training.corejava.day01.point;

public class ReflectTest {



   @Test
    public void test() throws Exception, IllegalAccessException  {
        point p = point.class.newInstance();
        System.out.println(p);
        Method m =point.class.getMethod("setX", int.class);
        m.invoke(p, 10);
        System.out.println(p);
        
        
    }



}
