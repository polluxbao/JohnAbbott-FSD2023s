package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_9.java
//Question : 9
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//9. Write a Java program to find duplicate values in an array of integer values.

public class Question_9 {
	public static int[] getDuplicateValues(int[] dArray) {
		int iLength=dArray.length;
		int[] newArray = new int[iLength];
		int num = 0;
		for(int i=0; i<iLength-1; i++) {
			for(int j=i+1; j<iLength; j++) {
				if(dArray[i]==dArray[j]) {
					boolean bFound = false;
					for(int k=0; k<num; k++) {
						if(dArray[i]==newArray[k]) bFound = true;
					}
					
					if(!bFound) {
						newArray[num++] = dArray[i];						
					}
				}
			}
		}
		
		int[] iDuplicateArray = new int[num];
		for(int i=0;i<num;i++) {
			iDuplicateArray[i] = newArray[i];
		}
		return iDuplicateArray;
	}

	public static void main(String[] args){

		int[] array = {12,23,24,15,4,9,24,6,24,15,3,4,6,12,15};
		System.out.println("To find duplicate values in an array of integer values.");
		System.out.println(Arrays.toString(array)); 
		System.out.println();
		
		int[] arrayDup = getDuplicateValues(array);
		System.out.println("The duplicate values in the array : "); 
		System.out.println(Arrays.toString(arrayDup)); 
		

	}
}
