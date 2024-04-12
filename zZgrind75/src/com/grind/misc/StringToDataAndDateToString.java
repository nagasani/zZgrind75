package com.grind.misc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDataAndDateToString 
{
	public static void main(String[] args) 
	{
		stringToDate();
		dateToString();
	}
	
	public static void stringToDate() 
	{
		String dateString = "2023-04-12";
		 LocalDate date = LocalDate.parse(dateString);
		 System.out.println("Date  : "+date);
		 
		 String dateStringAgain = "12-04-2022";
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 LocalDate dateAgain = LocalDate.parse(dateStringAgain, formatter);
		 System.out.println("dateAgain : "+dateAgain);
	}
	
	public static void dateToString() 
	{
		LocalDate current = LocalDate.now();
		
		String dateString = current.toString();
		System.out.println("dateString "+dateString);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = current.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);		
	}
}
