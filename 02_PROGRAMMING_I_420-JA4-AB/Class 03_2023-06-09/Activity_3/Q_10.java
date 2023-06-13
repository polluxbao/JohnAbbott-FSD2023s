package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_10.java
//Question : 10
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//10. Write a program to input angles of a triangle and check whether triangle is valid or not.

public class Q_10 {
	public static void main(String[] args){
//Logic to check triangle validity if angles are given
//		Input all three angles of triangle in some variable say angle1 , angle2 and angle3 .
//		Find sum of all three angles, store sum in some variable say sum = angle1 + angle2 + angle3 .
//		Check if(sum == 180) then, triangle can be formed otherwise not.
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
