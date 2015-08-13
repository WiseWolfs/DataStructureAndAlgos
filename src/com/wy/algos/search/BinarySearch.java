package com.wy.algos.search;
/**
 * ∑«µ›πÈ–Œ Ω
 * @author Administrator
 *
 */
public class BinarySearch {
	int search(int num[],int key){
		int low = 0;
		int high = num.length-1;
		while(low<=high){
			int mid = low + (high-low)/2;
			if(num[mid]<key){
				low=mid+1;
			}
			else if(num[mid]>key){
				high = mid-1;
			}
			else{
				return mid;
			}
		}
		return low;
	}
}
