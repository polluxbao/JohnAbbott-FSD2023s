package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_7.java
//Question : 7
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//7. Write a Java method that accepts three integers and checks whether they are consecutive or not. 
//	Returns true or false. 
//Expected Output:
//Input the first number:  15
//Input the second number:  16
//Input the third number:  17
//Check whether the three said numbers are consecutive or not! true


public class Question_7 {
	public static boolean consecutive(int a, int b, int c) {
	    int min = Math.min(a, Math.min(b, c));
	    int max = Math.max(a, Math.max(b, c));
	    return max - min == 2 && a != b && a != c && b != c;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = kb.nextInt();
        System.out.print("Input the second number: ");
        int num2 = kb.nextInt();
        System.out.print("Input the third number: ");
        int num3 = kb.nextInt();

        System.out.println("Check whether the three said numbers are consecutive or not! " + consecutive(num1, num2, num3));
        
		kb.close();
	
	}
}
