package net.find_rule;

import java.util.Scanner;

//2292번 벌집
public class Baekjoon_2292 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		//경로 수 -> 구하고자 하는 값
		int path = 1;
		//같은 경로인 방들 중 최대값 (ex. 1, 7, 19, ...)
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
