package Activity_6;

import java.util.Arrays;

//Project  : Activity_6
//Filename : Question_16.java
//Question : 16
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//16. Write a Java program to add two matrices of the same size.

public class Question_16 {    
    public static double[][] addMatrices(double[][] dMatrice1, double[][] dMatrice2)  {
    	int m1 = dMatrice1.length;
    	int n1 = dMatrice1[0].length;
    	int m2 = dMatrice2.length;
    	int n2 = dMatrice2[0].length;
    	if(m1!=m2 || n1!=n2) {
    		double[][] Err = new double[0][0]; 
    		return Err;
    	}
    	double[][] dNewMatrice = new double[m1][n1];
    	
    	for(int row=0; row<m1; row++) {
    		for(int col=0; col<n1; col++) {
    			dNewMatrice[row][col] = dMatrice1[row][col] + dMatrice2[row][col];
    		}
    	}
    	return dNewMatrice;
    }
 
    public static void main(String[] args) {
    	double[][] matrice1 = {{5,2,6},{8,6,7},{5,2,8}};
    	double[][] matrice2 = {{3,7,4},{9,1,2},{0,4,5}};
		
		System.out.println("To add two matrices of the same size.");
		System.out.println("Matrice 1 :");
        System.out.println(Arrays.deepToString(matrice1)); 
        System.out.println("Matrice 2 :");
        System.out.println(Arrays.deepToString(matrice2)); 
        
        double[][] result = addMatrices(matrice1, matrice2);
        if(result.length==0) {
        	System.out.println("Error! The two matrices have different size.");
        } else {
        	System.out.println("The result of addition :");
        	System.out.println(Arrays.deepToString(result)); 
        }
        

		
    }
}
