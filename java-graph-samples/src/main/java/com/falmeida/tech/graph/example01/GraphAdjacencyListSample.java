package com.falmeida.tech.graph.example01;

import java.util.ArrayList;

public class GraphAdjacencyListSample {

	public static void main(String[] args) {
		
		Graph graph = new Graph();
		graph.addGraphEdge(0, 1);
		graph.addGraphEdge(0, 4);
		graph.addGraphEdge(1, 2);
		graph.addGraphEdge(1, 3);
		graph.addGraphEdge(1, 4);
		graph.addGraphEdge(2, 3);
		graph.addGraphEdge(3, 4);
		
		graph.printGraph();
	}
	
	static class Graph{
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		int nodes = 5;
		
		public Graph() {
			initializeGraph();
		}
		
		public void initializeGraph() {
			
			for (int i = 0; i < nodes; i++) {
				graph.add(new ArrayList<>());
			}
			
		}
		
		public void addGraphEdge(int v, int u) {
			graph.get(v).add(u);
			graph.get(u).add(v);
		}
		
		public void printGraph() {
			
			for (int i = 0; i < graph.size(); i++) {
				//System.out.println("Adjacency List of Vertex: " + i);
				System.out.print("head "+i);
				for (int j = 0; j < graph.get(i).size(); j++) {
					System.out.print(" -> " + graph.get(i).get(j));
				}
				System.out.println();
			}
			
		}
		
	}
	
}


