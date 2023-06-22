package ExamFinal;

import java.util.Scanner;

//Project  : ExamFinal
//Filename : Question_1.java
//Question : 1
//Author   : BAO, Qingjun
//Date     : 2023/06/22

//Question 1 ) 10 Marks 
//
//Today you are to write a Java program that that will accept a single word from 
//a user, which you store in a String variable. With the use of loops and nested 
//loops you are to produce a specific pattern with the characters of the word as 
//illustrated in the figures below.
//So after initializing your variables, you are to retrieve a single word String 
//input from the user and then find the appropriate combination of for loops to 
//display each character exactly as displayed in the two samples below.
//Your code must work no matter what word the user enters.


public class Question_1 {
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter a string: ");
//		Enter a single word from the user.
//		Variable: str String: To accept one word string from user.  
		String str = kb.next();
//		Variable: n Integer: To get the length of word string from user.  
		int n = str.length();
		
		System.out.printf("\n");
//		First loop to print the first part of output, show as an inverted triangle.
//		Variable: i Integer: To control the number of lines for output inverted triangle.
//		Variable: j Integer: To determines the length of characters for every line.
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
//				To use charAt method to lookup the position of character in the word string.
//				And use printf method with formatting %s to output a string, and \t to output one tab.
				System.out.printf("%s\t",str.charAt(j));
			}
//			To make a new line.
			System.out.printf("\n");
		}
		
//		First loop to print the second part of output, show as an triangle.
//		Variable: i Integer: To control the number of lines for output, 
//		          and initial from 1 means starting from second line.
//		Variable: j Integer: To determines the length of characters for every line.
		for(int i=1;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.printf("%s\t",str.charAt(j));
			}
			System.out.printf("\n");
		}
		
//		To close Scanner method.
		kb.close();
	
	}
}
