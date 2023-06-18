package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_4.java
//Question : 4
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//4. Write a Java method to check whether a string is a valid password. 
//Password rules:
//A password must have at least eight characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.
//Expected Output:
//1. A password must have at least eight characters.                                             
//2. A password consists of only letters and digits.                                         
//3. A password must contain at least two digits                                        
//Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
//Password is valid: abcd1234 


public class Question_4 {
    
	public static boolean isValidPassword(String sPassword) {
		int iLength = sPassword.length();
		int iDigits = 0, iLetters = 0;
		
//		Rule 1 : A password must have at least eight characters.
		if(iLength<8) {
			return false;
		}
		
		for(int i=0; i<iLength; i++) {
			char c = sPassword.charAt(i);
			if(Character.isLetter(c)) iLetters++;
			if(Character.isDigit(c)) iDigits++;
		}
		
//		Rule 2 : A password consists of ONLY letters AND digits.
		if(iLetters+iDigits!=iLength || iLetters==0 || iDigits==0) {
			return false;
		}

//		Rule 3 : A password must contain at least two digits  
		if(iDigits<2) {
			return false;
		}
		
        return true;
		
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

		System.out.println("Password rules:");
		System.out.println("1. A password must have at least eight characters.");
		System.out.println("2. A password consists of only letters and digits. ");
		System.out.println("3. A password must contain at least two digits.");

		System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
		String password =  kb.next();

		if(isValidPassword(password)) {
			System.out.println("Password is valid: " + password);			
		} else {			
			System.out.println("Password is NOT valid!");			
		}
		
		kb.close();
	
	}
}
