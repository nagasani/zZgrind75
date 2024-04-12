package com.grind.imp;
import java.util.*;

//Revisit. youtube solution is different.
class Solution621 {
    public int leastInterval(char[] tasks, int n) {
    	int[] taskCount = new int[26];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }
        
        Arrays.sort(taskCount);
        
        int maxCount = taskCount[25] - 1; // Max frequency task
        int idleSlots = maxCount * n;
        
        for (int i = 24; i >= 0 && taskCount[i] > 0; i--) {
            idleSlots -= Math.min(maxCount, taskCount[i]);
        }
        
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}
