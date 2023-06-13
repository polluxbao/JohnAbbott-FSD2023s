package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_12.java
//Question : 12
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//12. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle.

public class Q_12 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		

		System.out.println("To check whether a triangle is Equilateral, Isosceles or Scalene triangle.");
		System.out.println("Input the side length values of traingle.");
		System.out.print("The 1st side length : ");
		double a = kb.nextDouble();
		
		System.out.print("The 2nd side length : ");
		double b = kb.nextDouble();

		System.out.print("The 3rd side length : ");
		double c = kb.nextDouble();
		
		
		//checking if triangle is valid or not by using the logic
		if((a + b > c && a + c > b && b + c > a) && (a>0 && b>0 && c>0)){
			if(a==b && b==c && a==c ) {
				System.out.println("The triangle is Equilateral");
			} else if(a==b || b==c || a==c) {
				System.out.println("The triangle is Isosceles");
			} else {
				System.out.println("The triangle is Ecalene");				
			}
		} else {
			System.out.println("The triangle is NOT Valid");
		}
			
			
		kb.close();
	}
}
