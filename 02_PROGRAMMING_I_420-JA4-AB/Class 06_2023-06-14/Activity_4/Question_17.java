package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_17.java
//Question : 17
//Author   : BAO, Qingjun
//Date     : 2023/06/15

//Questions 17:
//Write a program to display the multiplication table of a given integer. 
//Test Data : 
//	Input the number (Table to be calculated) : 15 
//Expected Output : 
//	15 X 1 = 15 
//	... 
//	... 
//	15 X 10 = 150

public class Question_17 {	
	public static void multiplicationTable(int iNum) {
		for(int i=1;i<=10;i++) {
			System.out.println(iNum + " X " + i + " = " + iNum*i );
		}
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the number (Table to be calculated) : ");
		int num = kb.nextInt();
//		To display the multiplication table of a given integer. 
		multiplicationTable(num);

		kb.close();
	}
}
