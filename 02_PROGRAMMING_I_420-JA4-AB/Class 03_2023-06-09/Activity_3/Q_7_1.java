package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_7_1.java
//Question : 7
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//7. Write a program to input week number and print week day.

public class Q_7_1 {
	public static void main(String[] args){
//		To use array method.
		Scanner kb = new Scanner(System.in);
		String[] sWeek = new String[]{"Monday", "Tuesday", "Wednesday", 
							"Thursday", "Friday", "Saturday", "Sunday"};
				
		System.out.print("Input the week number (1~7) : ");
		int iWeek = kb.nextInt();
		
		if(iWeek<1) iWeek = 1;
		if(iWeek>7) iWeek = iWeek%7;
		
		System.out.println("The week day is " + sWeek[iWeek-1]);
		
		kb.close();
	}
}
