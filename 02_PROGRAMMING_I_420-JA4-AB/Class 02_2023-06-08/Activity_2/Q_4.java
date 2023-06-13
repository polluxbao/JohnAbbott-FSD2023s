package Activity_2;

import java.util.Scanner;

//Project  : Activity_2
//Filename : Q_4.java
//Question : 4
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//4. Write a Java program that takes three numbers as input to calculate 
//and print the average of the numbers.

public class Q_4 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Input 1st number : ");
		double num1 = kb.nextDouble();

		System.out.print("Input 2nd number : ");
		double num2 = kb.nextDouble();

		System.out.print("Input 3rd number : ");
		double num3 = kb.nextDouble();

		double dAverage = (num1 + num2 + num3) / 3;
		
		System.out.println("The average of the numbers is = " + dAverage);
		
		kb.close();
	}
}
