package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_2_1.java
//Question : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//2) Take four numbers from the user and print the greatest number

public class Q_2_1 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("To input four numbers and print the greatest number.");

		int position=1;
		double num, maxNum=0;
		
		for(int i=1; i<=4; i++) {
			System.out.print("Input number " + i +" : ");
			num = kb.nextDouble();
//			To set the number as MAX Number when 1st input
			if(i==1) {maxNum=num;}
			
//			To record the MAX Number and its Position when found
//			the input number is larger than MAX Number stored 
			if(num > maxNum) {
				maxNum = num;
				position = i;
			}
		}
		
		System.out.println("The greatest is number " + position + " : " + maxNum);
		
		kb.close();
		
	}
}
