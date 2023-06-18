package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_14.java
//Question : 14
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 14:
//Write a program to read n numbers from keyboard and find their sum and average

public class Question_14 {
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Input n, how many numbers will read : ");
		int n = kb.nextInt();
		double dNum, dSum=0, dAverage;
		for(int i=0; i<n; i++) {
			System.out.print("Input number " + (i+1) + " : ");
			dNum = kb.nextDouble();
			dSum += dNum;
		}
		dAverage = dSum / n;
		System.out.printf("The average is %.2f", dAverage);
		
		kb.close();
	}
}
