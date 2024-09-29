package com.Dibyanshu.Practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatter.format(date));
		Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.DAY_OF_MONTH, 1);
	    Date newDate = cal.getTime();
        System.out.println(formatter.format(newDate));
	   
	}

}
