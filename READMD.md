백준 알고리즘 소스코드
=============
사용한 언어 : java

## 단계별로 풀어보기
### 9. 정렬해보기
#### 2751. 수 정렬하기2
  import java.util.Scanner;

  public class Question2 {

  static void mergeSort(int[] a, int start, int end) {
    if(start >= end) return;
    int middle = (start + end) / 2;
    mergeSort(a, start, middle);
    mergeSort(a, middle + 1, end);
    merge(a, start, middle, end);
  }

  static void merge(int[] a, int start, int middle, int end) {
    int length = end - start + 1;
    int[] temp = new int[length]; //임시배열
    int index1 = start;
    int index2 = middle + 1;
    int i = 0; //임시배열 temp에서 사용할 변수

    while(index1 <= middle && index2 <= end) {
      if(a[index1] < a[index2])
      temp[i++] = a[index1++];
      else
      temp[i++] = a[index2++];
    }

    //남은 부분(정렬x)이 앞쪽 배열일 경우
    while(index1 <= middle)
    temp[i++] = a[index1++];
    //남은 부분(정렬x)이 뒤쪽 배열일 경우
    while(index2 <= end)
    temp[i++] = a[index2++];

    //임시배열에 정렬된 원소들을 원래 배열 a로 이동시킴
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
