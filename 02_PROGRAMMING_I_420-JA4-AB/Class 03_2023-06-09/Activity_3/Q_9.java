package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_9.java
//Question : 9
//Author   : BAO, Qingjun
//Date     : 2023/06/09

//9. Write a program to count total number of notes in given amount

public class Q_9 {
	public static void main(String[] args){
//		To use switch statement. 
		Scanner kb = new Scanner(System.in);
		
		int[] iNotes= new int[]{100, 50, 20, 10, 5, 2, 1};
		int n;
		int iTotal=0;
		
		System.out.print("Input the notes amount : ");
		int amount = kb.nextInt();
		if(amount<0) amount=0;
		
		System.out.println("The number of notes:");
		for(int i=0; i<iNotes.length;i++) {
			n = amount/iNotes[i];
			System.out.printf("  CAD %3d $ :%3d\n",iNotes[i], n);
			iTotal = iTotal + n;
			amount = amount%iNotes[i];
		}
		
		System.out.println("The total number of notes : " + iTotal);
		kb.close();
	}
}
