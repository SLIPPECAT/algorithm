package com.example;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = stdIn.nextInt();

		if (n == 1) {
			System.out.println("A");
		} else if (n == 2) {
			System.out.println("B");
		} else if (n ==3 ){
			System.out.println("C");
		}
	}
//
//		if (n > 0) {
//			System.out.println("양수 입니다.");
//		}
//		else if (n < 0){
//			System.out.println("음수입니다.");
//		}
//		else {
//			System.out.println("0입니다.");
//		}
//	}

}
