package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_17.java
//Question : 17
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//17. Write a program to input electricity unit charges and calculate total electricity bill 
//	according to the given condition:
//	- For first 50 units Rs. 0.50/unit
//	- For next 150 units Rs. 0.75/unit
//	- For next 250 units Rs. 1.20/unit
//	- For unit above 250 Rs. 1.50/unit
//	- An additional surcharge of 20% is added to the bill

public class Q_17 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		int iUnits;
		double dCharges, dSurcharge=0.20;
		
		System.out.print("Input the electricity unit : ");
		iUnits = kb.nextInt();
		
		if(iUnits <= 50) {
			dCharges = iUnits * 0.50;
		} else if(iUnits <= 150) {
			dCharges = 50*0.5 + (iUnits - 50) * 0.75;
		} else if(iUnits <= 250) {
			dCharges = 50*0.5 + (150-50)*0.75 + (iUnits - 150) * 1.20;
		} else {
			dCharges = 50*0.5 + (150-50)*0.75 + (250-150)*1.20 + (iUnits - 250) * 1.50;
		}
		

		System.out.printf("The additional surcharge is   : %.2f $\n" , dCharges * dSurcharge);
		
		dCharges = dCharges * (1 + dSurcharge);
		
		System.out.printf("The total electricity bill is : %.2f $" , dCharges);

		kb.close();
	}
}
