package com.wy.datastructure.hash;

/**
 * 基于链表法的哈希表
 * 
 * @author Administrator
 *
 */
public class HashTable<Key,Value> {
	private int M;//数组的长度
	private SequentialList<Key,Value> st[];
	public HashTable(){
		this(997);
	}
	public HashTable(int M){
		this.M =  M;
		st = new SequentialList[M];
		for(int i=0;i<M;i++){
			st[i] = new SequentialList();
		}
	}
	public int hash(Key key){
		return (key.hashCode() & 0x7fffffff) % M;
		
	}
	public Value get(Key key){
		return st[hash(key)].get(key);
	}
	public void put(Key key,Value val){
		st[hash(key)].put(key, val);
	}
}

class SequentialList<Key, Value> {
	Node first;

	private class Node {
		Key key;
		Value val;
		Node next;
		public Node(Key key, Value val, Node next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}


	public void put(Key key, Value val) {
			for (Node n = first; n != null; n = n.next) {
				if (n.key.equals(key)) {
					n.val = val;
					return ;
				}
			}
			first = new Node(key,val,first);
	}

	public Value get( Key key) {
			for (Node n = first; n != null; n = n.next) {
				if (n.key.equals(key)) {
					return n.val;
				}
			}
		return null;
	}

}
