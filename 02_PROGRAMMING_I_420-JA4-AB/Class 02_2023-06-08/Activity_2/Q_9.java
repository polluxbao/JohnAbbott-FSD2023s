package Activity_2;

import java.util.Scanner;

//Project  : Activity_2
//Filename : Q_9.java
//Question : 9
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//9. Write a Java program that takes a number as input and prints its multiplication 
//table up to 10. 
//Test Data: 
//Input a number: 8 
//Expected Output : 
//8 x 1 = 8 
//8 x 2 = 16 
//8 x 3 = 24 
//... 
//8 x 10 = 80

public class Q_9 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int n = kb.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);			
		}
		
		kb.close();

	}
}
