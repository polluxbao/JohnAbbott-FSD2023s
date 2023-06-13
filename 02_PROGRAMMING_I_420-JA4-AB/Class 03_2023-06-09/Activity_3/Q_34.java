package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_34.java
//Question : 34
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//34. Write a Java program to create a simple calculator

public class Q_34 {
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

	    char cOperator;
	    double dNum1, dNum2, dResult;

	    System.out.print("Enter 1st number : ");
	    dNum1 = kb.nextDouble();

	    System.out.print("Enter 2nd number : ");
	    dNum2 = kb.nextDouble();

	    System.out.print("Choose an operator: +  -  *  / : ");
	    cOperator = kb.next().charAt(0);


	    switch (cOperator) {
	      case '+':
			dResult = dNum1 + dNum2;
			System.out.println(dNum1 + " + " + dNum2 + " = " + dResult);
			break;

	      case '-':
			dResult = dNum1 - dNum2;
			System.out.println(dNum1 + " - " + dNum2 + " = " + dResult);
			break;

	      case '*':
			dResult = dNum1 * dNum2;
			System.out.println(dNum1 + " * " + dNum2 + " = " + dResult);
			break;

	      case '/':
			dResult = dNum1 / dNum2;
			System.out.println(dNum1 + " / " + dNum2 + " = " + dResult);
			break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    
	    kb.close();
	}
}
