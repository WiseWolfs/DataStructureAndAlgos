package com.wy.datastructure.list;

/**
 * µ•œÚ¡¥±Ì
 * 
 * @author Administrator
 *
 */
public class SingleDirList<T> {
	Node<T> head;

	public SingleDirList(Node<T> h) {
		head = h;
	}

	void travel() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	void deleteNode(T d) {
		if (head == null)
			return;
		if (head.data.equals(d)) {
			head = head.next;
		}
		Node n = head;
		while(n.next!=null){
			if (n.next.data.equals(d)){
				n.next = n.next.next;
				break;
			}
			n = n.next;
		}
	}

	void appendToTail(T d) {
		Node node = new Node(d);
		if (head == null)
			head = node;
		else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
}

class Node<T> {
	T data;
	Node<T> next;

	public Node(T d) {
		data = d;
	}
}
