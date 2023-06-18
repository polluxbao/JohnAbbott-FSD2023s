package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_3.java
//Question : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//3. Write a Java method to check whether a year (integer) entered by the user is a leap year or not. 
//Expected Output:
//Input a year: 2017                                                                        
//false



public class Question_3 {
	
	public static boolean isLeapYear(int iYear) {
//		A leap year is exactly divisible by 4 except for century years (years ending with 00). 
//		The century year is a leap year only if it is perfectly divisible by 400.
		return (iYear % 4 == 0 && iYear % 100 != 0 || iYear % 400 == 0);
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

		System.out.print("Input a year: ");
		int year =  kb.nextInt();

		System.out.println(isLeapYear(year));
		
		kb.close();
	
	}
}
