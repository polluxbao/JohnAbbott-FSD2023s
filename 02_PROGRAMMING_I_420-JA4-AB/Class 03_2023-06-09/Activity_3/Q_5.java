package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_5.java
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//5. Write a program to check whether a number is even or odd.

public class Q_5 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
				
		System.out.print("Input an integer number : ");
		int num = kb.nextInt();
		
		if(num%2==0) {
			System.out.println("The number " + num + " is even.");
		} else {
			System.out.println("The number " + num + " is odd.");
		}

		kb.close();
	}
}
