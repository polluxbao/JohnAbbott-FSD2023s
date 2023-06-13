package Assignment1;

import java.util.Scanner;

//Project  : Assignment1
//Filename : Part_2.java
//Part     : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/12

//Part 2 :
//Write a program that prompts the
//user to enter the month and year and displays the number of days in the
//month. For example, if the user entered month 2 and year 2012, the program
//should display that February 2012 had 29 days. If the user entered month 3
//and year 2015, the program should display that March 2015 had 31 days.
//use this link-> 
//https://coda.io/@hales/simple-online-calculator-for-dates-and-times/how-many-months-of-the-year-have-28-days-13
//don't forget about leap years that have 29 days !!!

public class Part_2 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		int iYear=0, iMonth=0, iDays=0;
		String sMonth;
		while(iMonth<1 || iMonth>12) {
			System.out.print("Enter the Month (1~12): ");
			iMonth = kb.nextInt();
		}

		System.out.print("Enter the Year : ");
		iYear = kb.nextInt();

		switch (iMonth) {
		case 1:
			sMonth = "January";
			iDays = 31;
			break;
		case 2:
			sMonth = "February";
			iDays = 28;
			
			if(iYear%400==0) {
				iDays = 29;
			} else if(iYear%4==0) {
				if(iYear%100!=0) iDays = 29;
			}
			break;
		case 3:
			sMonth = "March";
			iDays = 31;
			break;
		case 4:
			sMonth = "April";
			iDays = 30;
			break;
		case 5:
			sMonth = "May";
			iDays = 31;
			break;
		case 6:
			sMonth = "June";
			iDays = 30;
			break;
		case 7:
			sMonth = "July";
			iDays = 31;
			break;
		case 8:
			sMonth = "August";
			iDays = 31;
			break;
		case 9:
			sMonth = "September";
			iDays = 30;
			break;
		case 10:
			sMonth = "October";
			iDays = 31;
			break;
		case 11:
			sMonth = "November";
			iDays = 30;
			break;
		case 12:
			sMonth = "December";
			iDays = 31;
			break;
		default:
			sMonth = "Error";
			break;
		}
		
		System.out.println(sMonth + " " + iYear + " had " + iDays + " days");
		kb.close();
	}
}
