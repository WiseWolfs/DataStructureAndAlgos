package com.wy.algos.sort;
/**
 * 三向切分的快速排序
 * @author Administrator
 *
 */
public class Quick3way {
	public static void main(String[] args) {
		int num[] = { 3, 1, 5, 4, 123, 55, 33, 123 };
		new MergeSort().sort(num, 0, 7);
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
	void sort(int num[],int low,int high){
		if(high<=low)return ;
		int lt=low,i=low+1,gt=high;
		int v = num[low];
		while(i<=gt){
			if(num[i]<v){
				Utils.exec(num, lt++, i++);
			}else if(num[i]>v){
				Utils.exec(num, i, gt--);
			}else{
				i++;
			}
		}
		sort(num,low,lt-1);
		sort(num,gt+1,high);
		
	}

}
