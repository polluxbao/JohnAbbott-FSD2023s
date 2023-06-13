package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_25.java
//Question : 25
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//25. Write a program to check whether a triangle is valid or not, 
//when the three angles of the triangle are entered through the keyboard. 
//A triangle is valid if the sum of all the three angles is equal to 180 degrees

public class Q_25 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		

		System.out.println("To check a triangle Validity or NOT.");
		System.out.println("Input all three angles of the triangle.");
		System.out.print("The 1st triangle : ");
		double dAngle1 = kb.nextDouble();
		
		System.out.print("The 2nd triangle : ");
		double dAngle2 = kb.nextDouble();

		System.out.print("The 3rd triangle : ");
		double dAngle3 = kb.nextDouble();
		
		double sum = dAngle1 + dAngle2 + dAngle3;

		if(sum==180) {
			System.out.println("The triangle is Valid.");
		} else {			
			System.out.println("The triangle is NOT Valid.");
		}
		
		kb.close();
	}
}
