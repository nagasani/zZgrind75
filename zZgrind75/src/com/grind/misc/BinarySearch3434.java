package com.grind.misc;

public class BinarySearch3434 {
	
	public static void main(String[] args) {
		int[] i = {1,2,3,4,5,6,7};
		int target = 3;
		int left = 0;
		int right = i.length;
		
		while(left <= right) {
			int mid = left+(right-left)/2;
			if(i[mid] == target) {
				System.out.println("Found "+ i[mid]);
				break;
			}
			else if(i[mid] < target) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}		
	}

}
