package Activity_5;

import java.util.Scanner;

//Project  : Activity_5
//Filename : Question_5.java
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/17

//5. Write a Java method (takes n as input) to display an n-by-n matrix. 
//Expected Output:
//Input a number: 10                                                                         
//1 0 0 1 1 0 0 0 1 1                                                                       
//0 0 1 0 1 0 1 0 0 0                                                                        
//0 1 0 1 0 0 0 0 0 1                                                                       
//1 1 1 0 0 0 0 1 1 1                                                                        
//1 1 0 1 1 1 0 1 0 0                                                                      
//1 0 0 0 1 1 0 0 0 0                                                                       
//0 0 1 0 0 0 0 1 1 1                                                                      
//1 1 0 1 0 1 0 0 1 0                                                                       
//0 0 1 0 0 0 0 1 1 0                                                        
//1 1 1 0 0 1 1 1 1 0


public class Question_5 {
    
	 public static void printMatrix(int n) {
	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < n; j++) {
	                System.out.print((int)(Math.random() * 2) + " ");
	            }
	            System.out.println();
	        }
    }
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

        System.out.print("Input a number: ");
        int n = kb.nextInt();
        printMatrix(n);
        
		kb.close();
	
	}
}
