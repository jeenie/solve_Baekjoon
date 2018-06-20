package net.if_else;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1546 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int subject = s.nextInt();
		double[] score = new double[subject];

		for(int i = 0; i < subject; i++)
			score[i] = s.nextDouble();

		Arrays.sort(score);

		double m = score[subject-1];

		for(int i = 0; i < subject; i++)
			score[i] = Double.parseDouble(String.format("%.2f", score[i] / m * 100));

		double sum = 0;
		for(int i= 0; i < subject; i++)
			sum += score[i];

		double average = Double.parseDouble(String.format("%.2f", sum / subject));
		System.out.println(average);

	}

}
