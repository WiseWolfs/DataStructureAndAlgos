package com.wy.algos.sort;

public class Utils {

	public static void exec(int[] num, int i, int min) {
		int temp = num[i];
		num[i] = num[min];
		num[min]= temp;
	}

	public static boolean less(int i, int j) {
		return i < j ? true : false;
	}
	

}
