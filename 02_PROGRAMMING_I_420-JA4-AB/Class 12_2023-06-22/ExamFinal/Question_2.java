package ExamFinal;

import java.util.Scanner;

//Project  : ExamFinal
//Filename : Question_2.java
//Question : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/22

//Question 2 ) 15 Marks 
//
//Write the java program which is getting the integer from user and name it N. 
//Creating the two by two array with the size of N*N. 
//
//Getting the values from user and filled the array.
//Write the method to take the array as a parameter and reverse the columns. 



public class Question_2 {
//	Method getReverseArray : To take the array as a parameter and reverse the columns. 
//			Input : int[][] arr     : Integer array two by two dimension
//			Return: int[][] new_arr : To return the reversed two by two Integer array
	public static int[][] getReverseArray(int[][] arr) {
//		To get the the size of the array arr from the length of first columns.
//		And assign the size to Variable n
		int n = arr[0].length;
//		Define new_arr[][] a two by two dimensional array of the same size n
		int[][] new_arr = new int[n][n];
//		Single loop to reverse only the columns. 
		for(int i=0;i<n;i++) {
			new_arr[n-i-1] = arr[i];
		}
//		To return the reversed two by two Integer array
		return new_arr;
	}
		
	public static void main(String[] args){
//		To use java.util package to create an input object of the class.
		Scanner kb=new Scanner(System.in);
//		Output a sentence to prompt user to input N value
		System.out.println("Please put your N value ?");
//		To assign the input integer to Variable n
		int n = kb.nextInt();
//		To set two by two dimension arrInput with the size of N*N
		int[][] arrInput = new int[n][n];

//		To start the one line input
		kb.nextLine();
//		First layer of nested loop for input N lines
		for(int i=0;i<n;i++) {
//			Assign the content of each line input as a string to Variable str
			String str = kb.nextLine();
//			Split each number by a space by using split Method
			String[] sNumbers = str.split(" ");
//			Second layer of nested loop to iterate through the numbers of the current line
			for(int j=0;j<n;j++) {
//				To convert string to integer with Integer.valueOf() Method 
				arrInput[i][j] = Integer.valueOf(sNumbers[j]);
			}
		}
		
//		To call getReverseArray method to take the array arrInput as a parameter and reverse the columns.
//		To assign the reversed array returned from getReverseArray method.
		int[][] arrOutput = getReverseArray(arrInput);
		
		
//		To output the result
//		Output a blank line
		System.out.printf("\n");
		
//		To use nested loop for output the reversed array arrOutput
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
//				To use System.out.printf method and formatting string "%d" to print a Integer number
				System.out.printf("%d ",arrOutput[i][j]);
			}
//			To output a newline with formatting string "\n" after each array column.
			System.out.printf("\n");
		}
		
//		To close Scanner method.
		kb.close();
	
	}
}
