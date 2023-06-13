package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_20.java
//Question : 20
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//20. If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary. 
//If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary. 
//If the employee's salary is input through the keyboard write a program to find his gross salary

public class Q_20 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		double dBasicSalary, dGrossSalary;
		double HRA, DA;
		
		
		System.out.print("Input the basic salary :");
		dBasicSalary = kb.nextDouble();
		
		if(dBasicSalary < 1500) {
			HRA = dBasicSalary * 0.10;
			DA = dBasicSalary * 0.90;
		} else {
			HRA = 500;
			DA = dBasicSalary * 0.98;
		}
		
		dGrossSalary = dBasicSalary + HRA + DA;
		
		System.out.printf("The employee's gross salary is %.2f $", dGrossSalary);
		
		kb.close();
	}
}
