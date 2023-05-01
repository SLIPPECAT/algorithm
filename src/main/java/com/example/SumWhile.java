package com.example;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n값: ");

		int n = stdIn.nextInt();

		int i = 1;

		int sum = 0;

		while (i <= n){
			sum = sum + i;
			i++;
		}

		System.out.println(sum);

	}

}
