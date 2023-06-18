package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_5.java
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 5:
//Write a program to solve quadratic equations with 3 variables get from users.

public class Question_5 {
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
	    double a, b, c, discriminant, root1, root2, realPart, imagPart;
		
		System.out.print("Enter coefficients a : ");
		a = kb.nextInt();
		System.out.print("Enter coefficients b : ");
		b = kb.nextInt();
		System.out.print("Enter coefficients c : ");
		c = kb.nextInt();

		System.out.println("The solution is :");

		discriminant = b * b - 4 * a * c;

	    // condition for real and different roots
	    if (discriminant > 0) {
	        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	        System.out.printf("Root1 = %.2f\nRoot2 = %.2f\n", root1, root2);
	    } else if (discriminant == 0) {
    	  // condition for real and equal roots
	        root1 = -b / (2 * a);
	        System.out.printf("Root1 = Root2 = %.2f\n", root1);
	    } else {
		    // if roots are not real
	        realPart = -b / (2 * a);
	        imagPart = Math.sqrt(-discriminant) / (2 * a);
	        System.out.printf("Root1 = %.2f+%.2fi\nRoot2 = %.2f-%.2fi\n", realPart, imagPart, realPart, imagPart);
	    }

		kb.close();
	}
}
