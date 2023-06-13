package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_4.java
//Question : 4
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//4)Write a program to check whether a number is divisible by 5 and 11 or not

public class Q_4 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
				
		System.out.print("Input an integer number : ");
		int num = kb.nextInt();
		boolean bDiv = false;
		
		if(num%5==0) {
			System.out.println("The number " + num + " is divisible by 5.");
			bDiv = true;
		}

		if(num%11==0) {
			System.out.println("The number " + num + " is divisible by 11.");
			bDiv = true;
		}
		
		if(!bDiv) {
			System.out.println("The number " + num + " is not divisible by 5 or 11.");
		}
		
		kb.close();
		
	}
}
