package net.loop;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_11721 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String line = s.next();
		
		for(int i = 0; i < line.length(); i++) {
			if(i % 10 == 0 && i != 0)
				System.out.println();
			System.out.print(line.charAt(i));
		}
	}
}
