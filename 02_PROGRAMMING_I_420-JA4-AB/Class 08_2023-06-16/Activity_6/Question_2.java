package Activity_6;

import java.util.Scanner;

//Project  : Activity_6
//Filename : Question_2.java
//Question : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//2. Write a Java program to test if an array contains a specific value.

public class Question_2 {
	public static boolean specificValue(double[] dArray, double dValue) {
		int iLength=dArray.length;
		for(int i=0;i<iLength;i++) {
			if(dArray[i]==dValue) return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		double[] array = new double[] {1,2,3,5,4};
		
		System.out.print("The array is : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");			
		}
		System.out.println();
		
		System.out.print("Input a specific value : ");
		double value =  kb.nextDouble();
		
		System.out.println("To test if an array contains a specific value.");
		System.out.println(specificValue(array, value));
		
		kb.close();
	
	}
}
