package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_7.java
//Question : 7
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//7. Write a program to input week number and print week day.

public class Q_7 {
	public static void main(String[] args){
//		To use switch statement. 
		
		Scanner kb = new Scanner(System.in);
		String sWeek;
		
		System.out.print("Input the week number (1~7) : ");
		int iWeek = kb.nextInt();
		
		if(iWeek<1) iWeek = 1;
		if(iWeek>7) iWeek = iWeek%7;

		switch (iWeek) {
		case 1:
			sWeek = "Monday";
			break;
		case 2:
			sWeek = "Tuesday";
			break;
		case 3:
			sWeek = "Wednesday";
			break;
		case 4:
			sWeek = "Thursday";
			break;
		case 5:
			sWeek = "Friday";
			break;
		case 6:
			sWeek = "Saturday";
			break;
		default:
			sWeek = "Sunday";
			break;
		}
		
		System.out.println("The week day is " + sWeek);
		
		kb.close();
	}
}
