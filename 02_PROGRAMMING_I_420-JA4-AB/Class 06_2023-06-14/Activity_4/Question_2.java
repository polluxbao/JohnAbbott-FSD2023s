package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_2.java
//Question : 2
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Question 2:
//Take values of length and breadth of a rectangle from the users and check if it is square or not.


public class Question_2 {
	
	public static boolean checkSquare(double dlength, double dBreadth) {
		boolean check=false;
		if((dlength>0 && dBreadth>0) && (dlength == dBreadth)) {
			check = true;
		}
		return check;
	}
	
	public static void main(String[] args){
		double length, breadth;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the length of a rectangle  : ");
		length = kb.nextDouble();
		System.out.print("Enter the breadth of a rectangle : ");
		breadth = kb.nextDouble();
		
		if(checkSquare(length,breadth)) {
			System.out.println("The rectangle is a Square.");
		} else {			
			System.out.println("The rectangle is NOT a Square.");
		}
		kb.close();
	}
}
