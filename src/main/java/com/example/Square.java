package com.example;

public class Square {

	public static void main(String[] args) {
		int n = 1;
		int k = 1;
		while (Math.pow(2, n) != 32768) {
			n++;
		}
		System.out.println("n의 값은: " + n + "이며 2의 n 제곱은" + Math.pow(2, n) + "입니다.");
	}

}
