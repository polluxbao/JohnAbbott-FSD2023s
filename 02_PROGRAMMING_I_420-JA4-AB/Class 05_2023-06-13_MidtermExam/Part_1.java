package Exam;

import java.util.Scanner;

//Project  : Exam-Midterm1Ja
//Filename : Part_1.java
//Part     : 1
//Author   : BAO, Qingjun
//Date     : 2023/06/13

//Part 1 : 10 Points
//Online Music/Apps Store
//An online music and apps store offers all apps for 3$ each and all songs for 7$ each. 
//The store requires members to prepay any amount of money they wish, and then download 
//as many apps or as many songs accordingly. You are required to write a program that 
//would ask the user for the amount that he/she will pay, then display two messages indicating:
//- the maximum number of apps that can be downloaded, and how much funds will remain in the 
//	account after that, if any.
//- the maximum number of songs that can be downloaded, the number of apps that can be downloaded 
//	after that if funds allow, and how much funds will remain in the account after that, if any.
// 	Notice the parenthesis in app(s) and song(s) in the output.

public class Part_1 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How much money do you wish to prepay?");
//		iPrepay : integer variable for input the user's prepay amount.
//		iAppPrice : integer variable for each app $3.
//		iSongPrice : integer variable for each song $7.
		int iPrepay = kb.nextInt();
		int iAppPrice = 3;
		int iSongPrice = 7;
		
//		Firstly to calculate how much the apps and songs can buy at most in the two different conditions.
		int iAppNum = iPrepay / iAppPrice;
		int iAppLeft = iPrepay % iAppPrice;
		
		int iSongNum = iPrepay / iSongPrice;
		int iSongLeft = iPrepay % iSongPrice;
		
//		If both app and song amount are Zero, the output cannot buy any
		if(iAppNum==0 && iSongNum==0) {
			System.out.println("With this amount, you will not be able to purchase any app or song.");
		} else {
//			To output option 1, buy the app(s) first
			System.out.println("With this amount, you will be able to purchase " + iAppNum + " app(s). You will then have " + iAppLeft + "$ left as a credit on your account.");
		}
		
//		If the song amount above 1, output the second option
		if(iSongNum > 0) {
			iAppNum = iSongLeft / iAppPrice;
			iSongLeft = iSongLeft % iAppPrice;
			System.out.println("Alternatively, for this amount, you will be able to purchase " + iSongNum + " song(s) and " + iAppNum + " app(s). You will then have " + iSongLeft + "$ left as a credit on your account.");
		}
		
//		To output Thanks
		System.out.println("Thanks for Shopping at Best Music Store!");
		
		kb.close();
		
	}

}
