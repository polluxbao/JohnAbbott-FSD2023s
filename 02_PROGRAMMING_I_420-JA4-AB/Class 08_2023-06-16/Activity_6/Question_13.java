package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_13.java
//Question : 13
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//13. Write a Java program to remove duplicate elements from an array.

public class Question_13 {    
    public static int[] removeDuplicates(int[] iArray)  {
    	int iLength = iArray.length;
    	int[] temp= new int[iLength];
    	int n=1;
    	temp[0] = iArray[0];
    	for(int i=1;i<iLength;i++) {
    		boolean bFound = false;
    		for(int j=0;j<n;j++) {
    			if(iArray[i]==temp[j]) {
    				bFound = true;
    				break;
    			}
    		}
    		if(!bFound) {
    			temp[n++] = iArray[i];
    		}
    	}
    	int[] array = new int[n];
    	for(int i=0;i<n;i++) array[i] = temp[i];
    	
    	return array;
    }
 
    public static void main(String[] args) {
        int array[] = {5,2,6,8,6,7,5,2,8,7,5};
     
        System.out.println("The array : "+Arrays.toString(array)); 
        int[] arrayRemoved=removeDuplicates(array);
		System.out.println("To remove duplicate elements from an array.");
		System.out.println(Arrays.toString(arrayRemoved)); 
		
    }
}
