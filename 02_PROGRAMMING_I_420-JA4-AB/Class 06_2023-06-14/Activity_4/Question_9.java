package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_9.java
//Question : 9
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 9:
//Write a program to convert minutes into a number of years and days.

public class Question_9 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		final int minutesInYear = 60 * 24 * 365;
				
		System.out.print("Input the number of minutes: ");
		
		int iMin = kb.nextInt();
		
		int iYears = (int) (iMin / minutesInYear);
        int iDays = (int) (iMin / 60 / 24) % 365;
        
        System.out.println(iMin + " minutes is approximately " + iYears + " year(s) and " + iDays + " day(s)");


		kb.close();
	}
}
