package com.example.chapter6;

import java.util.Scanner;

public class Q1 {

	static void swap(int[]a, int idx1, int idx2){
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	static void bubbleSortDesc(int[]a, int n){
		for (int i = 0; i < n - 1; i++){
			for (int j = n - 1; j > i ; j--) {
				if (a[j - 1] < a [j])
					swap(a, j-1, j);
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("내림차순 정렬");
		System.out.print("요솟수: ");

		int n = stdIn.nextInt();
		int[] nx = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("배열의 값을 입력");
			nx[i] = stdIn.nextInt();
		}

		System.out.println("현재 저장된 배열");
		for (int i = 0; i < n; i++) {
			System.out.print(nx[i]);
		}

		bubbleSortDesc(nx, n);

		System.out.println("내림차순된 배열");
		for (int i = 0; i < n; i++) {
			System.out.print(nx[i]);
		}
	}
}
