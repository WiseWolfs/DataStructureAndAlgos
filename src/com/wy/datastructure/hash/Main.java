package com.wy.datastructure.hash;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "wuyong");
		map.put(2, null);
		map.put(1, null);
		System.out.println(map.size());
	}

}
