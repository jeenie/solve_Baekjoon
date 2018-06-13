package net.if_else;

import java.util.Scanner;

public class Baekjoon_10871 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = s.nextInt();
		for(int i = 0; i < n; i++)
			if(a[i] < x)
				System.out.print(a[i] + " ");
		
	}

}
