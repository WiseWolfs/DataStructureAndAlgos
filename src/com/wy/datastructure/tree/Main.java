package com.wy.datastructure.tree;

import org.junit.Test;

public class Main {
	@Test
	public void testBinaryTree() throws Exception {
		BinaryTree tree = new BinaryTree();
		Node root = null;
		root = tree.build(root);
		System.out.println("preOrder------");
		tree.preOrder2(root);
		System.out.println("\nDFS-----");
		tree.DFS(root);
		System.out.println("\nBFS-----");
		tree.BFS(root);
	}
}
