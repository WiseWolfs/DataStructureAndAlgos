package com.wy.algos.sort;
/**
 * √∞≈›∑®≈≈–Ú
 * @author Administrator
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int num[] = {7,3,5,4,1123,6,8,5};
		new BubbleSort().sort(num);
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
	void sort(int num[]){
		int Length= num.length;
		for(int i=0;i<Length-1;i++){
			for(int j=0;j<Length-i-1;j++){
				if(num[j]>num[j+1]){
					Utils.exec(num, j, j+1);
				}
			}
		}
	}

}
