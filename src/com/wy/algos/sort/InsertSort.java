package com.wy.algos.sort;

public class InsertSort {
	public static void main(String[] args) {
		int num[] = { 3, 1, 5, 4, 123, 55, 33, 123 };
		new InsertSort().sort(num);
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
	void sort(int num[]){
		for(int i=1;i<num.length;i++){
			for(int j=i;j>0 && Utils.less(num[j],num[j-1]);j--){
				Utils.exec(num, j, j-1);
			}
		}
	}

}
