package net.loop;

import java.util.Scanner;

public class Baekjoon_1924 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int time = -1;
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		for (int i = 0; i < x - 1; i++) 
			time += months[i];
		time += y;
		System.out.println(days[time % 7]);
	}

}
