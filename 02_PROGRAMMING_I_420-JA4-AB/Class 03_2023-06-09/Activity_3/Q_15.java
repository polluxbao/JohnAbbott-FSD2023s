package Activity_3;

import java.util.Scanner;

//Project  : Activity_3
//Filename : Q_15.java
//Question : 15
//Author   : BAO, Qingjun
//Date     : 2023/06/10

//15. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. 
//	Calculate percentage and grade according to following:
//
//	- Percentage >= 90% : Grade A
//	- Percentage >= 80% : Grade B
//	- Percentage >= 70% : Grade C
//	- Percentage >= 60% : Grade D
//	- Percentage >= 40% : Grade E
//	- Percentage < 40% : Grade F

public class Q_15 {
	public static void main(String[] args){
		

		Scanner kb = new Scanner(System.in);
		
		int iPhysics, iChemistry, iBiology, iMathematics, iComputer;
		int iTotal=0, iPercent;
		
		System.out.print("Input marks of Physics : ");
		iPhysics = kb.nextInt();
		
		System.out.print("Input marks of Chemistry : ");
		iChemistry = kb.nextInt();
		
		System.out.print("Input marks of Biology : ");
		iBiology = kb.nextInt();
		
		System.out.print("Input marks of Mathematics : ");
		iMathematics = kb.nextInt();
		
		System.out.print("Input marks of Computer : ");
		iComputer = kb.nextInt();
		
		iTotal = iPhysics + iChemistry + iBiology + iMathematics + iComputer;
		
		iPercent = iTotal / 5;
		
		System.out.println("The marks percentage is : " + iPercent);
		
		if(iPercent>=90){
			System.out.println("The Grade is A");
		} else if(iPercent>=80) {
			System.out.println("The Grade is B");
		} else if(iPercent>=70) {
			System.out.println("The Grade is C");
		} else if(iPercent>=60) {
			System.out.println("The Grade is D");
		} else if(iPercent>=40) {
			System.out.println("The Grade is E");
		} else {
			System.out.println("The Grade is F");
		}
		
		kb.close();
	}
}
