package Assignment1;

import java.util.Random;

//Project  : Assignment1
//Filename : Part_1.java
//Part     : 1
//Author   : BAO, Qingjun
//Date     : 2023/06/12

//Part 1 :
//Write a program that randomly generates an integer between 1 and 12
//and based on the number, use switch case syntax to print which month has been chosen
//1 for "January" , 2 for "Februaray" .....

public class Part_1 {
	public static void main(String[] args){
		Random rand = new Random();
		int iMonth = rand.nextInt(12)+1;
		String sMonth;

		switch (iMonth) {
		case 1:
			sMonth = "January";
			break;
		case 2:
			sMonth = "February";
			break;
		case 3:
			sMonth = "March";
			break;
		case 4:
			sMonth = "April";
			break;
		case 5:
			sMonth = "May";
			break;
		case 6:
			sMonth = "June";
			break;
		case 7:
			sMonth = "July";
			break;
		case 8:
			sMonth = "August";
			break;
		case 9:
			sMonth = "September";
			break;
		case 10:
			sMonth = "October";
			break;
		case 11:
			sMonth = "November";
			break;
		case 12:
			sMonth = "December";
			break;
		default:
			sMonth = "Error";
			break;
		}

		System.out.println("An integer randomly generated     : " + iMonth);
		System.out.println("The name of month has been chosen : " + sMonth);
	}
}
