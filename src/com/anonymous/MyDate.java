package com.anonymous;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	public static void main(String[] args) throws ParseException {
		String inputDate = "31-12-2020"; // input date from user
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse(inputDate);
		String reqDate = new SimpleDateFormat("yyyy-MM-dd").format(date); // provide required date format here
		System.out.println(reqDate);

	}

}
