package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_3.java
//Question : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//3) Write a Java Program to produce an invoice for the below items 
//	每 Carrots: $2 / lb 
//	每 Onions 每 $4 / lb 
//	每 Meat 每 $10 / lb 
//	a) Ask the customer to how many lbs do they need, and calculate the total 
//	b) Ask the customer if they want to pay cash or card 
//		每 If Card, add 13% HST to total 
//		每 if Cash, don＊t add Tax 
//	c) Display the total amount that customer needs to pay
	

public class Q_3 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		String sDiv = "=====================================";
		
		double HST = 0.13;
		double dPay1, dPay2, dPay3;
		double dTotal;
				
		System.out.println("Welcom to supermarch谷!");

		System.out.println("Input how many lbs do customer needs:");

		System.out.print("每 Carrots 每  $2 / lb : ");
		double weight1 = kb.nextDouble();
		dPay1 = 2 * weight1;
		System.out.print("每 Onions  每  $4 / lb : ");
		double weight2 = kb.nextDouble();
		dPay2 = 4 * weight2;
		System.out.print("每 Meat    每 $10 / lb : ");
		double weight3 = kb.nextDouble();
		dPay3 = 10 * weight3;

		dTotal = dPay1 + dPay2 + dPay3;
		
		System.out.print("Input H or D the customer want to pay Cas(h) or Car(d) :");
		char sPay = kb.next().charAt(0);
		if(sPay == 'h' || sPay == 'H' ) {
			System.out.println("The customer wants to pay Cash.");
		} else {
			System.out.println("The customer wants to pay Card.");
		}		

		System.out.println(sDiv);

		System.out.println("         Supermarche Invoice");
		System.out.println(sDiv);
		System.out.println(" No.    Items       Price      Amount");
		System.out.printf(" 1     Carrots     $2 / lb     $%.2f\n", dPay1);
		System.out.printf(" 2     Onions      $4 / lb     $%.2f\n", dPay2);
		System.out.printf(" 3     Meat       $10 / lb     $%.2f\n", dPay3);
		
		System.out.println(sDiv);

		if(sPay == 'h' || sPay == 'H' ) {
			System.out.println("                         HST :  -");
		} else {
			System.out.printf("                         HST : $%.2f\n", dTotal*HST);			
			dTotal *= (1+HST);
		}
		
		System.out.println(sDiv);
		
		System.out.printf("                       Total : %.2f $", dTotal);
		
		kb.close();
		
	}
}
