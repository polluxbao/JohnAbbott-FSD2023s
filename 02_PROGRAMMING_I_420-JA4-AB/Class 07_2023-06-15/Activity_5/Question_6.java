package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_6.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//6. Write Java methods to calculate triangle area. 
//Expected Output:
//Input Side-1: 10                                                                               
//Input Side-2: 15                                                                               
//Input Side-3: 20                                                                              
//The area of the triangle is 72.6184377413890


public class Question_6 {
    
	public static boolean is_Valid(double dSide1, double dSide2, double dSide3) {
		if( dSide1 + dSide2 > dSide3 &&
				dSide2 + dSide3 > dSide1 &&
				dSide1 + dSide3 > dSide2) return true;
		else return false;
	}
   
	public static double areaTriangle(double dSide1, double dSide2, double dSide3) {
		double dArea = 0;
		double s = (dSide1 + dSide2 + dSide3)/2;
		dArea = Math.sqrt(s * (s - dSide1) * (s - dSide2) * (s - dSide3));
		return dArea;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input Side-1: ");
        double side1 = kb.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = kb.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = kb.nextDouble();
        System.out.println(is_Valid(side1, side2, side3) ?
               "The area of the triangle is " + areaTriangle(side1, side2, side3) : "Invalid triangle" );
        
		kb.close();
	
	}
}
