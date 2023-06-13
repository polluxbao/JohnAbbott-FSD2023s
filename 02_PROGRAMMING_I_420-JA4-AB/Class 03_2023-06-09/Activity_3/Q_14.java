package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_14.java
//Question : 14
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//14. Write a program to calculate profit or loss
//	Formula to calculate profit and loss
//	Profit = SellingPrice - CostPrice
//	Loss = CostPrice - SellingPrice

public class Q_14 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		double dAmount;
	
		System.out.println("To calculate profit or loss.");
		System.out.print("Input the Cost Price : ");
		double dCostPrice = kb.nextDouble();

		System.out.print("Input the Selling Price : ");
		double dSellingPrice = kb.nextDouble();
		
		if(dSellingPrice == dCostPrice) {
			System.out.println("The transaction is No Profit No Loss.");
		} else if(dSellingPrice > dCostPrice) {
			dAmount = dSellingPrice-dCostPrice;
			System.out.printf("The Profit is %.2f $.", dAmount);
		} else if(dCostPrice > dSellingPrice) {
			dAmount = dCostPrice-dSellingPrice;
			System.out.printf("The Loss is %.2f $.", dAmount);
		}
			
		kb.close();
	}
}
