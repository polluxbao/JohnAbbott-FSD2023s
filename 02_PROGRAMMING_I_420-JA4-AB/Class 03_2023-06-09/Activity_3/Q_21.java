package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_21.java
//Question : 21
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//21. The marks obtained by a student in 5 different subjects are input through the keyboard. 
//		The student gets a division as per the following rules: 
//		Write a program to calculate the division obtained by the student
//
//		- Percentage above or equal to 60 - First division
//	
//		- Percentage between 50 and 59 - Second division
//	
//		- Percentage between 40 and 49 - Third division
//	
//		- Percentage less than 40 – Fail

public class Q_21 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		int n = 5;
		int iMark, iTotal=0, iPercentage;
		
		System.out.println("Input the Marks of "+ n + " different subjects :");
		for(int i=0;i<n;i++) {
			System.out.print("Input the subject " + (i+1) + " mark : ");
			iMark = kb.nextInt();
			iTotal += iMark;
		}
		
		iPercentage = iTotal / n;
		System.out.print("Percentage is "+ iPercentage + ", ");

		if(iPercentage>=60) {
			System.out.println("above or equal to 60 - First division");
		} else if(iPercentage>=50) {
			System.out.println("between 50 and 59 - Second division");			
		} else if(iPercentage>=40) {
			System.out.println("between 40 and 49 - Third division");
		} else {
			System.out.println("less than 40 – Fail");			
		}

		kb.close();
	}
}
