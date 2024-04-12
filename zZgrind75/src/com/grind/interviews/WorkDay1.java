package com.grind.interviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkDay1 {
	
	public static void findMiniumDays() 
	{
		List<Float> durations = Arrays.asList(1.04f, 1.25f, 1.75f, 1.90f, 2.5f);		
		Collections.sort(durations);		
		int numDays = 0;		
		for(int duration=0; duration < durations.size(); duration++) 
		{
			if((duration+1) < durations.size() && (durations.get(duration)+durations.get(duration+1)) < 3) 
			{
				numDays++;
				duration++;
			}
			else 
			{
				numDays++;
			}
		}
		System.out.println(numDays);
	}
	
	public static int minDaysToWatchMovies(double[] durations) 
	{
        Arrays.sort(durations); // Sort the durations in ascending order
        int n = durations.length;
        int days = 0;
        int index = n - 1;
        while (index >= 0) 
        {
            double remainingTime = 3.00;
            while (index >= 0 && remainingTime >= durations[index]) 
            {
                remainingTime -= durations[index];
                index--;
            }
            days++;
        }
        return days;
    }
	
	public static void main(String[] args) {
		
	}
}
