package Project1;

import java.util.Scanner;

//Project  : Project6
//Filename : Question_2.java
//Question : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/20

//Question 2: 
//
//You are commissioned to write a Java program that will asking from user integer number and 
//call it joker, Then ask from user how many number he/she wants to put .
//After getting all the number output will be as follow, 
//If the number is less than joker give the zero otherwise deduct that number until getting 
//number less than joker and keep that number. 


public class Question_2 {
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.println("Joker :");
		int joker = kb.nextInt();

		System.out.println("Number :");
		int num = kb.nextInt();
		
		System.out.println("Enter numbers :");
		kb.nextLine();
		String str = kb.nextLine();
		String[] sNumbers = str.split(" ");
		
		System.out.println();
		
		int remainder;
		for(int i=0; i<num; i++) {
			remainder = Integer.valueOf(sNumbers[i]) % joker;
			System.out.print(remainder + " ");
		}
		
		kb.close();
	
	}
}
