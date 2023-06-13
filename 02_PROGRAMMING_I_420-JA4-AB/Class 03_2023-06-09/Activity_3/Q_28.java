package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_28.java
//Question : 28
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//28. A certain grade of steel is graded according to the following conditions
//i. Hardness must be greater than 50
//ii. Carbon content must be less than 0.7
//iii. Tensile strength must be greater than 5600
//The grades are as follows:
//
//Grade is 10 if all three conditions are met
//
//Grade is 9 if conditions (i) and (ii) are met
//
//Grade is 8 if conditions (ii) and (iii) are met
//
//Grade is 7 if conditions (i) and (iii) are met
//
//Grade is 6 if only one condition is met
//
//Grade is 5 if none of the conditions are met
//
//Write a program, which will require the user to give values of hardness, 
//carbon content and tensile strength of the steel under consideration 
//and output the grade of the steel

public class Q_28 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		int iGrade, iGradeCount=0;

		System.out.println("A certain grade of steel is graded according to the following conditions :");
		System.out.print("Input Hardness : ");		
		int iHardness = kb.nextInt();
		
		System.out.print("Input Carbon content: ");		
		double dCarbon = kb.nextDouble();

		System.out.print("Input Tensile strength : ");		
		int iTensile = kb.nextInt();
		
		
		if(iHardness>50) iGradeCount += 1;
		if(dCarbon<0.7) iGradeCount += 10;
		if(iTensile>5600) iGradeCount += 100;
		
		switch (iGradeCount) {
		case 111:
			iGrade = 10;
			break;
		case 11:
			iGrade = 9;
			break;
		case 110:
			iGrade = 8;
			break;
		case 101:
			iGrade = 7;
			break;
		case 1:
			iGrade = 6;
			break;
		case 10:
			iGrade = 6;
			break;
		case 100:
			iGrade = 6;
			break;
		case 0:
			iGrade = 5;
			break;

		default:
			iGrade = 5;
			break;
		}
		
		System.out.println("The grade of the steel is " + iGrade);

		kb.close();
	}
}
