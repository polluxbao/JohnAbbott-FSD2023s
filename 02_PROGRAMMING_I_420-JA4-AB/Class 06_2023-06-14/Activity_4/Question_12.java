package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_12.java
//Question : 12
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Question 12:
//Write a program to display the cube of the number up to given an integer. 
//Test Data : 
//	Input number of terms : 5 
//Expected Output : 
//	Number is : 1 and cube of the 1 is :1 
//	Number is : 2 and cube of the 2 is :8 
//	Number is : 3 and cube of the 3 is :27 
//	Number is : 4 and cube of the 4 is :64 
//	Number is : 5 and cube of the 5 is :125

public class Question_12 {
	
	public static int cube(int iNum) {
		return iNum*iNum*iNum;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of terms : ");
		int num = kb.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println("Number is : " + i + " and cube of the 1 is : " + cube(i));
		}
		kb.close();
	}
}
