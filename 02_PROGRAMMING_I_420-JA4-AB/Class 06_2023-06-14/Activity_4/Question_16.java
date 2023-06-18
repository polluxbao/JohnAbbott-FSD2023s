package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_16.java
//Question : 16
//Author   : BAO, Qingjun
//Date     : 2023/06/15

//Questions 16:
//Write a method that print 10 by 10 multiplication table. Make it readable

public class Question_16 {	
	public static void multiplicationTable(int iNum) {
		for(int i=1;i<=iNum;i++) {
			for(int j=i;j<=i*10;j=j+i) {
				System.out.printf("%4d",j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
//		System.out.print("Input the number of multiplication table : ");
//		int num = kb.nextInt();
		int num = 10;
//		a method that print 10 by 10 multiplication table.
		multiplicationTable(num);

		kb.close();
	}
}
