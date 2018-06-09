package net.loop;

import java.util.Scanner;

public class Baekjoon_2739 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i = 1; i <= 9; i++)
            System.out.printf("%d * %d = %d ", n, i, n*i);
	}

}
