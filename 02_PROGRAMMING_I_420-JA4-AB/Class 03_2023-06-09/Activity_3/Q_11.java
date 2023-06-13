package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_11.java
//Question : 11
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//11. Write a program to input all sides of a triangle and check whether triangle is valid or not.

public class Q_11 {
	public static void main(String[] args){
//		In a valid triangle, if you add any two sides then it will be greater than the third side. 
//		Suppose a, b and c are the three sides of the triangle.
//		a + b > c
//		b + c > a
//		c + a > b
		
		Scanner kb = new Scanner(System.in);
		

		System.out.println("To check a triangle Valid or Not.");
		System.out.println("Input the side length values of traingle.");
		System.out.print("The 1st side length : ");
		double a = kb.nextDouble();
		
		System.out.print("The 2nd side length : ");
		double b = kb.nextDouble();

		System.out.print("The 3rd side length : ");
		double c = kb.nextDouble();
		
		
		//checking if triangle is valid or not by using the logic
		if((a + b > c && a + c > b && b + c > a) && (a>0 && b>0 && c>0)){
			System.out.println("The triangle is Valid");
		} else {
			System.out.println("The triangle is NOT Valid");
		}
			
		kb.close();
	}
}
