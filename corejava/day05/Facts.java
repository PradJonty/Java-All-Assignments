package com.valtech.training.corejava.day05;

import java.util.List;
import java.util.ArrayList;
public class Facts {
List <Long> factorials;
List<Long> cache = new ArrayList<>();
  public long fact(int n) 
  {
	  if(cache.size() >=(n-1)) {
		  System.out.println("return from cache");
		  return cache.get((int) (n-1));
	  }
	  if(n==1) {
		 cache.add(1L);
		  return 1;
	  }
long facts = fact(n-1);
long factsn = facts*n;
cache.add(factsn);
return factsn;

 }

}



