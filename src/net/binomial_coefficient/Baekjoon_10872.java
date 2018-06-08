package net.binomial_coefficient;

import java.util.Scanner;

public class Baekjoon_10872 {

	public static int factorial(int n) {
		int result = 1;
		for (int i = n; i >= 1; i--)
			result *= i;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		System.out.println(factorial(n));
	}

}
