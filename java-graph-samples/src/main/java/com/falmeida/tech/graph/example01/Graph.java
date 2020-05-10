package com.falmeida.tech.graph.example01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph<T> {
	
	private Map<T,List<T>> graph = new HashMap<>();
	
	public void addVertex(T s) { 
        graph.put(s, new LinkedList<T>()); 
    } 
	
	public void addEdge(T source, T destination, boolean bidirectional){ 
		
		if (!graph.containsKey(source)) addVertex(source); 
		
		if (!graph.containsKey(destination)) addVertex(destination); 
		
		graph.get(source).add(destination); 
		
		if (bidirectional == true) { 
			graph.get(destination).add(source); 
		} 
		
	} 
	
    public void getVertexCount(){ 
        System.out.println("The graph has " + graph.keySet().size() + " vertex"); 
    } 
  
    public void getEdgesCount(boolean bidirection){ 
        int count = 0; 
        for (T v : graph.keySet()) { 
            count += graph.get(v).size(); 
        } 
        if (bidirection == true) { 
            count = count / 2; 
        } 
        System.out.println("The graph has " + count + " edges."); 
    } 
  
    public void hasVertex(T s){ 
        if (graph.containsKey(s)) { 
            System.out.println("The graph contains " + s + " as a vertex."); 
        } 
        else { 
            System.out.println("The graph does not contain " + s + " as a vertex."); 
        } 
    } 
  
    public void hasEdge(T s, T d){ 
    	
        if (graph.get(s).contains(d)) { 
            System.out.println("The graph has an edge between " + s + " and " + d + "."); 
        } 
        else { 
            System.out.println("The graph has no edge between " + s + " and " + d + "."); 
        } 
    } 
  
    @Override
    public String toString(){ 
        StringBuilder builder = new StringBuilder(); 
  
        for (T v : graph.keySet()) { 
            builder.append(v.toString() + ": "); 
            for (T w : graph.get(v)) { 
                builder.append(w.toString() + " "); 
            } 
            builder.append("\n"); 
        } 
  
        return (builder.toString()); 
    } 

}
