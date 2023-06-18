package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_10.java
//Question : 10
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 10:
//Write a program that takes three numbers as input to calculate and print the average of the numbers.

public class Question_10 {
	public static double average(int iNum) {
		Scanner kb = new Scanner(System.in);
		double dSum=0;
		for(int i=0;i<iNum;i++) {
			System.out.print("Input number " + (i+1) + " : ");
			dSum += kb.nextInt();
		}
		
		kb.close();
		return dSum/iNum;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int num=3;
				
		System.out.println("Input "+ num + " numbers and calculate the average of the numbers.");
        
        System.out.println("The average of the numbers is "+ average(num));

		kb.close();
	}
}
