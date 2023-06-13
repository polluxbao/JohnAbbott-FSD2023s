package Activity_2;

import java.util.Scanner;

//Project  : Activity_2
//Filename : Q_6_1.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//6. Write a Java program to convert an integer number to a binary number. 
//Input Data: 
//Input a Decimal Number : 5 
//Expected Output
//Binary number is: 101


public class Q_6_1 {

	public static String Transform2Binary(int decimal, int method){
//		The input parameter variables:
//		int decimal	- A non-negative decimal integer
//		int method	- Methods for converting decimal integers to binary values
//					0 : To divide the number by 2 and take the remainder (0 or 1) 
//						as the least significant bit (LSB).
//					1 : Divided by 2 using recursion
//					2 : Binary conversion using bit manipulation
//					3 : Call the function Integer.toString(decimal, 2)
//			  default : Call the function Integer.toBinaryString(decimal)
		
		if(decimal<=0) return "0";
		
		String sResult = "";
		
		switch(method){
		case 0:
			while(decimal!=0) {
				sResult =  decimal%2 + sResult;
				decimal /= 2;
			}
			return sResult;
			
		case 1:
			int quotient = decimal / 2;
			int remainder = decimal % 2;
			String result = "";
	        if (quotient == 0) {
	            return result + remainder;
	        }
			return Transform2Binary(quotient, 1) + remainder;
			
		case 2:
			StringBuilder binary = new StringBuilder();
	        while (decimal > 0) {
	            int bit = decimal & 1;
	            binary.insert(0, bit); 
	            decimal = decimal >> 1;
	        }
	        return binary.toString();
			
		case 3:
			return Integer.toString(decimal, 2);
			
		default :
			return Integer.toBinaryString(decimal);
		}
		
	}
	
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a Decimal Number : ");
		int n = kb.nextInt();
		
		for(int i=0; i<5; i++)
			System.out.println("Convert to Binary number by method " + i + " is: " + Transform2Binary(n,i));

		kb.close();
	}
}
