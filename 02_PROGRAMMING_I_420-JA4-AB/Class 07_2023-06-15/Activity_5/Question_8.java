package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_8.java
//Question : 8
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//8. Write a Java method that accepts three integers and returns true if one is the middle point 
//	between the other two integers, otherwise false. 
//Expected Output:
//Input the first number:  2
//Input the second number:  4
//Input the third number:  6
//Check whether the three said numbers has a midpoint!
//true



public class Question_8 {
	public static boolean hasMidpoint1(int a, int b, int c) {
	    boolean aIsMidpoint = (2 * a == b + c); 
	    boolean bIsMidpoint = (2 * b == a + c);
	    boolean cIsMidpoint = (2 * c == a + b);
	    return aIsMidpoint || bIsMidpoint || cIsMidpoint;
	}
	
	public static boolean hasMidpoint2(int a, int b, int c) {
		int sum = a + b + c;
		
		if(sum%3!=0) return false;
		int average = sum /3;
		if(a == average || b == average || c == average) return true;
		return false;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = kb.nextInt();
        System.out.print("Input the second number: ");
        int num2 = kb.nextInt();
        System.out.print("Input the third number: ");
        int num3 = kb.nextInt();
        
        
        System.out.println("Check whether the three said numbers has a midpoint!");
        System.out.println(hasMidpoint2(num1, num2, num3));
        
		kb.close();
	
	}
}
