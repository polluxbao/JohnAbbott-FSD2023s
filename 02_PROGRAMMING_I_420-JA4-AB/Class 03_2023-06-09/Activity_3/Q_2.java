package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_2.java
//Question : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//2) Take four numbers from the user and print the greatest number

public class Q_2 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("To input four numbers and print the greatest number.");
		System.out.print("Input number 1 : ");
		double num1 = kb.nextDouble();
		System.out.print("Input number 2 : ");
		double num2 = kb.nextDouble();
		System.out.print("Input number 3 : ");
		double num3 = kb.nextDouble();
		System.out.print("Input number 4 : ");
		double num4 = kb.nextDouble();
		
		num1 = (num1 > num2) ? num1 : num2;
		
		num3 = (num3 > num4) ? num3 : num4;
		
		num1 = (num1 > num3) ? num1 : num3;
		
		System.out.println("The greatest number is : " + num1);
		kb.close();
		
	}
}
