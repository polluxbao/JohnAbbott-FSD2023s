package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_18.java
//Question : 18
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//18. while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100. 
//If quantity and price per item are input through the keyboard, write a program to calculate the total expenses


public class Q_18 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		int iQuantity;
		double dPrice, dTotal, dDiscount=0.10;
		
		System.out.print("Input the items quantity : ");
		iQuantity = kb.nextInt();

		System.out.print("Input the price : ");
		dPrice = kb.nextDouble();
		
		dTotal = iQuantity * dPrice;
		if(iQuantity >= 100) {
			dTotal = dTotal * (1-dDiscount);
		}
		

		System.out.printf("The total expenses is %.2f $\n" , dTotal);
		
		kb.close();
	}
}
