package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_32.java
//Question : 32
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//32. Write a Java program that reads an positive integer and count the number of digits

public class Q_32 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.print("Input an positive integer : ");
		int iNum = kb.nextInt();
		
		if(iNum < 0) {
			System.out.println("The number is negative.");
		} else {
			int iDigits = 0;
		    while (iNum != 0) {
		    	iNum /= 10;
		        iDigits++;
		    }

		    System.out.println("The digits of the number is " + iDigits);
		}
		


	    kb.close();
	}
}
