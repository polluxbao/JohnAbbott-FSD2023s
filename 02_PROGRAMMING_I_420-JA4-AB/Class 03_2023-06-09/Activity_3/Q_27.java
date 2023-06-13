package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_27.java
//Question : 27
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//27. Given the length and breadth of a rectangle, write a program to find 
//	whether the area of the rectangle is greater than its perimeter. 
//	For example, the area of the rectangle with length = 5 
//	and breadth = 4 is greater than its perimeter

public class Q_27 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		double dArea, dPerimeter;

		System.out.print("Input the Length of a rectangle : ");
		double dLength = kb.nextDouble();

		System.out.print("Input the Breadth of a rectangle : ");
		double dBreadth = kb.nextDouble();
		
		dArea = dLength * dBreadth;
		
		dPerimeter = 2 * (dLength + dBreadth);
		
		if(dArea > dPerimeter) {
			System.out.println("The area of the rectangle is GREATER than its perimeter");
		} else {
			System.out.println("The area of the rectangle is NOT greater than its perimeter");			
		}
		

		kb.close();
	}
}
