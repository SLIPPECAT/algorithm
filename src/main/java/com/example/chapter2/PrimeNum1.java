package com.example.chapter2;

public class PrimeNum1 {

	public static void main(String[] args) {

		int[] a = new int[1000];
		int count= 0;

		for (int i = 2; i <= 1000; i++) {
			int j;
			for (j = 2; j < i; j++) {
				count ++;
				if (i % j == 0)
					break;
			}
//			if(count ==1)
			if(i == j)
				System.out.println(i);
		}
		System.out.println("나눗셈 수행 횟수: " + count);
	}
}
