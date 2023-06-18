package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_12.java
//Question : 12
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//12. Write a Java method that checks whether all the characters in a given string are 
//vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, 
//otherwise return false. 
//Expected Output:
//Input a string:  AIEEE
//Check all the characters of the said string are vowels or not!
//true



public class Question_12 {
	public static boolean isVowels(String str) {
		String regex = "[aeiou]+";
		if(str.toLowerCase().matches(regex)) return true;
		return false;
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input a string:  ");
        String str = kb.next();
        
        System.out.println("Check all the characters of the said string are vowels or not!");
        System.out.println(isVowels(str));
        
		kb.close();
	
	}
}
