package com.falmeida.tech;

//Tree Node
public class Node {
	
    int key; 
    
    Node left, right; 
  
    public Node(int key) { 
        this.key = key; 
        left = right = null; 
    }

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	} 
    
} 
