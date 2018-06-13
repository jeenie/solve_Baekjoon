package net.if_else;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10817 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[3];
		
		for(int i = 0; i < a.length; i++) 
			a[i] = s.nextInt();
		
		Arrays.sort(a);
		System.out.println(a[1]);
	}

}
