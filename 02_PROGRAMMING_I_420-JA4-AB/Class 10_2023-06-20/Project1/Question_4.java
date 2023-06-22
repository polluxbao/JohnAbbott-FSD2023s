package Project1;

import java.util.Scanner;

//Project  : Project6
//Filename : Question_4.java
//Question : 4
//Author   : BAO, Qingjun
//Date     : 2023/06/20

//Question 4: 
//
//Write the method to get the array and sort it. (Don't use any library).


public class Question_4 {
	public static int[] getArraySort(boolean ascending) {
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = kb.nextInt();
		int[] arr = new int[n];
		int num;
		for(int i=0; i<n; i++) {
			System.out.print("Index "+(i+1)+" : ");
			num = kb.nextInt();
			arr[i] = num;
		}
		
		// Sort the array.
		
		for(int i=0; i<n-1; i++) {
			for(int j=i;j<n; j++) {
				if(ascending) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				} else {
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		
		
		kb.close();
		return arr;
	}
	
	public static void main(String[] args){
		int[] array = getArraySort(true);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");
		}
	}
}
