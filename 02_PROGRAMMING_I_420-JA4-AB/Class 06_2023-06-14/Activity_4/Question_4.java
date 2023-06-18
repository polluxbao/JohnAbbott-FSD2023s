package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_4.java
//Question : 4
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 4:
//Take 4th int values from the users and print greatest among them.

public class Question_4 {
	
	public static void main(String[] args){
		int iNum, iMaxNum=0, n=4;
		boolean first = true;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 4 integer values, and find the greatest number.");

		for(int i=0; i<n; i++) {
			System.out.print("Enter the number " + (i+1) + " : ");
			iNum = kb.nextInt();
			if(first || iNum>iMaxNum) {
				iMaxNum = iNum;
				first = false;
			}
		}

		System.out.println("The greatest number is " + iMaxNum);
		
		kb.close();
	}
}
