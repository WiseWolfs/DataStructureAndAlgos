package com.wy.algos.search;
/**
 * 二分查找法 递归形式
 * @author Administrator
 *
 */
public class BinarySearchWithRecursion {
	int search(int num[],int low,int high,int key){
		if(low<=high){
			int mid = low+(high-low)/2;
			if(num[mid]<key){
				return search(num,mid+1,high,key);
			}else if(num[mid]>key){
				return search(num, low, high-1,key);
			}else{
				return mid;
			}
		}
		return low;
	}

}
