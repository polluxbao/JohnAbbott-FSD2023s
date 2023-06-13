package Activity_2;

import java.util.Scanner;

//Project  : Activity_2
//Filename : Q_3.java
//Question : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//3. Write a Java program to print the area and perimeter of a circle. 
//Test Data: 
//Radius = 7.5 
//Expected Output 
//Perimeter is = 47.12388980384689 
//Area is = 176.71458676442586

public class Q_3 {
	public static void main(String[] args){
		
//		final double PI = 3.141592653589793;
		Scanner kb = new Scanner(System.in);
		System.out.print("Radius = ");
		double r = kb.nextDouble();
		
		double dPerimeter = 2 * Math.PI * r;
		double dArea = Math.PI * Math.pow(r,2);
		
		System.out.println("Perimeter is = " + dPerimeter);
		System.out.println("Area is = " + dArea);
		
		kb.close();
	}
}
