package net.sort;

//2751�� �� �����ϱ�2 (������)
import java.util.Scanner;

public class Baekjoon_2751_2 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void buildHeap(int[] a) {
		int end = a.length - 1;
		for(int i = end / 2; i >= 0; i--)
			heapify(a, i, end);
	}
	
	//heap ������ �����ϵ��� �����ϴ� �޼ҵ�
	static void heapify(int[] a, int k, int end) {
		int left = 2 * k + 1, right = 2 * k + 2;
		int smaller;
		//k��尡 �ڽ��� �ΰ� ���� ��
		if(right <= end)
			smaller = ( a[left] < a[right] ) ? left : right;
		//k��尡 �ڽ��� �Ѱ� ������
		else if(left <= end) smaller = left;
		//k����� �ڽ��� ���� �� -> ����
		else return;
		//������ ã�� smaller(�ڽ� �� ���� ��)�� k��带 ��
		if(a[smaller] < a[k]) {
			swap(a, smaller, k);
			heapify(a, smaller, end);
		}
	}
	
	static void heapSort(int[] a) {
		buildHeap(a);
		for(int end = a.length - 1; end >= 1; end--) {
			swap(a, 0, end);
			heapify(a, 0, end - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int [n];
		
		for(int i = 0; i < a.length; i++) 
			a[i] = input.nextInt();
		
		heapSort(a);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
