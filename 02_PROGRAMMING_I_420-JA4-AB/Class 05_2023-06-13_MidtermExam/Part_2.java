package Exam;
import java.util.Scanner;

//Project  : Exam-Midterm1Ja
//Filename : Part_2.java
//Part     : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/13

//Part 2 : 10 Points
//Write a Java program that requires the user to enter a single character from the alphabet. 
//Print Vowel or Consonant, depending on user input. If the user input is not a letter 
//(between a and z or A and Z), or is a string of length > 1, print an error message.

// Six vowels in the English language: a, e, i, o, u and sometimes y.
// English alphabet are consonants, except for a, e, i, o, and u, which are vowels.

public class Part_2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
//		Set the user input error flag, if the user input is correct, bError=false and jump out of the loop
		boolean bError = true;
//		sChar : String variable for the String sChar default value is empty to ensure that the program is compiled correctly
		String sChar="";
//		cSingleChar : Char variable for judging user input is Consonant or Vowels
		char cSingleChar;
		
//		To give a input prompt sentence
		System.out.println("Enter a single character from the alphabet.");
		
		while (bError) {
//			To convert the string entered by the user to lowercase to facilitate subsequent judgments.
			sChar = kb.next().toLowerCase();
//			To take the first character
			cSingleChar = sChar.charAt(0);
			
//			If the length of the input string is greater than 1, an error message is given and Single character is required
			if(sChar.length()>1) {
				System.out.println("Input error. Enter one character string.");
				
//				If the input character is not in the range of a-z, an out-of-range prompt will be given
			} else if(cSingleChar <'a' || cSingleChar >'z') {
				System.out.println("Input error. The user input is not a letter (between a and z or A and Z)");
				
//				Unable to meet the error condition, jump out of the loop
			} else {
				bError = false;
			}
		}
		
		cSingleChar = sChar.charAt(0);
		
//		First judge whether the input character is Y, special treatment
		if(cSingleChar=='y') {
			System.out.println("Input letter is Consonant, and sometimes Vowels");
			
//			To determine whether it is a vowel
		} else if(cSingleChar=='a' || cSingleChar=='e' || cSingleChar=='i' || cSingleChar=='o' || cSingleChar=='u') {
			System.out.println("Input letter is Vowels.");
			
//			The other conditions are judged as consonants
		} else {
			System.out.println("Input letter is Consonant.");
		}
		
		
		kb.close();
	}

}
