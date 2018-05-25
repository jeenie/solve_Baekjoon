package net.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1427 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int size = s.length();
		char[] a = new char[size];
		
		for(int i = 0; i < a.length; i++) 
			a[i] = s.charAt(i);
		
		Arrays.sort(a);
		for(int i = a.length - 1 ; i >= 0 ; i--)
			System.out.print(a[i]);
	}

}
