package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_5_2.java
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//5. Write a Java method to create a pentagon's area. 
//Expected Output:
//Input the number of sides: 5                             
//Input the side: 6                                        
//The area of the pentagon is 61.93718642120281



public class Question_5_2 {
	public static double polygonArea(double dSideLength, int n) {
		double a = dSideLength;
		if(a<0 || n<3) return 0;
		return n * a*a / (4*Math.tan(Math.PI/n));
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input the number of sides: ");
        int n = kb.nextInt();
        System.out.print("Input the side: ");
        double side = kb.nextDouble();
        System.out.println("The area of the " + n + " sides polygon is " + polygonArea(side, n));

		kb.close();
	
	}
}
