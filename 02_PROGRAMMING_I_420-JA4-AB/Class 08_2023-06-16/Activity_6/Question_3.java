package Activity_6;

import java.util.Scanner;

//Project  : Activity_6
//Filename : Question_3.java
//Question : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//3. Write a Java program to find the index of an array element.

public class Question_3 {
	public static int findArrayElement(double[] dArray, double dElement) {
		int iLength=dArray.length;
		for(int i=0;i<iLength;i++) {
			if(dArray[i]==dElement) return i;
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		double[] array = new double[] {12,23,24,15,4,9,6};
		
		System.out.print("The array is : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");			
		}
		System.out.println();
		
		System.out.print("Input an array element : ");
		double value =  kb.nextDouble();
		
		System.out.println("To find the index of an array element ...");
		int i = findArrayElement(array, value);
		if(i==-1) {
			System.out.println("No element in the array.");
		} else {
			System.out.println(i);
		}
		
		kb.close();
	
	}
}
