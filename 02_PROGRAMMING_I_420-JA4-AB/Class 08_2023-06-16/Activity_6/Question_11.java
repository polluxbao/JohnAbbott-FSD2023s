package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_11.java
//Question : 11
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//11. Write a Java program to find common elements between two arrays (string values).

public class Question_11 {
	public static String[] findCommonElements(String[] sArray1, String[] sArray2) {
		int iLength1=sArray1.length;
		int iLength2=sArray2.length;
		String[] newArray = new String[iLength1>=iLength2 ? iLength1 : iLength2];
		int num = 0;
		for(int i=0; i<iLength1; i++) {
			for(int j=0; j<iLength2; j++) {
				if(sArray1[i]==sArray2[j]) {
					boolean bFound = false;
					for(int k=0; k<num; k++) {
						if(sArray1[i]==newArray[k]) bFound = true;
					}
					
					if(!bFound) {
						newArray[num++] = sArray1[i];						
					}
				}
			}
		}
		
		String[] sCommonArray = new String[num];
		for(int i=0;i<num;i++) {
			sCommonArray[i] = newArray[i];
		}
		return sCommonArray;
	}

	public static void main(String[] args){

		String[] array1 = {"asd","qw","wd","asd","q","ds","a","we"};
		String[] array2 = {"wd","asd","wq","qw","a"};
		
		System.out.println("To find common elements between two arrays (string values).");
		System.out.println("The array 1 : "+Arrays.toString(array1)); 
		System.out.println("The array 2 : "+Arrays.toString(array2)); 
		
		String[] arrayDup = findCommonElements(array1, array2);
		System.out.println("The common elements : "+Arrays.toString(arrayDup)); 
		
	}
}
