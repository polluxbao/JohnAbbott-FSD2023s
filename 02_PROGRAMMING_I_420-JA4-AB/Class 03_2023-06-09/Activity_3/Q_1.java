package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_1.java
//Question : 1
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//1 )Write a Java program to test a number is positive or negative

public class Q_1 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("To test a number is positive or negative.");
		System.out.print("Input a number : ");
		
		double num = kb.nextDouble();
		String sResult = "Zero";
		
		if(num > 0) {
			sResult = "Positive";
		}
		
		if(num < 0) {
			sResult = "Negative";
		}
		
		System.out.println("The number is "+ sResult + ".");
		kb.close();
		
	}
}
