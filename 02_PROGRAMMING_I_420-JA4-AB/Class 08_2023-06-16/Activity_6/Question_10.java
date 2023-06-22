package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_10.java
//Question : 10
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//10. Write a Java program to find duplicate values in an array of string values.

public class Question_10 {
	public static String[] getDuplicateValues(String[] sArray) {
		int iLength=sArray.length;
		String[] newArray = new String[iLength];
		int num = 0;
		for(int i=0; i<iLength-1; i++) {
			for(int j=i+1; j<iLength; j++) {
				if(sArray[i]==sArray[j]) {
					boolean bFound = false;
					for(int k=0; k<num; k++) {
						if(sArray[i]==newArray[k]) bFound = true;
					}
					
					if(!bFound) {
						newArray[num++] = sArray[i];						
					}
				}
			}
		}
		
		String[] sDuplicateArray = new String[num];
		for(int i=0;i<num;i++) {
			sDuplicateArray[i] = newArray[i];
		}
		return sDuplicateArray;
	}

	public static void main(String[] args){

		String[] array = {"asd","qw","wd","asd","q","ds","wd","asd","wq","qw"};
		System.out.println("To find duplicate values in an array of string values.");
		System.out.println(Arrays.toString(array)); 
		
		String[] arrayDup = getDuplicateValues(array);
		System.out.println("The duplicate values in the array : "); 
		System.out.println(Arrays.toString(arrayDup)); 
		
	}
}
