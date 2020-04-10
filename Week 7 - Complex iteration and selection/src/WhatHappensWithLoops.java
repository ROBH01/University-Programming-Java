
public class WhatHappensWithLoops {

	public static void main(String[] args) {
		//		int count = 1;
		//		while (count != 50)
		//		{
		//			count = count+2;
		//			System.out.println(count); 
		//		}

		// It did not work because the count started from 1.
		// by starting from 1 it will increase by 2 every time: 1+2=3; 5; 7; 9; and so on until....47;49;51.
		// as the count is never an even number, it jumps directly to 51, and continues to loop forever.
		// in conclusion, if the count has an odd number, it will always loop forever.

		///////////////////////////////////////////////////////////////////////////////////////////////////////////		

		double num = 1.0;
		while (num != 0.0) {
			num = num - 0.1;
			System.out.println(num);
		}
	}
}