package Activity_2;

import java.util.Random;

//Project  : Activity_2
//Filename : Q_7.java
//Question : 7
//Author   : BAO, Qingjun
//Date     : 2023/06/08

//7.Generate 10 random number between 1 to 22.


public class Q_7 {
	public static void main(String[] args){
		long  t = System.currentTimeMillis();
		Random rand = new Random(t);
		System.out.println("Generate 10 random numbers between 1 to 22.");
		for(int i=0; i<10; i++) {
			int iRand = rand.nextInt(22)+1;
			System.out.println(iRand);
		}
		
	}
}
