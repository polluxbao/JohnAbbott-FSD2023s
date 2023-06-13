package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_6.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//6. Write a program to check whether a year is leap year or not.

public class Q_6 {
	public static void main(String[] args){
		
//		Check whether a year is leap year or not:
//		    1. The year must be divisible by 4.
//		    2. If the year is divisible by 100, it must also be divisible by 400.
		
		Scanner kb = new Scanner(System.in);
		
		boolean bLeap = false;
		
		System.out.print("Input a year : ");
		int iYear = kb.nextInt();
		
		if(iYear%400==0) {
			bLeap = true;
		} else if(iYear%4==0) {
			if(iYear%100!=0) bLeap = true;
		}

		
		if(bLeap) {
			System.out.println("The year " + iYear + " is a leap year.");
		} else {
			System.out.println("The year " + iYear + " is NOT a leap year.");
		}

		kb.close();
	}
}
