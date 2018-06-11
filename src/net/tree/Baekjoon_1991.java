package net.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1991 {
	static class Node {
		char value;
		Node left;
		Node right;
		
		public Node(char value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
		
		public void add(char left, char right) {
			
			if(left != '.') this.left = new Node(left);
			if(right != '.') this.right = new Node(right);
		}
		
		public void preorder() {
			System.out.printf("%s", value);
			if(left != null) left.preorder();
			if(right != null) right.preorder();
		}
		
		public void inorder() {
			if(left != null) left.inorder();
			System.out.printf("%s", value);
			if(right != null) right.inorder();
		}
		
		public void postorder() {
			if(left != null) left.postorder();
			if(right != null) right.postorder();
			System.out.printf("%s", value);
		}
	}
	
	static class BinaryTree {
		Node root;
		
		public void add(char value, char left, char right) {
			if(root ==null) {
				if(value != '.') root = new Node(value);
				if(left != '.') root.left = new Node(left);
				if(right != '.') root.right = new Node(right);
			} else {
				search(root.left, value, left, right);
				search(root.right, value, left, right);
			}
		}
		
		private void search(Node root, char value, char left, char right) {
			if(root == null) return;
			else if(root.value == value) {
				root.add(left, right);
			} else {
				search(root.left, value, left, right);
				search(root.right, value, left, right);
			}
				
		}
		
		public void preorder() {
			if(root != null) root.preorder();
		}
		public void inorder() {
			if(root != null) root.inorder();
		}
		public void postorder() {
			if(root != null) root.postorder();
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		BinaryTree tree = new BinaryTree();
		
		char[] data;
		for(int i = 1; i <= count; i++) {
			data = br.readLine().replaceAll(" ", "").toCharArray();
			tree.add(data[0], data[1], data[2]);
		}
		tree.preorder();
		System.out.println();
		tree.inorder();
		System.out.println();
		tree.postorder();
		System.out.println();
	}
}
