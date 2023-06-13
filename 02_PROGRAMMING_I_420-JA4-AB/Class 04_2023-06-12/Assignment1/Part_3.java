package Assignment1;

import java.util.Random;
import java.util.Scanner;

//Project  : Assignment1
//Filename : Part_3.java
//Part     : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/12

//Part 3 :
//Write a program to prompt user to enter the following information
//1- ¡°Please Enter your first name¡±
//2- Take user¡¯s first name
//3- show a message ¡°Please Enter your last name¡±
//4- Take user¡¯s last name
//5- show a message ¡°Please Enter your age¡±
//6- Take user¡¯s age
//7- Show the user a message that uses those values => Hello : last name, you have year¡¯s old; nice to meet you! -> use printf
//8- Create a random number between 1 and 50
//9- Show a message ¡°Please guess a number between 1 and 50¡±
//10- After user entered the number, check If the number is equal print message ¡°you are lucky¡±
//11- if the number is greater than the generate number, then message the user => ¡°Choose a smaller one you, you were unlucky¡±
//12- if the number is smaller than the generate number, then message the user => ¡°Choose a bigger one, you were unlucky¡±

public class Part_3 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		String sFirstName, sLastName;
		int iAge;
		
		System.out.print("Please Enter your first name : ");
		sFirstName = kb.next();

		System.out.print("Please Enter your last name  : ");
		sLastName = kb.next();
		
		System.out.print("Please Enter your age : ");
		iAge = kb.nextInt();
		
		System.out.printf("Hello : %s, you have %d year's old; nice to meet you!\n", sLastName, iAge);
		
		Random rand = new Random();
		int iNumRand = rand.nextInt(50)+1;
		int iNumGuess;
		
		System.out.print("Please guess a number between 1 and 50 : ");
		iNumGuess = kb.nextInt();
		
		if(iNumGuess == iNumRand) {
			System.out.println("You are lucky!");
		} else if(iNumGuess > iNumRand){
			System.out.println("Choose a smaller one, you were unlucky!");
		} else {
			System.out.println("Choose a bigger one, you were unlucky!");
		}
		
		kb.close();
	}
}
