package Activity_2;

import java.util.Scanner;

//Project  : Activity_2
//Filename : Q_6.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//6. Write a Java program to convert an integer number to a binary number. 
//Input Data: 
//Input a Decimal Number : 5 
//Expected Output
//Binary number is: 101


public class Q_6 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a Decimal Number : ");
		int n = kb.nextInt();

		System.out.println("Binary number is: " + Integer.toBinaryString(n));
		
		kb.close();
	}
}
