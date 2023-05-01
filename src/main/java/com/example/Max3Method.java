package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Max3Method {

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}

	static int max4(int a, int b, int c, int d){
		int max = a;
		int[] numbers = new int[]{a,b,c,d};
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	static int min3 (int a, int b, int c){
		int min = a;
		if (b < min){
			min = b;
		}
		if (c < min){
			min = c;
		}
		return min;
	}

	static int min4 (int a, int b, int c, int d){
		int min = a;
		int[] numbers = new int[]{a,b,c,d};
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min){
				min = numbers[i+1];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
		System.out.println("max3(2,1,3) = " + max3(2,1,3));
		System.out.println("max3(2,3,1) = " + max3(2,3,1));
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(1,2,1) = " + max3(1,2,3));
		System.out.println("max3(1,4,3) = " + max3(1,4,3));

		System.out.println("max4(7,2,3,5) = " + max4(7,2,3,5));

		System.out.println("min(1,2,3) = " + min3(1,2,3));
		System.out.println("min(7,3,1) = " + min3(7,3,1));

		System.out.println("min(1,3,7,2) = " + min4(1,3,7,2));
		System.out.println("min(4,3,-2, 5) = " + min4(4,3, -2, 5));
	}
}