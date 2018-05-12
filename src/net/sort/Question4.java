package net.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Question4 {

	//산술 평균
	public static int getAverage(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) 
			sum += a[i];
		return (int)Math.round((double)sum / (double)a.length);
	}

	//중앙값
	public static int getMiddle(int[] a) {
		int size = a.length;
		int middle = (int) Math.round((double) size / 2);
		if(size % 2 == 0)
			return (a[middle - 1] + a[middle] / 2) + 1;
		else
			return a[middle - 1];
	}

	//최빈값
	public static int getMode(int[] a) {
		int max = 0;
		int count = 0;
		int[] mode = new int[8001];
		int second = 0;
		for(int i = 0 ; i < a.length ; i++) { 
			mode[a[i] + 4000]++;
			max = Math.max(max, mode[a[i] + 4000]);
		}

		for(int i = 0; i < mode.length; i++) {
			if(mode[i] == max) {
				count++;
				second = i - 4000;
			}
			if(count == 2) {
				second = i - 4000;
				break;
			}
		}
		return second;
	}

	//최대값과 최소값 차이
	public static int getRange(int[] a) {
		int max = a[a.length - 1], min = a[0];
		return max - min;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		int count = 0;

		for(int i = 0; i < n; i++)  
			a[i] = input.nextInt();

		Arrays.sort(a);

		System.out.println(getAverage(a)); //산술 평균 ok
		System.out.println(getMiddle(a));
		System.out.println(getMode(a));
		System.out.println(getRange(a));
	}

}
