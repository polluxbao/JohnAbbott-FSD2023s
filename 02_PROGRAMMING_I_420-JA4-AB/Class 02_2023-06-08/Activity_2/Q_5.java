package Activity_2;

import java.util.Scanner;

//Project  : Activity_2
//Filename : Q_5.java
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//5. Write a Java program to print the area and perimeter of a rectangle. 
//Test Data: 
//Width = 5.6 Height = 8.5
//Expected Output 
//Area is 5.6 * 8.5 = 47.60 
//Perimeter is 2 * (5.6 + 8.5) = 28.20


public class Q_5 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		System.out.println("To calculate the area and perimeter of a rectangle.");
		
		System.out.print("Width = ");
		double dWidth = kb.nextDouble();

		System.out.print("Height = ");
		double dHeight = kb.nextDouble();
		
		double dArea = dWidth * dHeight;
		double dPerimeter = 2 * (dWidth + dHeight);

		System.out.println("Area is " + dWidth + " * " + dHeight + " = " + String.format("%.2f",dArea));
		System.out.println("Perimeter is 2 * (" + dWidth + " + " + dHeight + ") = " + String.format("%.2f",dPerimeter));
		
		kb.close();
	}
}
