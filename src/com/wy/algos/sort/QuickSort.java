package com.wy.algos.sort;

/**
 * ¿ìËÙÅÅÐò
 * 
 * @author Administrator
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int num[] = {7,6,5,4,4,3,2,1 };
		new QuickSort().sort(num, 0, num.length-1);
		for (int n : num) {
			System.out.print(n + " ");
		}
	}

	void sort(int num[], int left, int right) {
		if (left <right) {
			int index = partition(num, left, right);
			sort(num, left, index-1);
			sort(num, index, right);
		}

	}

	public int partition(int[] num, int left, int right) {
		if(num==null || num.length<=0 || left<0 || right>=num.length){
			return 0;
		}
		int prio = num[left + (right - left) / 2];
		// left +(right - left) / 2  == > (right +left) / 2 相等
		while(left<=right){
			while (num[left] < prio) // 如果在中间位置 和 中间加一的位置 值相等，会死循环 比如：{16, 12, 10, 19, 19, 7, 18, 6}
				left++;
			while (num[right] > prio)
				right--;
			if (left<=right) {
				swap(num, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public void swap(int[] num, int left, int right) {
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
	}
}
