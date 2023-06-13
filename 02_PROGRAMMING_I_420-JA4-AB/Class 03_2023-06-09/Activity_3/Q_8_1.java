package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_8_1.java
//Question : 8
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//8. Write a program to input month number and print month Name.

public class Q_8_1 {
	public static void main(String[] args){
//		To use array method.
		Scanner kb = new Scanner(System.in);
		String[] sMonth = new String[]{"January", "February", "March", "April", 
									"May", "June", "July", "August",
									"September", "October", "November", "December"};
		
		System.out.print("Input the month number (1~12) : ");
		int iMonth = kb.nextInt();
		
		if(iMonth<1) iMonth = 1;
		if(iMonth>12) iMonth = iMonth%12;

		System.out.println("The month name is " + sMonth[iMonth-1]);
		
		kb.close();
	}
}
