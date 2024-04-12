package com.grind.imp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

//Revisit Seriously
class Solution1235 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        
        // Create an array of jobs, each with start time, end time, and profit.
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        
        // Sort the jobs by their end times in ascending order.
        Arrays.sort(jobs, Comparator.comparingInt(j -> j.end));
        
        // Create a TreeMap to store the maximum profit at each end time.
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0); // Initialize with a dummy entry.
        
        for (Job job : jobs) {
            // Find the job with the largest end time less than or equal to the current job's start time.
            Integer prevEndTime = dp.floorKey(job.start);
            
            // Calculate the maximum profit by including or excluding the current job.
            int maxProfitIncluding = (prevEndTime != null) ? dp.get(prevEndTime) + job.profit : job.profit;
            int maxProfitExcluding = dp.lastEntry().getValue();
            
            // Update the maximum profit at the current end time.
            dp.put(job.end, Math.max(maxProfitIncluding, maxProfitExcluding));
        }
        
        // The maximum profit is stored at the end of the TreeMap.
        return dp.lastEntry().getValue();
    }
}

class Job {
    int start;
    int end;
    int profit;

    public Job(int start, int end, int profit) {
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}
