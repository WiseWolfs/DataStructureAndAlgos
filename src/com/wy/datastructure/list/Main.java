package com.wy.datastructure.list;

public class Main {
	public static void main(String[] args) {
		Node h = null;
		SingleDirList<Integer> sdl = new SingleDirList<>(h);
	/*	sdl.appendToTail(1);
		sdl.appendToTail(2);
		sdl.appendToTail(3);*/
		sdl.deleteNode(0);
		sdl.travel();
	}

}
