package Activity_4;
import java.util.Scanner;

//Project  : Activity_4
//Filename : Question_3.java
//Question : 3
//Author   : BAO, Qingjun
//Date     : 2023/06/14

//Questions 3:
//A school has following rules for grading system: 
//	a. Below 25 - F 
//	b. 25 to 45 - E 
//	c. 45 to 50 - D 
//	d. 50 to 60 - C 
//	e. 60 to 80 - B 
//	f. Above 80 - A 
//print the corresponding grade base of variable, Which you get from users.

public class Question_3 {
	
	public static String grade(int iScore) {
		String sGrade;
		if(iScore < 25) {
			sGrade = "F";
		} else if(iScore < 45) {
			sGrade = "E";
		} else if(iScore < 50){
			sGrade = "D";
		} else if(iScore < 60){
			sGrade = "C";
		} else if(iScore < 80){
			sGrade = "B";
		} else {
			sGrade = "A";			
		}
		
		return sGrade;
	}
	

	public static void main(String[] args){
		int score;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a score : ");
		score = kb.nextInt();

		System.out.println("The grade is " + grade(score));
		
		kb.close();
	}
}
