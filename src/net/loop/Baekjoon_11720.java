package net.loop;

import java.util.Scanner;

public class Baekjoon_11720 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String input = s.next();
		
		int sum = 0;
		for(int i = 0; i < n; ++i)
			sum += Integer.parseInt(input.substring(i, i+1));
		System.out.println(sum);
	}

}
