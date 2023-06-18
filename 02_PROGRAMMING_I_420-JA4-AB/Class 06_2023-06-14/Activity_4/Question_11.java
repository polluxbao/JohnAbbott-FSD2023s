package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_11.java
//Question : 11
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 11:
//Print the following patterns using loop getting the number of line from user:

public class Question_11 {
	public static void pattern_a(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int j=iNum-i;j<iNum+1;j++) {				
				System.out.printf("%d",j);
			}
			System.out.printf("\n");
		}
	}
	
	public static void pattern_b(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int j=iNum;j>iNum-i-1;j--) {				
				System.out.printf("%d",j);
			}
			System.out.printf("\n");
		}
	}

	public static void pattern_c(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int j=0;j<i+1;j++) {				
				System.out.printf("%d",j+1);
			}
			System.out.printf("\n");
		}
	}
	
	public static void pattern_d1(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int k=0;k<i;k++) {
				System.out.printf(" ");
			}
			
			for(int j=0;j<iNum-i;j++) {				
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
	}
	
	public static void pattern_d2(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int k=0;k<iNum-i-1;k++) {
				System.out.printf(" ");
			}
			for(int j=0;j<i+1;j++) {				
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
		
		for(int i=0;i<iNum-1;i++) {
			for(int k=0;k<i+1;k++) {
				System.out.printf(" ");
			}
			for(int j=0;j<iNum-i-1;j++) {				
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
	}
	
	public static void pattern_e(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int k=0;k<i;k++) {
				System.out.printf(" ");
			}
			for(int j=0;j<iNum-i;j++) {				
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
		
		for(int i=0;i<iNum-1;i++) {
			for(int k=0;k<iNum-i-2;k++) {
				System.out.printf(" ");
			}
			for(int j=0;j<i+2;j++) {				
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
	}
	
	public static void pattern_f(int iNum) {
		int iSum=1;
		for(int i=0;i<iNum;i++) {
			for(int j=0;j<i+1;j++) {				
				System.out.printf("%d ",iSum++);
			}
			System.out.printf("\n");
		}
	}
	
	public static void pattern_g(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int k=0;k<iNum-i-1;k++) {
				System.out.printf(" ");
			}
			for(int j=-i;j<i+1;j++) {				
				System.out.printf("%d",Math.abs(j)+1);
			}
			System.out.printf("\n");
		}
		
		for(int i=0;i<iNum-1;i++) {
			for(int k=0;k<i+1;k++) {
				System.out.printf(" ");
			}
			
			for(int j=-(iNum-i-2);j<iNum-i-1;j++) {				
				System.out.printf("%d",Math.abs(j)+1);
			}
			System.out.printf("\n");
		}
	}

	public static void pattern_h(int iNum) {
		for(int i=0;i<iNum;i++) {
			for(int k=0;k<iNum-i-1;k++) {
				System.out.printf(" ");
			}
			for(int j=0;j<i*2+1;j++) {				
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		for(int i=0;i<iNum-1;i++) {
			for(int k=0;k<i+1;k++) {
				System.out.printf(" ");
			}
			for(int j=0;j<(iNum-i-1)*2-1;j++) {				
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int num;
		
		System.out.println("Pattern a:");
		num = 5;
		pattern_a(num);
		
		System.out.println();
		System.out.println("Pattern b:");
		pattern_b(num);

		System.out.println();
		System.out.println("Pattern c:");
		num = 6;
		pattern_c(num);
		
		System.out.println();
		System.out.println("Pattern d1:");
		num = 5;
		pattern_d1(num);

		System.out.println();
		System.out.println("Pattern d2:");
		pattern_d2(num);
		
		System.out.println();
		System.out.println("Pattern e:");
		pattern_e(num);
		
		System.out.println();
		System.out.println("Pattern f:");
		pattern_f(num);
		
		System.out.println();	
		System.out.println("Pattern g:");
		num = 4;
		pattern_g(num);
		
		System.out.println();	
		System.out.println("Pattern h:");
		num = 5;
		pattern_h(num);
		
		
		kb.close();
	}
}
