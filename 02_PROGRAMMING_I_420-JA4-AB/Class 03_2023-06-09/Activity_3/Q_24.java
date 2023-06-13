package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_24.java
//Question : 24
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//24. If the ages of Ram, Shyam and Ajay are input through the keyboard, 
//	write a program to determine the youngest of the three.

public class Q_24 {
	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		String[] sName = {"Ram", "Shyam", "Ajay"};
		int[] iAges = new int[3];
		int iYoungest;
		String sYoungName;
		
		for(int i=0; i<3; i++) {
			System.out.print("Input the age of " + sName[i] + " : ");
			iAges[i] = kb.nextInt();
		}
		
		iYoungest = iAges[0];
		sYoungName = sName[0];
		
		for(int i=0; i<3; i++) {
			if(iAges[i]<iYoungest) {
				iYoungest = iAges[i];
				sYoungName= sName[i];
			}
		}
		
		System.out.print("The youngest of the three is " + sYoungName + ", " + iYoungest + " years old.");
		
		kb.close();
	}
}
