package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_13.java
//Question : 13
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//13. Write a program to find all roots of a quadratic equation

public class Q_13 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		

		System.out.println("To find all roots of a quadratic equation.");
		System.out.println("    ax² + bx + c = 0");
		System.out.println("Input the coefficient values of quadratic equation.");
		System.out.print("The coefficient a : ");
		double a = kb.nextDouble();
		
		System.out.print("The coefficient b : ");
		double b = kb.nextDouble();

		System.out.print("The coefficient c : ");
		double c = kb.nextDouble();
		
		
		//checking if the quadratic equation has Roots or NOT
		//    b² - 4ac > 0
		
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta < 0) {
			System.out.println("The quadratic equation has NO Real Roots.");
		} else {
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("The quadratic equation has tow Real Roots:");
			System.out.println("x1 = " + root1);
			System.out.println("x2 = " + root2);
		}			
			
		kb.close();
	}
}
