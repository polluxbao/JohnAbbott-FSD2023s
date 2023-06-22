package Activity_6;

import java.util.Arrays;
import java.util.Collections;

//Project  : Activity_6
//Filename : Question_8.java
//Question : 8
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//8. Write a Java program to reverse an array of integer values.

public class Question_8 {
	public static int[] reverseArray(int[] dArray) {
		int iLength=dArray.length;
		int[] newArray = new int[iLength];
		for(int i=0; i<iLength; i++) {
			newArray[iLength-i-1] = dArray[i];
		}
		
		return newArray;
	}
	
    static void reverseArray2(Integer array[]) 
    { 
        Collections.reverse(Arrays.asList(array)); 
    } 
    
	public static void main(String[] args){

		int[] array = {12,23,24,15,4,9,24,6};
		System.out.println("To find the maximum and minimum value of an array.");
		System.out.print(Arrays.toString(array));			
		System.out.println();
		
		int[] array1 = reverseArray(array);
		System.out.println("Reversed Array Method 1 : "); 
		System.out.print(Arrays.toString(array1));			
		
		
		Integer[] array2 = {12,23,24,15,4,9,24,6};
		reverseArray2(array2); 
		System.out.println(); 
        System.out.println("Reversed Array Method 2 : "); 
        System.out.println(Arrays.asList(array2)); 

	}
}
