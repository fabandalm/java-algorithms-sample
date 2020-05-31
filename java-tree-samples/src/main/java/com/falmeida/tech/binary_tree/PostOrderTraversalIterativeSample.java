package com.falmeida.tech.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalIterativeSample {
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		System.out.println(postorderTraversal(root));
		
	}

	static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      
	}
	
	public static List<Integer> postorderTraversal(TreeNode treeNode){
		
		List<Integer> values = new ArrayList<>();
		
		if(treeNode == null) return values;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(treeNode);
		while(!stack.isEmpty()) {
			TreeNode current = stack.pop();
			values.add(0,current.val);
			if(current.left != null) {
				stack.push(current.left);
			}
			if(current.right != null) {
				stack.push(current.right);
			}
		}
		
		return values;
		
	}
	
}


