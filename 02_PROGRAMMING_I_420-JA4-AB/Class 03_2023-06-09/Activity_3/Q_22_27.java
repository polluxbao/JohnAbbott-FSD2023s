package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_22_27.java
//Question : 22_27
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//27. Write a program to calculate the salary as per the following table
//
//   Gender   |  Year of Service  |  Qualifications  |  Salary
//------------+-------------------+------------------+----------
//            |       >= 10       | Post - Graduate  |  15000
//   Male     |       >= 10       |     Graduate     |  10000
//            |        < 10       | Post - Graduate  |  10000
//            |        < 10       |     Graduate     |   7000
//------------+-------------------+------------------+----------
//            |       >= 10       | Post - Graduate  |  12000
//   Female   |       >= 10       |     Graduate     |   9000
//            |        < 10       | Post - Graduate  |  10000
//            |        < 10       |     Graduate     |   6000
//------------+-------------------+------------------+----------



public class Q_22_27 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		char cSex, cQualification;
		int iYear, iSalary;
		
		System.out.println("Input the personal information of the employee.");
		System.out.print("The employee is (M)ale or (F)emale : ");
		cSex = kb.next().charAt(0);

		System.out.print("How many Years of Service : ");
		iYear = kb.nextInt();
		
		System.out.print("The employee is (P)ost-Graduate or (G)raduate : ");
		cQualification = kb.next().charAt(0);
		
		
		if(cSex == 'M' || cSex == 'm') {
			if(iYear>=10) {
				if(cQualification == 'P' || cQualification == 'p' ) {
					iSalary = 15000;
				} else {
					iSalary = 10000;
				}
			} else {
				if(cQualification == 'P' || cQualification == 'p' ) {
					iSalary = 10000;
				} else {
					iSalary = 7000;
				}				
			}
		} else {
			if(iYear>=10) {
				if(cQualification == 'P' || cQualification == 'p' ) {
					iSalary = 12000;
				} else {
					iSalary = 9000;
				}
			} else {
				if(cQualification == 'P' || cQualification == 'p' ) {
					iSalary = 10000;
				} else {
					iSalary = 6000;
				}				
			}
		}
		
		System.out.println("The employee's salary is " + iSalary);
		
		kb.close();
	}
}
