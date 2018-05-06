package net.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Question4 {

	//��� ���
	public static int getAverage(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) 
			sum += a[i];
		
		return (int)Math.round(sum / a.length);
	}
	
	//�߾Ӱ�
	public static int getMiddle(int[] a) {
		return a[(a.length) / 2];
	}
	
	//�ֺ�
	public static int getMode(int[] a) {
		//key�� ����ϴ� Integer�� ���Ұ�����, value�� ����ϴ� Integer�� �󵵼� ������ ���
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//a�迭�� ���� ��(i)�� key�� ����
		for(int i : a) {
			Integer count = map.get(i); //HashMap�� get�޼ҵ�� key�� �Ű������� �޾� value�� ����
			//key���� �������� �ʾ� count�� null�̶�� value�� 1!
			//key���� ������ ���̶�� count�� �� + 1
			map.put(i, count == null ? 1: count + 1);
		}
		int maxValue = 0; //map���� key 
		int maxCount = 0; //map���� value(�󵵼� ��)
		//�󵵼��� ���� key���� ������ 
		ArrayList max = new ArrayList(); 
		
		for(int key : map.keySet()) {
			//get���� ���� ���� map���� value��! 
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
	
	//�ִ밪�� �ּҰ� ����
	public static int getRange(int[] a) {
		int max = a[0];
		int min = a[0];
		
		//�ִ밪
		for (int i = 1; i < a.length; i++)
			if(max <a[i])
				max = a[i];
		//�ּҰ�
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
