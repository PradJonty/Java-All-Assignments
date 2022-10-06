package com.valtech.training.corejava.day05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

public class DateTest {
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ");
	
   
//	@Test
//	public void testDate() {
//		Date date = new Date();
//		System.out.println(date);
//        System.out.println(df.format(date));
//	 }
//
//    @Test
//    public void testDatewithCal()
//    {
//    	Calendar cal = Calendar.getInstance();
//    	cal.set(Calendar.YEAR,1947);
//    	cal.set(Calendar.MONTH,8);
//    	cal.set(Calendar.DATE,15);
//    	Date date = cal.getTime();
//    	System.out.println(date);
//    	System.out.println(df.format(date));
//    }
//    
//    
//    @Test
//    public void testDateFromString() throws Exception  {
//    	 DateFormat df = new SimpleDateFormat("dd-MM-YYYY ");
//    	Date date = df.parse("15-08-1947");
//    	System.out.println(date);
//    }
	
	@Test
    public void testDateString() throws ParseException {
        DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date = df.parse("15-08-1947");
        System.out.println(date);
    }
}
    
    
    