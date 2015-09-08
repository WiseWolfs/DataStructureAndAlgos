package com.wy.datastructure.list;

public class Main {
	static SingleDirList sdl = new SingleDirList<>();
	static{
		for(int i=1;i<=10000;i++){
			sdl.appendToTail(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("\n1th........");
		long start1 = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			findKthToTail2(1);
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
		System.out.println("\n2th........");
		long start2 = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			findKthToTail1(1);
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
	}
	public static void findKthToTail2(int k) {
		int count =0;
		Node pAhead = sdl.head;
		while(pAhead!=null){
			pAhead= pAhead.next;
			count++;
		}
		Node pBhead = sdl.head;
		for(int i=0;i<count-k;i++){
			pBhead = pBhead.next;
		}
		//System.out.println(pBhead.data);
		
	}
	public static void findKthToTail1(int k) {
		Node pAhead = sdl.head;
		Node pBhead =null;
		for(int i=0;i<k-1;++i){
			pAhead = pAhead.next;
		}
		pBhead = sdl.head;
		while(pAhead.next!=null){
			pAhead = pAhead.next;
			pBhead = pBhead.next;
		}
		//System.out.println(pBhead.data);
	}

}
