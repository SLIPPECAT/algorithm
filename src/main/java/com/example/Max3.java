package com.example;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값: "); int a = stdIn.nextInt();
		System.out.print("b의 값: "); int b = stdIn.nextInt();
		System.out.print("c의 값: "); int c = stdIn.nextInt();

////		int max = a;
////		if (b > max) max = b;
////		if (c > max) max = c;
//
		int[] numbers = new int[]{a, b, c};
		int max = a;
		for (int i= 1; i < numbers.length; i++){
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
