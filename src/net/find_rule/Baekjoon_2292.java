package net.find_rule;

import java.util.Scanner;

//2292�� ����
public class Baekjoon_2292 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		//��� �� -> ���ϰ��� �ϴ� ��
		int path = 1;
		//���� ����� ��� �� �ִ밪 (ex. 1, 7, 19, ...)
		int room = 1;
		int add = 6;
		
		while(true) {
			if(n <= room) break;
			room += add;
			add += 6;
			path++;
		}
		System.out.println(path);
	}
}
