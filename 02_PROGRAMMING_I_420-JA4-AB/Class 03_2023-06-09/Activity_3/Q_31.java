package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_31.java
//Question : 31
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//31. Write a Java program that accepts three numbers and check All numbers are equal or not

public class Q_31 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Input three numbers and check All numbers are equal or not.");
		System.out.print("Input 1st number : ");
		double dNum1 = kb.nextDouble();
		
		System.out.print("Input 2nd number : ");
		double dNum2 = kb.nextDouble();
		
		System.out.print("Input 3rd number : ");
		double dNum3 = kb.nextDouble();
		
		if(dNum1==dNum2 && dNum1==dNum3 && dNum2==dNum3) {
			System.out.println("All numbers are EQUAL.");			
		} else {
			System.out.println("All numbers are NOT equal.");			
		} 

		kb.close();
	}
}
