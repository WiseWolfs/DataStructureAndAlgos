package com.wy.algos.sort;


import java.util.LinkedList;
/**1344
 *
 * ge:1344%10=1344/1%10
 * shi:1344/10%10
 * bai:1344/100%10
 * @author Administrator
 *
 */
public class RadixSort {
	public static void main(String[] args) {
		int array[]={3,5,9,6,130,20,30,10,44,0};
		new RadixSort().sort(array);
		for(int a:array)
			System.out.print(a+" ");
	}
	void sort(int []array){
		//1.确定排序的趟数
		int max = findMax(array);
		int time = 0;
		while(max>0){
			max/=10;
			time++;
		}
		//2.建立10个队列
		LinkedList<Integer> queue[]=new LinkedList[10];
		for(int i=0;i<10;i++){
			queue[i]=new LinkedList<>();
		}
		//3.进行time次分配和收集
		for(int i=0;i<time;i++){
			//3.1分配数组元素
			for(int j=0;j<array.length;j++){
				//queue[array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i)].add(array[j]);
				queue[array[j]/(int)Math.pow(10, i)%10].add(array[j]);
			}
			//3.2收集队列元素
			int count = 0;
			for(int k=0;k<10;k++){
				while(!queue[k].isEmpty()){
					array[count++]=queue[k].remove();
				}
			}
		}
	}

	public int findMax(int[] array) {
		int max = 0;
		for(int j=0;j<array.length;j++){
			if(array[j]>array[max]){
				max = j;
			}
		}
		return array[max];
	}
	
}
