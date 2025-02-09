package com.abc.lifetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class LivingDays {

	// data members to store the day, month and year of a date
	private int d;
	private int m;
	private int y;

	// to initialize the Date instance members
	public LivingDays(int d, int m, int y)
	{
		this.d = d;
		this.y = y;
		this.m = m;
	}

	//to calculate the difference in days
	public int diff(LivingDays date) {
		int diffDt;
		LocalDate dateArg = LocalDate.of(date.y, date.m, date.d);
		LocalDate dateIns = LocalDate.of(y, m, d);
		Period diff = Period.between(dateArg, dateIns);
		diffDt = (int) diff.getDays() + diff.getYears() * 365;

		return diffDt;
	}

	//to display the object data
	@Override
	public String toString() {
		return "" + d + "/" + m + "/" + y ;
	}
	
	

}
