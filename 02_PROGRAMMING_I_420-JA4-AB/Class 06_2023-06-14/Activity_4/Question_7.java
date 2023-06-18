package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_7.java
//Question : 7
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 7:
//Write the program to print the factorial number of the value getting from user?

public class Question_7 {
	public static int factor(int iNum) {
		int iFactor=1;
		for(int i=1;i<iNum+1;i++) {
			iFactor = iFactor * i;
		}
		return iFactor;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
				
		System.out.print("Enter a number : ");
		int num = kb.nextInt();
		if(num<0) {
			System.out.println("The Negative number has no factorial number.");
		} else {			
			System.out.println("The " + num + "! factorial number is : " + factor(num));
		}

		kb.close();
	}
}
