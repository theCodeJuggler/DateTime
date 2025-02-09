package com.abc.fridaythirteenth;
//program to find the number Friday 13th in twentieth century
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class ThirteenthFriday {

	public static void main(String[] args) throws ParseException {

		//initialization of the dates for 20th century
		LocalDate startDate = LocalDate.of(1900, 1, 1);
		LocalDate endDate = LocalDate.of(1999, 12, 31);

		//defining the format in the objects
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-mm-yyyy");

		System.out.println("The list of the Fridays are :: ");

		// date for loop
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {

			// checking for friday the 13th
			if (date.getDayOfMonth() == 13 && (date.getDayOfWeek().toString().equalsIgnoreCase("friday")))

				// parsing date and converting it to desired format
				System.out.println(simpleDateFormat2.format(simpleDateFormat.parse(date.toString())));
		}

	}

}
