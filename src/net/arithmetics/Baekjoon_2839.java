package net.arithmetics;

import java.util.Scanner;

public class Baekjoon_2839 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int suger = s.nextInt();
		int count = suger / 5;
		
		switch (suger % 5) {
		case 0: 
			break;
		case 1:
		case 3:
			++count;
			break;
		case 2:
			if(count < 2)
				count = -1;
			else
				count += 2;
			break;
		case 4:
			if(count < 1)
				count = -1;
			else
				count += 2;
			break;
		}
		System.out.println(count);
	}
}
