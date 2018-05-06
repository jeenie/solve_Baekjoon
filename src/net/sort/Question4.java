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
		
		return (int)Math.round(sum / a.length);
	}
	
	//중앙값
	public static int getMiddle(int[] a) {
		return a[(a.length) / 2];
	}
	
	//최빈값
	public static int getMode(int[] a) {
		//key로 사용하는 Integer를 원소값으로, value로 사용하는 Integer를 빈도수 값으로 사용
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//a배열의 원소 값(i)을 key로 설정
		for(int i : a) {
			Integer count = map.get(i); //HashMap의 get메소드는 key를 매개변수로 받아 value를 리턴
			//key값이 존재하지 않아 count가 null이라면 value에 1!
			//key값이 존재한 값이라면 count된 값 + 1
			map.put(i, count == null ? 1: count + 1);
		}
		int maxValue = 0; //map에서 key 
		int maxCount = 0; //map에서 value(빈도수 값)
		//빈도수가 같은 key들을 저장할 
		ArrayList max = new ArrayList(); 
		
		for(int key : map.keySet()) {
			//get으로 꺼낸 값은 map에서 value임! 
			if(map.get(key) >= maxCount) {
				maxCount = map.get(key);
				max.add(key);
			}
		}
		
		if(max.size() > 1) {
			Collections.sort(max);
			maxValue = (int)max.get(1);
		}
		else
			maxValue = (int)max.get(0);
		return maxValue;
	}
	
	//최대값과 최소값 차이
	public static int getRange(int[] a) {
		int max = a[0];
		int min = a[0];
		
		//최대값
		for (int i = 1; i < a.length; i++)
			if(max <a[i])
				max = a[i];
		//최소값
		for (int i = 1; i < a.length; i++)
			if(min >a[i])
				min = a[i];
		
		return max - min;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) 
			a[i] = input.nextInt();
		
		Arrays.sort(a);
		System.out.println(getAverage(a));
		System.out.println(getMiddle(a));
		System.out.println(getMode(a));
		System.out.println(getRange(a));
	}

}
