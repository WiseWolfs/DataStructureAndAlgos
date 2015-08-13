package com.wy.datastructure.queue;

public class Queue {
	Node rear,front;
	void enqueue(int d){
		Node node =new Node(d);
		if(rear==null){
			rear = node;
			front =rear;
		}else{
			rear.next = node;
			rear=rear.next;
		}
	}
	int dequeue(){
		if(front==null)
			return -1;
		int data = front.data;
		front=front.next;
		return data;
	}

}
class Node{
	int data;
	Node next;
	public Node(int d){
		next = null;
		data =d;
	}
}
