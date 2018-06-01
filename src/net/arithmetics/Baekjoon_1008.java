package net.arithmetics;

import java.util.Scanner;

public class Baekjoon_1008 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.printf("%.9f", (double)a/b);
	}
}
