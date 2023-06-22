package Project1;

import java.util.Arrays;

//Project  : Project6
//Filename : Question_6.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/21

//Question 5 
//Given an array nums containing n distinct numbers in the range [0, n], 
//return the only number in the range that is missing from the array.
	
public class Question_6 {
	public static int getMissingNumber(int[] arr) {
		
		// Sort the array.
		
		int n=arr.length;
		
		for(int i=0; i<=n; i++) {
			boolean found=false;
			for(int j=0;j<n; j++) {
				if(i==arr[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		int[] nums = {9,6,4,2,3,5,7,0,1};
//		int[] nums = {3,0,1};
		
		System.out.println("Input: nums = " + Arrays.toString(nums));
		int missing = getMissingNumber(nums);
		System.out.println("Output: " + missing);
	}
}
