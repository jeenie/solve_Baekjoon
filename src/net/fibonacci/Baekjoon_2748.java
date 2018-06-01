package net.fibonacci;

import java.util.Scanner;

public class Baekjoon_2748 {
	static long[] a = new long[100];

	static long fibonacci(int n) {
		if (a[n] != 0) return a[n];
		if (n == 1 || n == 2) a[n] = 1;
		else
			a[n] = fibonacci(n - 1) + fibonacci(n - 2);
		return a[n];
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
			
		System.out.println(fibonacci(n));
	}

}
