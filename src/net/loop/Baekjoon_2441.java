package net.loop;

import java.util.Scanner;

public class Baekjoon_2441 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for(int i = n; i >= 1; i--) {
			for(int j = n; j>0; j--) {
				if(i < j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
