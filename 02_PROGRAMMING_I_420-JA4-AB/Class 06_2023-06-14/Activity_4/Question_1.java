package Activity_4;

//Project  : Activity_4
//Filename : Question_1.java
//Question : 1
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Question 1:
//Write the program, which is calculate the profit of investment, 
//given an amount of investment, interest rate and number of investment year.
//principle = 1000; // notice that this is a valid double value
//interestRate = 0.0625; // that is 6.25%
//numOfYears = 5;
//numOfYears = 8;//also calculate for 8 years


public class Question_1 {
	public static double investment(double dPrinciple, double dInterestRate, int iNumOfYears) {
		double dProfit;
		dProfit = dPrinciple * Math.pow((1 + dInterestRate), iNumOfYears) - dPrinciple;
		return dProfit;
	}
	public static void main(String[] args){
		double principle = 1000;
		double interestRate = 0.0625;
		int numOfYears;
		double profit;
		
		System.out.printf("The principle is %.2f $, interest rate is %.2f%%\n", principle,interestRate*100);
		
		numOfYears = 5;
		profit = investment(principle, interestRate, numOfYears);
		System.out.printf("To invest %d years, the profit is %.2f $\n", numOfYears, profit);

		numOfYears = 8;
		profit = investment(principle, interestRate, numOfYears);
		System.out.printf("To invest %d years, the profit is %.2f $\n", numOfYears, profit);
	
	}
}
