package net.prime_number;

import java.util.Scanner;

public class Baekjoon_1978 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int divided = 0; 
		int primeCount = 0;
		
		for(int i = 1; i <= n; i++) {
			int input = s.nextInt();
			divided = 0;
			
			for(int j = 1; j <= input; j++)
				if(input % j == 0)
					++divided;
			
			if(divided == 2) ++primeCount;
		}
		System.out.println(primeCount);
	}

}
