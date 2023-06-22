package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_14.java
//Question : 14
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//14. Write a Java program to find the second largest element in an array.

public class Question_14 {    
 
    public static void main(String[] args) {
    	int array[] = {5,2,6,8,6,7,5,2,8,7,5};
		int n = array.length;
		
		System.out.println("To find the second largest element in an array.");
        System.out.println(Arrays.toString(array)); 


		if (n < 2) {
			System.out.println(" Invalid array, the array should have two elements at least.");
			return;
		}
	
		Arrays.sort(array);
		
		for (int i = n-2; i>=0; i--)	{
			if (array[i] != array[n - 1]) {
				System.out.println("The second largest element is " + array[i]);
				return;
			}
		}
		
		System.out.println("There is no second largest element");
		
    }
}
