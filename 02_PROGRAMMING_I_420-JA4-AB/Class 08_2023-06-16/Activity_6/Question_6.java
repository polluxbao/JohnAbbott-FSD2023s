package Activity_6;

import java.util.Scanner;

//Project  : Activity_6
//Filename : Question_6.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//6. Write a Java program to insert an element (specific position) into an array.

public class Question_6 {
	public static double[] insertArrayElement(double[] dArray, double dElement, int iPosition) {
		
		int iLength=dArray.length+1;
		double[] newArray = new double[iLength];
		
		if(iPosition>=iLength) iPosition=iLength-1;
		
		for(int i=0;i<iLength;i++) {
			if(i<iPosition) {
				newArray[i] = dArray[i];
			} else if(i==iPosition){
				newArray[i] = dElement;				
			} else {
				newArray[i] = dArray[i-1];
			}
		}

		return newArray;
	}
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);

		double[] array = new double[] {12,23,24,15,4,9,24,6};
		
		System.out.println("To insert an element (specific position) into an array.");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");			
		}
		System.out.println();
		
		System.out.print("Input an element to insert: ");
		double element =  kb.nextDouble();
		
		System.out.print("Input the specific position to insert: ");
		int position =  kb.nextInt();
		
		System.out.println("To insert an element (specific position) into an array ...");
		
		double[] newArray = insertArrayElement(array, element, position);
		
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i] + "  ");			
		}
		
		kb.close();
	}
}
