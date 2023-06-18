package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_6_2.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//6. Write a Java method to find if given number from user is prime or not. 


public class Question_6_2 {
	public static boolean isPrime(int n) {
	    for (int i=2; i<=n/2; i++) {
	    	if (n%i == 0) return false;
	    }
	    
	    return true;
	}
	 
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input a number: ");
        int n = kb.nextInt();
        if(isPrime(n)) {
        	System.out.print("It is a prime number.");
        } else {
        	System.out.print("It is NOT a prime number.");
        }
        
		kb.close();
	
	}
}
