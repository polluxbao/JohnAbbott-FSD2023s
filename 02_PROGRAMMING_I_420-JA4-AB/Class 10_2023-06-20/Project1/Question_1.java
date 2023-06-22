package Project1;

import java.util.Scanner;

//Project  : Project6
//Filename : Question_1.java
//Question : 1
//Author   : BAO, Qingjun
//Date     : 2023/06/20

//Question 1: 
//
//Today you are commissioned to write a Java program that will prompt for and read 3 2-digit integers 
//(named n1, n2 and n3 in this document) entered by the user, and based on their sum will generate 
//a magic number. Be sure to use the same format and wording as in the sample runs in the table below.
//Using nested ifs generate and display the magic number based on the following criteria. 
//If the sum of the 3 integers entered is:
//	1.	A multiple of 3 but not a multiple of 5 then the magic number is made up of the 1st digit 
//		of n2 followed by the sum of n1 and n3.
//	2.	Not a multiple of 3 but a multiple of 5 then the magic number is made up of the sum of n1 
//		and n3 followed by the last digit of n2.
//	3.	A multiple of 3 and a multiple of 5 then the magic number is n2 followed by n1 followed by 
//		the digit 1.
//	4.	None of the above conditions then the magic number is n1 followed by n2 followed by n3.



public class Question_1 {
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter 3 2-digit numbers :");
		String str = kb.nextLine();
		String[] sNumbers = str.split(" ");

		int n1 = Integer.valueOf(sNumbers[0]);
		int n2 = Integer.valueOf(sNumbers[1]);
		int n3 = Integer.valueOf(sNumbers[2]);
		int sum=n1+n2+n3;
		String result="";
		

//		Rule 1. A multiple of 3 but not a multiple of 5 then the magic number is made up of the 1st digit 
//		of n2 followed by the sum of n1 and n3.
		if(sum%3==0 && sum%5!=0) {
			result = String.valueOf((int)n2/10) + String.valueOf(n1 + n3);
		}
		
//		Rule 2. Not a multiple of 3 but a multiple of 5 then the magic number is made up of the sum of n1 
//		and n3 followed by the last digit of n2.
		if(sum%3!=0 && sum%5==0) {
			result = String.valueOf(n1 + n3) + String.valueOf((int)n2%10);
		}
		
//		Rule 3. A multiple of 3 and a multiple of 5 then the magic number is n2 followed by n1 followed by 
//		the digit 1.
		if(sum%3==0 && sum%5==0) {
			result = String.valueOf(n2) + String.valueOf(n1) + String.valueOf(1); 
		}
		
//		Rule 4. None of the above conditions then the magic number is n1 followed by n2 followed by n3.
		if(result=="") {
			result = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3);
		}

		System.out.println("Your magic number is " + result);
		kb.close();
	
	}
}
