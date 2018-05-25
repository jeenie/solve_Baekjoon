package net.sort;

//2751�� �� �����ϱ�2 (��������)
import java.util.Scanner;

public class Baekjoon_2751_1 {

	static void mergeSort(int[] a, int start, int end) {
		if(start >= end) return;
		int middle = (start + end) / 2;
		mergeSort(a, start, middle);
		mergeSort(a, middle + 1, end);
		merge(a, start, middle, end);
	}
	
	static void merge(int[] a, int start, int middle, int end) {
		int length = end - start + 1;
		int[] temp = new int[length]; //�ӽù迭
		int index1 = start;
		int index2 = middle + 1;
		int i = 0; //�ӽù迭 temp���� ����� ����
		
		while(index1 <= middle && index2 <= end) {
			if(a[index1] < a[index2]) 
				temp[i++] = a[index1++];
			else 
				temp[i++] = a[index2++];
		}
		
		//���� �κ�(����x)�� ���� �迭�� ���
		while(index1 <= middle)
			temp[i++] = a[index1++];
		//���� �κ�(����x)�� ���� �迭�� ���
		while(index2 <= end)
			temp[i++] = a[index2++];
		
		//�ӽù迭�� ���ĵ� ���ҵ��� ���� �迭 a�� �̵���Ŵ
		for(i = 0; i < temp.length; i++)
			a[start + i] = temp[i];
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int [n];
		
		for(int i = 0; i < a.length; i++) 
			a[i] = input.nextInt();
		
		mergeSort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

}
