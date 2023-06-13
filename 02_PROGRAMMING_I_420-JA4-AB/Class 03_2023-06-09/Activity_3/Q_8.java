package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_8.java
//Question : 8
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//8. Write a program to input month number and print month Name.

public class Q_8 {
	public static void main(String[] args){
//		To use switch statement. 
		Scanner kb = new Scanner(System.in);
		
		String sMonth;
		
		System.out.print("Input the month number (1~12) : ");
		int iMonth = kb.nextInt();
		
		if(iMonth<1) iMonth = 1;
		if(iMonth>12) iMonth = iMonth%12;

		switch (iMonth) {
		case 1:
			sMonth = "January";
			break;
		case 2:
			sMonth = "February";
			break;
		case 3:
			sMonth = "March";
			break;
		case 4:
			sMonth = "April";
			break;
		case 5:
			sMonth = "May";
			break;
		case 6:
			sMonth = "June";
			break;
		case 7:
			sMonth = "June";
			break;
		case 8:
			sMonth = "July";
			break;
		case 9:
			sMonth = "August";
			break;
		case 10:
			sMonth = "September";
			break;
		case 11:
			sMonth = "October";
			break;
		default:
			sMonth = "December";
			break;
		}
		
		System.out.println("The month name is " + sMonth);
		
		kb.close();
	}
}
