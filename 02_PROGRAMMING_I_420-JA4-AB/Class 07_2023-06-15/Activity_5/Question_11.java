package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_11.java
//Question : 11
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//11. Write a Java method to check whether every digit of a given integer is even. 
//Return true if every digit is odd otherwise false. 
//Expected Output:
//Input an integer: 8642
//Check whether every digit of the said integer is even or not!
//true


public class Question_11 {
	public static boolean isEven(int iNumber) {
		if(iNumber%2==0) return true;
		return false;
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int num = kb.nextInt();
        
        System.out.println("Check whether every digit of the said integer is even or not!");
        System.out.println(isEven(num));
        
		kb.close();
	
	}
}
