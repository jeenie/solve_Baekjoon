package net.output;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		
		while(input.hasNextLine()) {
			String s = input.nextLine();
			if (s == null || s.isEmpty())
				break;
			a.add(s);
		}
		input.close();
		
		for(int i = 0; i < a.size(); i++) 
			System.out.println(a.get(i));
	}
}
