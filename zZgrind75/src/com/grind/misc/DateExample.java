package com.grind.misc;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the desired date
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 15);

        // Get the Date object
        Date date = calendar.getTime();

        System.out.println("Date: " + date);
        System.out.println("Day: " + date.getDay());
        
        int j = 01;
        System.out.println(j);
    }
}
