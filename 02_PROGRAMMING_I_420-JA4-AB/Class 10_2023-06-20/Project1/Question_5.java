package Project1;

import java.util.Arrays;

//Project  : Project6
//Filename : Question_5.java
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/20

//Question 5 
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. 
//You may assume that the majority element always exists in the array.

public class Question_5 {
	public static int getMajorityElement(int[] arr) {
		
		// Sort the array.
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=i;j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr[n/2];
	}
	
	public static void main(String[] args){
//		int[] nums = {2,2,1,1,1,2,2};
		int[] nums = {3,2,3};
		
		System.out.println("Input: nums = " + Arrays.toString(nums));
		int majority = getMajorityElement(nums);
		System.out.println("Output: " + majority);
	}
}
