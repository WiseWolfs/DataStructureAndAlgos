package com.wy.datastructure.graph;

import java.util.ArrayList;

public class Graph {
	private int V;
	private int E;
	private ArrayList[]adj;
	private static boolean marked[];
	public ArrayList getAdj(int v){
		return adj[v];
	}
	public Graph(int V){
		this.V = V;
		adj = new ArrayList[V];
		marked=new boolean[V];
		for(int v=0;v<V;v++)
			adj[v] = new ArrayList<>();
	}
	public void addEdge(int u,int v){
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}

}
