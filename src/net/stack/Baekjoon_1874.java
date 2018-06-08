package net.stack;

import java.util.ArrayList;
import java.util.Scanner;

class MyStack {
	Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		Node first = new Node(data);

		if(isEmpty()) 
			top = first;
		else {
			Node tmp = top;
			first.link = tmp;
			top = first;
		}
	}

	public int pop() {
		Node remove = top;
		if (isEmpty())
			return -1;
		top = remove.link;
		return remove.data;
	}

	public int peek() {
		if(isEmpty())
			return -1;
		else return top.data;
	}

	private class Node {
		int data;
		Node link;

		public Node(int number) {
			this.data = number;
			this.link = null;
		}
	}
}

public class Baekjoon_1874 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		MyStack stack = new MyStack();
		ArrayList sign = new ArrayList();
		// ����(sequence)���� ����� �ε��� ����
		int index = 0;

		//�Է� ���� ������ ũ��
		int n = s.nextInt();
		//����
		int[] sequence = new int[n];

		// ��oop1 : ������ �Է¹���
		for(int i = 0; i < n; i++)
			sequence[i] = s.nextInt();

		// *loop2
		for(int i = 1; i <= n; i++) {
			stack.push(i);
			sign.add('+');
			while (!stack.isEmpty() && sequence[index] == (int)stack.peek()) {
				index++;
				stack.pop();
				sign.add('-');
			}
		}

		//�Ұ����� ������ ���
		if(!stack.isEmpty())
			System.out.println("NO");
		else
			// loop3 : ���� ���� ��� -> ����� �ϴ� ���
			for(int i = 0; i < sign.size(); i++)
				System.out.println(sign.get(i));
	}
}
