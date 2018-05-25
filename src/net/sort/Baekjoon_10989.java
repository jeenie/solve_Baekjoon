package net.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_10989 {
	public static void countingSort (int[] a, int max) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] countArray = new int[max + 1];

		for(int i = 0; i < a.length; i++)
			countArray[a[i]]++;

		for(int i = 0; i < countArray.length; i++) 
			for(int j = 0; j < countArray[i]; j++)
				bw.write(i+"\n");
		bw.close();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[] a = new int [n];

		int max = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(br.readLine().trim());
			if(max < a[i]) max = a[i];
		}
		
		countingSort(a, max);
		br.close();
	}
}
