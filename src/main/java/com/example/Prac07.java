package com.example;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("1 이상의 정수를 입력해주세요.");
		int n = stdIn.nextInt();
		int sum = 0;
		if (n < 1){
			throw new IllegalArgumentException("1이상을 적으라니까..");
		}
		sum = (1 + n) * n /2;
		System.out.println(sum);


	}

}
