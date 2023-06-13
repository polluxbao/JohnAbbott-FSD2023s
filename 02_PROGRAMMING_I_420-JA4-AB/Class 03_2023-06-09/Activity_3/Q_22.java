package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_22.java
//Question : 22
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//22. A company insures its drivers in the following cases:
//
//- If the driver is married
//
//- If the driver is unmarried, male & above 30 years of age
//
//- If the driver is unmarried, female & above 25 years of age
//
//  In all the other cases the driver is not insured. 
//	If the marital status, sex and age of the driver are the inputs, 
//	write a program to determine whether the driver is to be insured or not.

public class Q_22 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		char cSex, cMarital;
		int iAge;
		boolean bInsure=false;
		
		System.out.println("Input the personal information of the driver.");
		System.out.print("The driver is (M)ale or (F)emale : ");
		cSex = kb.next().charAt(0);
		
		System.out.print("The driver is (M)arried or (U)nmarried : ");
		cMarital = kb.next().charAt(0);
		
		System.out.print("What is the age of the driver : ");
		iAge = kb.nextInt();
		
		if(cMarital == 'M' || cMarital == 'm') {
			bInsure = true;
		} 
		
		if((cSex == 'M' || cSex == 'm') && iAge > 30) {
			bInsure = true;
		} 
		
		if((cSex == 'F' || cSex == 'f') && iAge > 25) {
			bInsure = true;
		} 
		
		if(bInsure) {
			System.out.print("The driver is to be insured.");
		} else {
			System.out.print("The driver is NOT to be insured.");
		}
		
		kb.close();
	}
}
