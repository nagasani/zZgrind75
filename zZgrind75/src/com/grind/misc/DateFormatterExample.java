package com.grind.misc;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterExample {
    public static void main(String[] args) {
       

        // Create a SimpleDateFormat object with the desired pattern
        DateFormat dateFormat = new SimpleDateFormat("MMddYYYY");
        Date currentDate = new Date();

        // Format the date using the SimpleDateFormat object
        String formattedDate = dateFormat.format(currentDate);

        System.out.println("Formatted Date: " + formattedDate);
    }
}
