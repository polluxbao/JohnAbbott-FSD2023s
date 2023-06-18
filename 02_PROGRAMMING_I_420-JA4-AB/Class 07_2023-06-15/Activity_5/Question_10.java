package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_10.java
//Question : 10
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//10. Write a Java method to display the factors of 3 in a given integer. 
//Expected Output:
//Input an integer(positive/negative): 81
//
//Factors of 3 of the said integer:
//81 = 3 * 3 * 3 * 3 * 1


public class Question_10 {
	public static void factorsOf3(int iNumber) {
		int result = iNumber;
	    System.out.print(result + " = ");
	    while (result % 3 == 0){
	        System.out.print("3 * ");
	        result = result / 3;
	    }
	    System.out.print(result);
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input an integer(positive/negative): ");
        int num = kb.nextInt();
        
        System.out.println("Factors of 3 of the said integer:");
        factorsOf3(num);
        
		kb.close();
	
	}
}
