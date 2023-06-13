package Activity_1;

//Project  : Activity_1
//Question : 6
//Author   : BAO, Qingjun
//Date     : 2023/06/07

//6. Write a Java program to print an American flag on the screen. Expected Output
//* * * * * * ==================================
//* * * * *  ==================================
//* * * * * * ==================================
//* * * * *  ==================================
//* * * * * * ==================================
//* * * * *  ==================================
//* * * * * * ==================================
//* * * * *  ==================================
//* * * * * * ==================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================


public class Q_6_2 {
	public static void main(String[] args){
//		Version 2: Using for loop to control the output strings.
		
//		To define the pattern
		String star = "* ";
		String stripe = "=";
		
//		To define the flag size
		int flagLength = 46;
		int flagHeight = 15;
		int starLength = 6;
		int starHeight = 9;
		
//		To print the flag upper part
		for(int i=0; i<starHeight; i++) {
//			To print stars with one space start and one space end
			if(i%2==1) {System.out.print(" ");}
			for(int j=0; j<starLength-i%2;j++) {
				System.out.print(star);
			}
			if(i%2==1) {System.out.print(" ");}
			
//			To print strips at right part
			for(int k=0; k<flagLength-starLength*2; k++) {
				System.out.print(stripe);
			}
			System.out.println();
		}
		
//		To print the flag lower part
		for(int m=0; m<flagHeight-starHeight; m++) {
			for(int n=0; n<flagLength; n++) {
				System.out.print(stripe);
			}
			System.out.println();
		}
		
	}
}

