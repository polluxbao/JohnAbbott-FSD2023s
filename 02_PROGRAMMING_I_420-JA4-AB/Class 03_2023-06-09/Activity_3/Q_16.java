package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_16.java
//Question : 16
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//16. Write a program to input basic salary of an employee and calculate its Gross salary according to following:
//	Basic Salary <= 10000 : HRA = 20%, DA = 80%
//	Basic Salary <= 20000 : HRA = 25%, DA = 90%
//	Basic Salary > 20000 : HRA = 30%, DA = 95%

public class Q_16 {
	public static void main(String[] args){
//		Gross salary is the final salary computed after the additions of DA, HRA and other allowances. 
//		The formula for DA and HRA is
//
//		da = basic_salary * (DA/100)
//		
//		If DA = 80% then the statement becomes da = basic_salary * (80/100). 
//		Which can also be written as DA = basic_salary * 0.8. 
//		Likewise you can also derive a formula for HRA.

		Scanner kb = new Scanner(System.in);
		
		double dBasicSalary, dGrossSalary;
		double dHRA, dDA;
		
		System.out.print("Input the Basic Salary : ");
		dBasicSalary = kb.nextInt();
		
		if(dBasicSalary <= 10000) {
			dHRA = 0.20;
			dDA = 0.80;
		} else if(dBasicSalary <= 20000) {
			dHRA = 0.25;
			dDA = 0.90;	
		} else {
			dHRA = 0.30;
			dDA = 0.95;
		}

		dGrossSalary = dBasicSalary * (1 + dHRA + dDA);
		
		System.out.printf("The Gross Salary of the employee is : %.2f $" , dGrossSalary);

		kb.close();
	}
}
