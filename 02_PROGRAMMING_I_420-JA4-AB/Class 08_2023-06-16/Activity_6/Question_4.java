package Activity_6;

import java.util.Scanner;

//Project  : Activity_6
//Filename : Question_4.java
//Question : 4
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//4. Write a Java program to remove a specific element from an array.

public class Question_4 {
	public static double[] removeArrayElement(double[] dArray, double dElement) {
		int iLength=dArray.length;
		for(int i=0;i<iLength;i++) {
			if(dArray[i]==dElement) {
				for(int j=i;j<iLength-1;j++) {
					dArray[j]=dArray[j+1];
				}
				iLength--;
			}
		}
		
		double[] newArray = new double[iLength];
		for(int i=0;i<iLength;i++) {
			newArray[i] = dArray[i];
		}
		return newArray;
	}
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		double[] array = new double[] {12,23,24,15,4,9,24,6};
		
		System.out.println("To remove a specific element from an array");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");			
		}
		System.out.println();
		
		System.out.print("Input an array element : ");
		double value =  kb.nextDouble();
		
		System.out.println("To remove a specific element from an array ...");
		double[] arrayRemoved = removeArrayElement(array, value);
		if(arrayRemoved.length==array.length) {
			System.out.println("The element "+value+" does NOT include in the array, and remove nothing.");
		} else {
			System.out.println("The new array removed the specific element "+value);
			
			for(int i=0;i<arrayRemoved.length;i++) {
				System.out.print(arrayRemoved[i]+"  ");
			}
		}
		
		kb.close();
	
	}
}
