package net.sort;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Question6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {
			Collator c = Collator.getInstance();
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() < s2.length()) return -1;
				else if(s1.length() > s2.length()) return 1;
				else return c.compare(s1, s2);
			}
		});
		
		for (int i = 0 ; i < n ; i++) 
			set.add(input.next());

		for(String s : set)
			System.out.println(s);
	}

}
