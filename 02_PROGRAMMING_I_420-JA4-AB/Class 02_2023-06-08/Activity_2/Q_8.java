package Activity_2;

//Project  : Activity_2
//Filename : Q_8.java
//Question : 8
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//8. Write a Java program to print the results of the following operations. 
//Test Data: 
//a. -5 + 8 * 6 
//b. (55+9) % 9 
//c. 20 + -3*5 / 8 
//d. 5 + 15 / 3 * 2 - 8 % 3 
//Expected Output : 
//43 
//1 
//19 
//13


public class Q_8 {
	public static void main(String[] args){
		int iResultA = -5 + 8 * 6;
		int iResultB = (55+9) % 9;
		int iResultC = 20 + -3*5 / 8;
		int iResultD = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(iResultA);
		System.out.println(iResultB);
		System.out.println(iResultC);
		System.out.println(iResultD);
	}
}
