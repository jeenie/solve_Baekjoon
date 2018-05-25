package net.sort;

//2751번 수 정렬하기2 (힙정렬)
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
	
	//heap 성질을 만족하도록 조정하는 메소드
	static void heapify(int[] a, int k, int end) {
		int left = 2 * k + 1, right = 2 * k + 2;
		int smaller;
		//k노드가 자식을 두개 가질 때
		if(right <= end)
			smaller = ( a[left] < a[right] ) ? left : right;
		//k노드가 자식을 한개 가질때
		else if(left <= end) smaller = left;
		//k노드의 자식이 없을 때 -> 종료
		else return;
		//위에서 찾은 smaller(자식 중 작은 값)과 k노드를 비교
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
