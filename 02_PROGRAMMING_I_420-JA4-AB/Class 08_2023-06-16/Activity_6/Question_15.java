package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_15.java
//Question : 15
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//15. Write a Java program to find the second smallest element in an array.

public class Question_15 {    
 
    public static void main(String[] args) {
    	int array[] = {5,2,6,8,6,7,5,2,8,7,5};
		int n = array.length;
		
		System.out.println("To find the second smallest element in an array.");
        System.out.println(Arrays.toString(array)); 


		if (n < 2) {
			System.out.println(" Invalid array, the array should have two elements at least.");
			return;
		}
	
		Arrays.sort(array);
		
		for (int i = 1; i<n; i++)	{
			if (array[i] != array[0]) {
				System.out.println("The second smallest element is " + array[i]);
				return;
			}
		}
		
		System.out.println("There is no second smallest element");
		
    }
}
