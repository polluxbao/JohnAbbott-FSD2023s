package Activity_6;

//Project  : Activity_6
//Filename : Question_5.java
//Question : 5
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//5. Write a Java program to copy an array by iterating the array.

public class Question_5 {
	
	public static void main(String[] args){
		double[] array = new double[] {12,23,24,15,4,9,24,6};
		double[] newArray = new double[array.length];
		
		System.out.println("To copy an array by iterating the array.");
		for(int i=0;i<array.length;i++) {
			newArray[i] = array[i];
		}
		
		System.out.println("The original array :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");			
		}
		
		System.out.println();
		System.out.println("The new array copied :");
		for(int i=0;i<array.length;i++) {
			System.out.print(newArray[i] + "  ");			
		}
		
	
	}
}
