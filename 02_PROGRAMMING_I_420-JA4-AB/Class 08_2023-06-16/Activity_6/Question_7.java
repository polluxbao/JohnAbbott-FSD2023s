package Activity_6;


//Project  : Activity_6
//Filename : Question_7.java
//Question : 7
//Author   : BAO, Qingjun
//Date     : 2023/06/18

//7. Write a Java program to find the maximum and minimum value of an array.

public class Question_7 {
	public static double[] getMaxMinArray(double[] dArray) {
		int iLength=dArray.length;
		double dMin, dMax;
		dMin = dMax = dArray[0];
		for(int i=1; i<iLength; i++) {
			if(dArray[i]>dMax) dMax=dArray[i];
			if(dArray[i]<dMin) dMin=dArray[i];
		}
		double[] m = {dMax, dMin};
		
		return m;
	}
	
	
	public static void main(String[] args){

		double[] array = new double[] {12,23,24,15,4,9,24,6};
		double[] maxmin;
		System.out.println("To find the maximum and minimum value of an array.");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");			
		}
		System.out.println();
		
		maxmin = getMaxMinArray(array);
		
		System.out.println("The maximum value of an array is " + maxmin[0]);
		System.out.println("The minimum value of an array is " + maxmin[1]);
		
	}
}
