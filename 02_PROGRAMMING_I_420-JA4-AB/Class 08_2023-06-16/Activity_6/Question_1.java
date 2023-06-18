package Activity_6;

//Project  : Activity_6
//Filename : Question_1.java
//Question : 1
//Author   : BAO, Qingjun
//Date     : 2023/06/15

//1. Write a Java program to calculate the average value of array elements.


public class Question_1 {
	public static double average(double[] dArray) {
		int iLength=dArray.length;
		double dSum=0;
		for(int i=0;i<iLength;i++) {
			dSum += dArray[i];
		}
		return dSum/iLength;
	}
	
	public static void main(String[] args){
		double[] array = new double[] {1,2,3,5,4};
		
		System.out.println("The average value of array element is "+ average(array));

	
	}
}
