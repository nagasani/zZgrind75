package com.grind.misc;

class Solution4 
{

	public double findMedianSortedArrays(int[] nums1, int[] nums2) 
	{
		int[] merged = new int[nums1.length + nums2.length];
		int i = 0, j = 0, k = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				merged[k] = nums1[i];
				i++;
			} else {
				merged[k] = nums2[j];
				j++;
			}
			k++;
		}

		while (i < nums1.length) {
			merged[k] = nums1[i];
			i++;
			k++;
		}

		while (j < nums2.length) {
			merged[k] = nums2[j];
			j++;
			k++;
		}

		if (merged.length % 2 == 0) {

			return (double) (merged[(merged.length / 2) - 1] + merged[(merged.length / 2)]) / 2;
		} else {
			return (double) ((merged[(merged.length / 2)]));
		}
	}

	public double findMedianSortedArrays1(int[] nums1, int[] nums2) {

		int sum = 0;

		for (int i = 0; i < nums1.length; i++) {
			sum += nums1[i];
		}

		for (int i = 0; i < nums2.length; i++) {
			sum += nums2[i];
		}
		return (double) sum / (nums1.length + nums2.length);
	}
}