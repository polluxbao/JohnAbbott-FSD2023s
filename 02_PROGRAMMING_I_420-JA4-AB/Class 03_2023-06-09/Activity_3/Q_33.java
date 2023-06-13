package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_33.java
//Question : 33
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//33. Write a java program that accepts three numbers from the user and check if numbers are 
//	in "increasing" or "decreasing" order

public class Q_33 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Input three numbers and if numbers are in increasing or decreasing order");
		System.out.print("Input 1st number : ");
		double dNum1 = kb.nextDouble();
		
		System.out.print("Input 2nd number : ");
		double dNum2 = kb.nextDouble();
		
		System.out.print("Input 3rd number : ");
		double dNum3 = kb.nextDouble();
		
		
		if(dNum1 < dNum2 && dNum2 < dNum3) {
			System.out.println("The three number are in Increasing order.");
		} else if(dNum1 > dNum2 && dNum2 > dNum3) {
			System.out.println("The three number are in Decreasing order.");
	    } else {
		    System.out.println("The three number are in Disorder.");
		}
	

	    kb.close();
	}
}
