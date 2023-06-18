package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_13.java
//Question : 13
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 13:
//Write a program to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. 
//Test Data : 
//	Input the number of terms : 5 
//Expected Output : 
//	1 + 11 + 111 + 1111 + 11111 + 
//	The Sum is : 12345

public class Question_13 {
	
	public static long series(long iNum) {
		long iSum=0;
		for(long i=0;i<iNum;i++) {
			iSum += (iNum-i)*Math.pow(10, i);
		}
		return iSum;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the number of terms (1~19): ");
		long num = kb.nextInt();
		if(num<1 || num>19) {
			System.out.println("Error : Out of range.");
		} else {
			
			for(int i=0; i<num; i++) {
				for(int j=0; j<i+1; j++)
					System.out.print("1");
				System.out.print(" + ");
			}
			
			System.out.println();
			System.out.println("The Sum is : " + series(num));
		}
		kb.close();
	}
}
