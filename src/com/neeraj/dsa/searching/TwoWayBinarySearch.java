package com.neeraj.dsa.searching;

/*
 * I modified the binary search a bit so that it can search ascending as well as descending sorted arrays 
 * */

public class TwoWayBinarySearch {

	public int binarySearch(int nums[], int target) {
		int start=0, end=nums.length-1, mid;
		boolean isAscending = nums[start] < nums[end];
		while(start<=end) {
			mid = start + (end-start)/2;
			if(nums[mid] == target)
				return mid;
			else if(nums[mid]<target)
				if(isAscending)
					start = mid+1;
				else
					end = mid-1;
			else
				if(isAscending)
					end = mid-1;
				else
					start = mid+1;
					
		}
		return -1;
	}
}
