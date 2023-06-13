package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_26.java
//Question : 26
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//26. Find the absolute value of a number entered through the keyboard

public class Q_26 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		

		System.out.print("Input a negative or positive number : ");
		double dNumber = kb.nextDouble();
		
		System.out.println("The absolute value of the number " + dNumber + " is " + Math.abs(dNumber));

		kb.close();
	}
}
