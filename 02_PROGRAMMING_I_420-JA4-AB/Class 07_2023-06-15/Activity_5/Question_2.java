package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_2.java
//Question : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/15

//2. Write a Java method to compute the future investment value at a given interest rate for a specified number of years. 
//Sample data (Monthly compounded) and Output:
//Input the investment amount: 1000
//Input the rate of interest: 10
//Input number of years: 5 
//
//Expected Output:
//Years    FutureValue                                     
//1            1104.71                                     
//2            1220.39                                     
//3            1348.18                                     
//4            1489.35                                     
//5            1645.31



public class Question_2 {
	
	public static double FutureValue(double dAmount, double dInterest, int iYear) {
//		Future Value (FV) = PV ¡Á (1 + r) ^ n
//		Where: PV = Present Value. r = Interest Rate (%) n = Number of Compounding Periods.
		double dFV;
		dFV = dAmount*(Math.pow((1+dInterest/12/100), iYear*12));
		return dFV;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

		System.out.print("Input the investment amount: ");
		double amount =  kb.nextDouble();

		System.out.print("Input the rate of interest: ");
		double interest =  kb.nextDouble();
		
		System.out.print("Input number of years: ");
		double year =  kb.nextInt();
		
		System.out.println("Years   FutureValue");
		
		for(int i=1;i<=year;i++) {
			System.out.printf(" %d          %.2f\n",i,FutureValue(amount,interest,i));
		}
		
		kb.close();
	
	}
}
