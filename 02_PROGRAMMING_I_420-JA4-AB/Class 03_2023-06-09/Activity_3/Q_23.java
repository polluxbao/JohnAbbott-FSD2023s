package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_23.java
//Question : 23
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//23. A five-digit number is entered through the keyboard. 
//	Write a program to obtain the reversed number and to determine 
//	whether the original and reversed numbers are equal or not

public class Q_23 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		int iNum, iNum_, iDigit;
		int iDigits=5, iNumReversed=0;
		
		System.out.print("Input a " + iDigits + "-digit number : ");
		iNum = kb.nextInt();
		
		int iMax = (int) Math.pow(10, iDigits);
		if(iNum > iMax-1) {
			iNum = iNum - iNum/iMax*iMax;
		}
		
		iNum_ = iNum;
		
		for(int i=iDigits; i>0; i--) {
			iDigit = iNum_/(int)Math.pow(10, i-1);
			iNumReversed += iDigit * (int)Math.pow(10, iDigits-i);
//			System.out.println("i=" + i + "  iDigit=" + iDigit);
			iNum_ = iNum_ - iDigit*(int)Math.pow(10, i-1);
		}
		

		System.out.println("The reversed number is " + iNumReversed);
		if(iNumReversed == iNum) {
			System.out.println("The original number and the reversed number are EQUAL!");
		} else {
			System.out.println("The original number and the reversed number are NOT equal.");
		}

		kb.close();
	}
}
