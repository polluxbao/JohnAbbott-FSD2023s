package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_19.java
//Question : 19
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//19. The current year and the year in which the employee joined the organization are entered 
//through the keyboard. 
//If the number of years for which the employee has served the organization 
//is greater than 3 then a bonus of Rs. 2500/- is given to the employee. 
//If the years of service are not greater than 3, then the program should do nothing

public class Q_19 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		int iCurrentYear, iJoinedYear;
		
		System.out.print("Which year is current year :");
		iCurrentYear = kb.nextInt();
		System.out.print("Which year is the employee joined the organization : ");
		iJoinedYear = kb.nextInt();

		if(iCurrentYear - iJoinedYear < 0) {
			System.out.println("Input Error.");
		}
		
		if(iCurrentYear - iJoinedYear > 3) {
			System.out.println("There is a bonus of Rs. 2500/- is given to the employee.");
		}
		
		kb.close();
	}
}
