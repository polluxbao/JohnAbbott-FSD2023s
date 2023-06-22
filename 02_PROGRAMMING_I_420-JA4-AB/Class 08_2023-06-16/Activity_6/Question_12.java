package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_12.java
//Question : 12
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//12. Write a Java program to find common elements between two integer arrays.

public class Question_12 {
	public static int[] findCommonElements(int[] iArray1, int[] iArray2) {
		int iLength1=iArray1.length;
		int iLength2=iArray2.length;
		int[] newArray = new int[iLength1>=iLength2 ? iLength1 : iLength2];
		int num = 0;
		for(int i=0; i<iLength1; i++) {
			for(int j=0; j<iLength2; j++) {
				if(iArray1[i]==iArray2[j]) {
					boolean bFound = false;
					for(int k=0; k<num; k++) {
						if(iArray1[i]==newArray[k]) bFound = true;
					}
					
					if(!bFound) {
						newArray[num++] = iArray1[i];						
					}
				}
			}
		}
		
		int[] iCommonArray = new int[num];
		for(int i=0;i<num;i++) {
			iCommonArray[i] = newArray[i];
		}
		return iCommonArray;
	}

	public static void main(String[] args){

		int[] array1 = {32,12,51,2,6,8,3,8,12,5};
		int[] array2 = {2,5,3,2,6};
		
		System.out.println("To find common elements between two integer arrays.");
		System.out.println("The array 1 : "+Arrays.toString(array1)); 
		System.out.println("The array 2 : "+Arrays.toString(array2)); 
		
		int[] arrayDup = findCommonElements(array1, array2);
		System.out.println("The common elements : "+Arrays.toString(arrayDup)); 
		
	}
}
