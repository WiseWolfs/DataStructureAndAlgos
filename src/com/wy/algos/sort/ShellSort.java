package com.wy.algos.sort;

public class ShellSort {
	public static void main(String[] args) {
		int num[] = { 3, 1, 5, 4, 123, 55, 33, 123 };
		new ShellSort().sort(num);
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
	void sort(int num[]){
		int N = num.length;
		int h = 1;
		while(h<N/3) h = 3*h+1;
		while(h>=1){
			for(int i=h;i<N;i++){
				for(int j=i; j >= h  && Utils.less(num[j], num[j-h]);j-=h){
					Utils.exec(num, j, j-h);
				}
			}
			h = h/3;
		}
	}

}
