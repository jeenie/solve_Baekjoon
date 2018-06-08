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
		// 수열(sequence)에서 사용할 인덱스 변수
		int index = 0;

		//입력 받을 수열의 크기
		int n = s.nextInt();
		//수열
		int[] sequence = new int[n];

		// ㅣoop1 : 수열을 입력받음
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

		//불가능한 수열일 경우
		if(!stack.isEmpty())
			System.out.println("NO");
		else
			// loop3 : 연산 과정 출력 -> 얻고자 하는 결과
			for(int i = 0; i < sign.size(); i++)
				System.out.println(sign.get(i));
	}
}
