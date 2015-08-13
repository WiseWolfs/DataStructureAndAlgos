package com.wy.datastructure.tree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 普通二叉树
 * @author Administrator
 *
 */
public class BinaryTree {
	private Scanner in = new Scanner(System.in);
	void preOrder(Node root){
		if(root==null)
			return ;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	/**
	 * 前序遍历的非递归形式：
	 * 思路：
	 * 对于任一节点P，
1）输出节点P，然后将其入栈，再看P的左孩子是否为空；
2）若P的左孩子不为空，则置P的左孩子为当前节点，重复1）的操作；
3）若P的左孩子为空，则将栈顶节点出栈，但不输出，并将出栈节点的右孩子置为当前节点，看其是否为空；
4）若不为空，则循环至1）操作；
5）如果为空，则继续出栈，但不输出，同时将出栈节点的右孩子置为当前节点，看其是否为空，重复4）和5）操作；
6）直到当前节点P为NULL并且栈空，遍历结束。
	 * @param root
	 */
	void preOrder2(Node root){
		Stack<Node> stack = new Stack<>();
		Node n = root;
		while(n!=null || !stack.isEmpty()){
			while(n!=null){
				System.out.print(n.data+" ");
				stack.push(n);
				n = n.left;
			}
			if(!stack.isEmpty()){
				n = stack.peek();
				stack.push(n);
				n = n.right;
			}
		}
	}
	/**
	 *  	根据中序遍历的顺序，对于任一结点，优先访问其左孩子，而左孩子结点又可以看做一根结点，然后继续访问其左孩子结点，直到遇到左孩子结点为空的结点才进行访问，然后按相同的规则访问其右子树。因此其处理过程如下：
	 *
   	 *		对于任一结点P，
   	 *
  			1)若其左孩子不为空，则将P入栈并将P的左孩子置为当前的P，然后对当前结点P再进行相同的处理；

  			2)若其左孩子为空，则取栈顶元素并进行出栈操作，访问该栈顶结点，然后将当前的P置为栈顶结点的右孩子；

  			3)直到P为NULL并且栈为空则遍历结束
	 * @param root
	 */
	void inOrder2(Node root){
		Stack<Node> stack = new Stack<>();
		Node n = root;
		while(n!=null || !stack.isEmpty()){
			while(n!=null){
				stack.push(n);
				n=n.left;
			}
			if(!stack.isEmpty()){
				n = stack.peek();
				System.out.print(n.data+" ");
				stack.pop();
				n = n.right;
			}
		}
	}
	void BFS(Node root){
		if(root==null)return ;
		LinkedList<Node> list= new LinkedList<>();
		list.add(root);
		print(root);
		while(!list.isEmpty()){
			Node n = list.remove();
			if(n.left!=null){
				print(n.left);
				list.add(n.left);
			}
			if(n.right!=null){
				print(n.right);
				list.add(n.right);
			}
		}
	}
	void DFS(Node root){
		if(root==null)
			return ;
		print(root);
		if(root.left!=null){
			DFS(root.left);
		}
		if(root.right!=null){
			DFS(root.right);
		}
	}
	private void print(Node root) {
		System.out.print(root.data+" ");
	}
	Node build(Node root){
		if(root==null)
			root = new Node();
		if((root.data = in.nextInt())==-1)
			return null;
		root.left=build(root.left);
		root.right=build(root.right);
		return root;
	}
	

}
class Node{
	Node left;
	Node right;
	int data;
	public Node(){}
	public Node(int d){
		left = null;
		right= null;
		data = d;
	}
}