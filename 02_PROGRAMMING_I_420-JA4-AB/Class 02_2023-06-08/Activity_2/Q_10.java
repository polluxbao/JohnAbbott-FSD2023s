package Activity_2;

import java.util.Scanner;

//Project  : Activity_2
//Filename : Q_10.java
//Question : 10
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//10. Write a Java program to swap two variables. Getting from the users.

public class Q_10 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input 1st : ");
		String s1 = kb.next();

		System.out.print("Input 2nd : ");
		String s2 = kb.next();

		System.out.println("Before swap two variables: ");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		String sTemp = s1;
		s1 = s2;
		s2 = sTemp;
		
		System.out.println("After swap two variables: ");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		kb.close();

	}
}
