package net.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			int blank = input.indexOf(" ");
			int a = Integer.parseInt(input.substring(0, blank));
			int b = Integer.parseInt(input.substring(blank + 1, input.length()));
			bw.write(a + b + "\n");
		}
		bw.flush();
	}

}
