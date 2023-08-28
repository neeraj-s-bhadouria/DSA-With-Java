package com.neeraj.dsa.sorting;

public class BubbleSort {

	public void bubbleSort(int nums[]) {
		for(int i=0; i<nums.length-1; i++) {
			boolean isSwapped = false;
			for(int j=1; j<nums.length-i; j++) {
				if(nums[j] < nums[j-1]) {
					isSwapped = true;
					nums[j] = (nums[j]+nums[j-1]) - (nums[j-1]=nums[j]);
				}
			}
			if(!isSwapped)
				return;
		}
	}
}
