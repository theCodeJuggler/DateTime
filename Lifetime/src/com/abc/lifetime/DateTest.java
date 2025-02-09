package com.abc.lifetime;

import java.time.LocalDate;

//Driver program to implement Date program
public class DateTest {

	public static void main(String[] args)
	{ 
		//creating date object with today's date
		LocalDate now = LocalDate.now();
		
		//initializing the constructor with different date components
		LivingDays today = new LivingDays(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
		LivingDays dob = new LivingDays(04,04,1995);
		
		//calling the function
		int days=today.diff(dob);
		
		//displaying the outputs
		System.out.println("Today's Date:-"+today);
		System.out.println("DOB:-"+dob);
		System.out.println("Total Days are "+days);
		
	}

}
