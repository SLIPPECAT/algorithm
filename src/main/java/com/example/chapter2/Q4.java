package com.example.chapter2;

import java.util.Arrays;

public class Q4 {

	static void copy(int[]a, int[]b){
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		int[]b = new int[]{1,2,3,4,5};
		int[]a = new int[b.length];
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		copy(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
