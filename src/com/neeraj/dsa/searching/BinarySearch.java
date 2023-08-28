package com.neeraj.dsa.searching;

public class BinarySearch {

	public int binarySearch(int nums[], int target) {
		int start = 0, end = nums.length-1, mid;
		while(start<=end) {
			// (start+end)/2 might go beyond the range of integer and will return some
			// unexpected value so modifying the formula a bit.
			 mid = start + (end-start)/2;
			 if(nums[mid] == target) {
				 return mid;
			 }else if(nums[mid] < target) {
				 start = mid+1;
			 } else {
				 end = mid-1;
			 }
		}
		return -1;
	}
}
