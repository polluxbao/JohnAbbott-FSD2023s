package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_15.java
//Question : 15
//Author   : BAO, Qingjun
//Date     : 2023/06/15

//Questions 15:
//Write a program to accept a grade and declare the equivalent description :
//	Grade   Description 
//	  E     Excellent 
//	  V     Very Good 
//	  G     Good 
//	  A     Average 
//	  F     Fail
//Test Data : 
//	Input the grade :a 
//Expected Output : 
//	You have chosen : Average

public class Question_15 {	
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the grade : ");
		String sGrade = kb.next().toUpperCase();
		String sDescription;
		
		while(sGrade.length()>1) {
			System.out.print("Input the grade One Letter (E V G A F) : ");
			sGrade = kb.next().toUpperCase();
		}

		switch (sGrade) {
		case "E":
			sDescription = "Excellent";
			break;
		case "V":
			sDescription = "Very Good";
			break;
		case "G":
			sDescription = "Good";
			break;
		case "A":
			sDescription = "Average";
			break;
		case "F":
			sDescription = "Fail";
			break;
			
		default:
			sDescription = "Nothing";
			break;
		}
		

		System.out.println("You have chosen : " + sDescription);
		
		kb.close();
	}
}
