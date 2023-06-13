package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_30.java
//Question : 30
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//30. In a company, worker efficiency is determined on the basis of the time required for a worker 
//	to complete a particular job. 
//	If the time taken by the worker is between 2 – 3 hours, then the worker is said to be highly efficient. 
//	If the time required by the worker is between 3 – 4 hours, then the worker is ordered to improve speed. 
//	If the time taken is between 4 – 5 hours, the worker is given training to improve his speed, 
//	and if the time taken by the worker is more than 5 hours, then the worker has to leave the company. 
//	If the time taken by the worker is input through the keyboard, find the efficiency of the worker

public class Q_30 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.print("Input the time taken by the worker : ");
		double dHours = kb.nextDouble();
		
		if(dHours<3) {
			System.out.println("The worker is highly efficient.");			
		} else if(dHours<4) {
			System.out.println("The worker is ordered to improve speed.");			
		} else if(dHours<=5) {
			System.out.println("The worker is given training to improve his speed.");			
		} else {
			System.out.println("The worker has to leave the company.");						
		}

		kb.close();
	}
}
