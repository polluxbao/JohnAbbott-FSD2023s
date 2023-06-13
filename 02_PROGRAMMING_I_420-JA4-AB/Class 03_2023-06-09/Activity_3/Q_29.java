package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_29.java
//Question : 29
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//29. A library charges a fine for every book returned late. 
//	For first 5 days the fine is 50 paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. 
//	If you return the book after 30 days your membership will be cancelled. 
//	Write a program to accept the number of days the member is late to return the book 
//	and display the fine or the appropriate message

public class Q_29 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.print("How many days the member is late to return the book : ");
		int iDays = kb.nextInt();
		if(iDays>=30) {
			System.out.println("The fine is 5 rupees, and the membership will be cancelled.");
		} else if(iDays>10) {
			System.out.println("The fine is 5 rupees.");
		} else if(iDays>5) {
			System.out.println("The fine is one rupee.");
		} else if(iDays>0) {
			System.out.println("The fine is 50 paise.");
		} else {
			System.out.println("No penalty.");			
		}

		kb.close();
	}
}
