package com.neeraj.dsa.sorting;

public class InsertionSort {

	public void insertionSort(int[] nums) {
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(nums[j]>nums[j-1])
					break;
				nums[j] = (nums[j]+nums[j-1]) - (nums[j-1]=nums[j]);
			}
		}
	}
}
