package com.valtech.training.corejava.day05;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		 TreeSet<Customer> set = new TreeSet<Customer>();
		 int Dimond=1,Platinum=2,Gold=3,Silver=4;

		 Customer a1 = new Customer("pradeek",Platinum,"2-2-2000",2500);
		 Customer a2 = new Customer("ronaldo", Dimond, "12-4-2001",5100);
		 Customer a3 = new Customer("modric", Silver, "18-11-2018",2000);
		 Customer a4 = new Customer("neymar",Gold, "29-5-2021",1800);
		 Customer a5 = new Customer("beckham",Platinum,"16-7-2010",2800);
		 Customer a6 = new Customer("messi", Silver, "16-3-2000",1100);
		 Customer a7 = new Customer("kroos", Platinum, "27-8-2017",1000);
		 Customer a8 = new Customer("marcelo",Silver, "21-3-2022",1220);
		 Customer a9 = new Customer("mane", Gold, "24-3-2020",1000);
		 Customer a10 = new Customer("caseimiro", Dimond, "25-5-2020",2001);
	  
	        set.add(a1);
	        set.add(a2);
	        set.add(a3);
	        set.add(a4);
	        set.add(a5);
	        set.add(a6);
	        set.add(a7);
	        set.add(a8);
	        set.add(a9);
	        set.add(a10);
		
    
    System.out.println("Order List");
    int count=0;
    for (Customer s : set) {
        System.out.println(convert(s.type) + " " + s.name + " "+ s.joinDate+  " "+s.value);
        count++;
    }
    
   
    assertEquals(count, set.size());
    
	}
	 public String convert(int a) {
		 
		 switch(a) {
		 case 1:
			 return "Dimond";
		 case 2:
			 return "Platinum";
		 case 3:
			 return "Gold";
		 case 4:
			 return "Silver";
		 }
		 return "null";
	    	
	    }
	}


