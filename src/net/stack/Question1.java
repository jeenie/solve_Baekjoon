package net.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Stack {
	LinkedList<Integer> stack = new LinkedList<Integer>();
	
	void push(int n) {
		stack.push(n);
	}
	
	int pop() {
		if(stack.isEmpty()) return -1;
		return stack.poll();
	}
	
	int size() {
		return stack.size();
	}
	
	int empty() {
		if(stack.isEmpty()) return 1;
		return 0;
	}
	
	int top() {
		if(stack.isEmpty()) return -1;
		return stack.peek();
	}
}

public class Question1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//명령어의 수 (입력)
		int n = input.nextInt();
		Stack stack = new Stack();
		
		for(int i = 0; i < n; i++) {
			String s = input.next();
			String[] command = s.split(" ");
			
			switch (command[0]) {
			case "push":
				int v = input.nextInt();
				stack.push(v);
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.empty());
				break;
			case "top":
				System.out.println(stack.top());
				break;
			}
		}
	}

}
