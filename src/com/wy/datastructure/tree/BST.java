package com.wy.datastructure.tree;
/**
 * ¶ş²é²éÕÒÊ÷
 * @author Administrator
 *
 */
public class BST<Key extends Comparable<Key>,Value> {
	Node root;
	private Node put(Node x,Key key,Value val){
		if(x==null)
			return new Node(key,val,1);
		int cmp = x.key.compareTo(key);
		if(cmp>0)
			x.left= put(x.left,key,val);
		else if(cmp<0)
			x.right =put(x.right,key,val);
		else
			x.value = val;
		x.N= size(x.left)+size(x.right)+1;
		return x;
	}
	public void put(Key key,Value val){
		root = put(root,key,val);
	}
	public Value get(Key key){
		return get(root,key);
	}
	private Value get(Node x,Key k){
		if(x==null)
			return null;
		int cmp = x.key.compareTo(k);
		if(cmp>0)
			return get(x.left,k);
		else if(cmp<0)
			return get(x.right,k);
		else
			return x.value;
	}
	public int size(){
		return size(root);
	}
	private int size(Node root){
		if(root==null)
			return 0;
		else
			return root.N;
	}
	private class Node{
		Key key;
		Value value;
		Node left,right;
		int N;
		public Node(Key key,Value val,int N){
			this.key = key;
			this.value = val;
			this.N =N;
		}
	}
}
