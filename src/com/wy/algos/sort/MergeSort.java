package com.wy.algos.sort;

public class MergeSort {
	public static void main(String[] args) {
		int num[] = { 3, 1, 5, 4, 123, 55, 33, 123 };
		new MergeSort().sort(num, 0, 7);
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
	void sort(int num[],int low,int high){
		if(low<high){
			int mid = low+(high-low)/2;
			sort(num,low,mid);//TODO mid-1就不行了
			sort(num,mid+1,high);
			merge(num,low,mid,high);
		}
		
	}

	public void merge(int[] num, int low, int mid, int high) {
		int copyNum[]=new int[num.length];
		for(int i=0;i<=high;i++){
			copyNum[i] = num[i];
		}
		int left = low;
		int right = mid+1;
		int current = low;
		while(left<=mid && right<=high){
			if(copyNum[left]<copyNum[right]){
				num[current++]=copyNum[left];
				left++;
			}else{
				num[current++]=copyNum[right];
				right++;
			}
		}
		int remaining = mid-left;
		for(int i=0;i<=remaining;i++){
			num[current+i]=copyNum[left+i];
		}
	}

}
