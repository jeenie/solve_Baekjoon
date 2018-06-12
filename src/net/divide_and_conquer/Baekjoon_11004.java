package net.divide_and_conquer;

import java.util.Scanner;

public class Baekjoon_11004 {
	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	static int partition(int[] a, int start, int end) {
		int value = a[end];
		int i = start - 1;
		for(int j = start; j <= end - 1; ++j)
			if(a[j] < value)
				swap(a, ++i, j);
		swap(a, i+1, end);
		return i + 1;
	}
	
	static int select(int[] a, int start, int end, int nth) {
		if(start >= end) return a[start];
		int middle = partition(a, start, end);
		int middle_nth = middle - start + 1;
		if(nth == middle_nth) return a[middle];
		if(nth < middle_nth)
			return select(a, start, middle-1, nth);
		else
			return select(a, middle+1, end, nth - middle_nth);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		
		System.out.println(select(arr, 0, arr.length-1, k));
	}

}
