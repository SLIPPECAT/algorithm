package com.example.chapter2;

import java.util.Arrays;

public class Q5 {

	static void swap(int[]a, int idx1, int idx2){
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a){
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length-1-i);
	}

	static void copy(int[]a, int[]b){
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		int[]b = new int[]{1,2,3,4,5};
		int[]a = new int[b.length];

		copy(a, b);
		reverse(a);
		System.out.println(Arrays.toString(a));
	}

}
