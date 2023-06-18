package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_9.java
//Question : 9
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//9. Write a Java method for extracting the first digit from a positive or negative integer. 
//Expected Output:
//Input an integer(positive/negative): 1234
//Extract the first digit from the said integer:
//1


public class Question_9 {

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input an integer(positive/negative): ");
        int num = kb.nextInt();
        
        char firstDigit = Integer.toString(Math.abs(num)).charAt(0);
        System.out.println("Extract the first digit from the said integer:");
        System.out.println(firstDigit);
        
		kb.close();
	
	}
}
