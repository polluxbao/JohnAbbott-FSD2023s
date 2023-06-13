package Activity_1;

import java.util.Scanner;

//Project  : Activity_1
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/07

//5. Write a Java program that takes three numbers as input to calculate 
//and print the sum of the numbers.

public class Q_5 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("What is the 1st number : ");
		int num1 = kb.nextInt();
		
		System.out.print("What is the 2nd number : ");
		int num2 = kb.nextInt();

		System.out.print("What is the 3rd number : ");
		int num3 = kb.nextInt();
		
		int result = num1 + num2 + num3;
		
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
		kb.close();
		
	}
}

