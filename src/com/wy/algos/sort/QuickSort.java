package com.wy.algos.sort;

/**
 * 快速排序
 * 
 * @author Administrator
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int num[] = { 3, 1, 5, 4, 123, 55, 33, 123 };
		new QuickSort().sort(num, 0, 7);
		for (int n : num) {
			System.out.print(n + " ");
		}
	}

	void sort(int num[], int left, int right) {
		if (left <right) {
			int index = partition(num, left, right);
			sort(num, left, index - 1);
			sort(num, index+1, right);//TODO index+1就会出错
		}

	}

	public int partition(int[] num, int left, int right) {
		int prio = num[left + (right - left) / 2];
		while (num[left] < prio)
			left++;
		while (num[right] > prio)
			right--;
		if (left<right) {
			swap(num, left, right);
			left++;
			right--;
		}
		return left;
	}

	public void swap(int[] num, int left, int right) {
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
	}
}
