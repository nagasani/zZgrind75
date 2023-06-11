package com.grind.imp;

public class Solution278 {
    public static int firstBadVersion1(int n) {
    	if(isBadVersion(1)) {
    		return 1;
    	}
    	int left=1;
    	int right =n;
    	int first = 0;
    	boolean[] b = new boolean[n];
    	while (right > left) {
    		int mid = left+(right - left)/2;
    		boolean lb = isBadVersion(mid);
    		if(!lb) {    			
    			left = mid; 
    			b[mid-1] = false;
    		}
    		else 
    		{
    			b[mid-1] = true;
    			right = mid;
    			if(!b[mid-2]) {return mid-1;}
    		}    		
    	}    	
    	return first;
    }
    
    public static boolean isBadVersion(int version) 
    {   
    	if(version == 4) 
    	{
    		return true;
    	}
    	return false;
    }
    
    public static int firstBadVersion(int n) {
        int left = 1;
    int right = n;

    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    return left;

}
    
    public static void main(String[] args) {
		System.out.println(firstBadVersion(5));
	}
}