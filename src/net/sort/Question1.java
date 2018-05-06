package net.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void bubbleSort(int[] a) {
		for (int i = a.length -1; i >= 1; i-- ) {
			for (int j = 0; j < i; j++) {
				if(a[j] > a[j+1])
					swap(a, j, j+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int [n];

		for (int k = 0; k < a.length; k++)
			a[k] = input.nextInt();

		bubbleSort(a);
		for (int k = 0; k < a.length; k++) 
			System.out.println(a[k]);

	}

}
