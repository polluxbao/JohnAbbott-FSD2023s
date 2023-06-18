package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_8.java
//Question : 8
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 8:
//Write a program to convert temperature from Fahrenheit to Celsius degree getting the values from users.

public class Question_8 {
	public static double Fahrenheit2Celsius(double iFahren) {
		double iCel;
		iCel = (iFahren - 32) / 1.8;
		return iCel;
	}
	
	public static double Celsius2Fahrenheit(double iCelsius) {
		double iFahren;
		iFahren = 32 + iCelsius * 1.8;
		return iFahren;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		final double dLowestFahrenheit = -459.67;
		final double dLowestCelsius = -273.15;
		double degree;
		
		System.out.print("Enter a Fahrenheit degree : ");
		degree = kb.nextInt();
		if(degree<dLowestFahrenheit) {
			System.out.println("The Fahrenheit degree CANNOT below " + dLowestFahrenheit + "¡ãF");
		} else {
			System.out.printf("The Celsius degree is %.1f¡ãC\n", Fahrenheit2Celsius(degree));
		}
		
		System.out.print("Enter a Celsius degree : ");
		degree = kb.nextInt();
		if(degree<dLowestFahrenheit) {
			System.out.println("The Celsius degree CANNOT below " + dLowestCelsius + "¡ãC");
		} else {
			System.out.printf("The Fahrenheit degree is %.1f¡ãF\n", Celsius2Fahrenheit(degree));
		}
		

		kb.close();
	}
}
