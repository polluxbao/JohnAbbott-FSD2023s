package Activity_1;

import java.util.Scanner;

//Project  : Activity_1
//Question : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/07

//3. Write a Java program to divide two numbers and print them on the screen. 
//Test Data : 
//50/3 
//Expected Output :
//16
//125 / 24 = 5

public class Q_3 {
	public static void main(String[] args){
		int num1 = 50;
		int num2 = 3;
		System.out.println("Test Data : 50/3");
		System.out.println("Expected Output :");
		System.out.println(num1 / num2);
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("What is the 1st number : ");
		num1 = kb.nextInt();
		
		System.out.print("What is the 2nd number : ");
		num2 = kb.nextInt();
		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		
		kb.close();
	}
}

