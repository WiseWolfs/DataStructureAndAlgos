package com.wy.datastructure.queue;

public class Main {
	public static void main(String[] args) {
		Queue q  = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
