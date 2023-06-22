package Project1;

import java.util.Arrays;
import java.util.Scanner;

//Project  : Project6
//Filename : Question_3.java
//Question : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/20

//Question 3: 
//You are commissioned to write a Java program that will asking from user 2 integer. 
//Call them row and col. Create the multidimensional array by that sizes. 
//
//Fill the array with the random number between 1 to 100. And print it. 
//Now ask user which number want to disappear. Get the value and search for entire the matrix ; 
//		find the number and make it to zero and return the new array. 



public class Question_3 {
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter the matrix row : ");
		int row = kb.nextInt();

		System.out.print("Enter the matrix col : ");
		int col = kb.nextInt();
		
		int[][] matrix = new int [row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j] = (int)(Math.random()*100) + 1;
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		System.out.println("Enter a number :");
		int num = kb.nextInt();
		int count=0;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(matrix[i][j] == num) {
					matrix[i][j]=0;
					count++;
				}
			}
		}
		
		System.out.println("Searched the number ...");
		if(count==0) {
			System.out.println("Cannot find the number "+num+" in the matrix, the matrix has not changed.");
		} else {
			System.out.println("Found "+ count +" times of the number "+num+" in the matrix.");
			for(int i=0; i<row; i++) {
				System.out.println(Arrays.toString(matrix[i]));
			}
		}
		kb.close();
	
	}
}
