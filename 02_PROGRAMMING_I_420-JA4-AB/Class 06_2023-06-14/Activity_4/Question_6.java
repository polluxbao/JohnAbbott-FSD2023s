package Activity_4;
import java.math.BigDecimal;
import java.util.Collections;

//Project  : Activity_4
//Filename : Question_6.java
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 6:
//Write the code to print Fibonacci numbers until 300.

public class Question_6 {
	
	public static void main(String[] args){
		
	    int n1=0, n2=1, n3=0, iMaxNum = 300;
		
	    System.out.println("Print Fibonacci numbers until 300.");
	    System.out.print(n1 + ", " + n2);
	    n3 = n1 + n2;
	    while(n3<iMaxNum) {
	    	System.out.print(", " + n3);
	    	n1 = n2;
	    	n2 = n3;
	    	n3 = n1 + n2;
	    }
//	    ========================================
	    System.out.println();
	    System.out.println(String.join("", Collections.nCopies(40, "=")));
	    
	    System.out.println("Print The first 300 Fibonacci numbers.");
	    BigDecimal bn1= new BigDecimal("0");
	    BigDecimal bn2= new BigDecimal("1");
	    BigDecimal bn3= new BigDecimal("0");
		int lMaxNum = 300;
	    
	    System.out.println("001 : " + bn1);
	    System.out.println("002 : " + bn2);
	    bn3 = bn1.add(bn2);
	    for(int i=3; i<=lMaxNum; i++) {
	    	System.out.printf("%03d : ", i);
	    	System.out.println(bn3);
	    	bn1 = bn2;
	    	bn2 = bn3;
	    	bn3 = bn1.add(bn2);
	    }
	    
	}
}
