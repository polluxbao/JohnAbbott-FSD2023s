package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_35.java
//Question : 35
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//35. Write a Java program to check whether the given integer is a multiple of 5

public class Q_35 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

	    int iNumber;

	    System.out.print("Enter a integer number : ");
	    iNumber = kb.nextInt();

	    if(iNumber%5 ==0) {
	    	System.out.print("The number " + iNumber + " is a multiple of 5.");
	    } else {
	    	System.out.print("The number " + iNumber + " is NOT a multiple of 5.");
	    }
	    
	    kb.close();
	}
}
