package com.example;

public class Prac08 {

	static int sumof(int a, int b){

		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum += i;
		}

		return sum;

	}

	static int sumof2(int a, int b){

		int sum = 0;

		while (a <= b){
			sum += a;
			a++;
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println("a부터 b까지 총 합은: " + sumof(3,5) + "입니다.");
		System.out.println("a부터 b까지 총 합은: " + sumof(1,10) + "입니다.");
		System.out.println("a부터 b까지 총 합은: " + sumof(-10,10) + "입니다.");

		System.out.println("a부터 b까지 총 합은: " + sumof2(3,5) + "입니다.");
		System.out.println("a부터 b까지 총 합은: " + sumof2(1,10) + "입니다.");
		System.out.println("a부터 b까지 총 합은: " + sumof2(-10,10) + "입니다.");


	}

}
