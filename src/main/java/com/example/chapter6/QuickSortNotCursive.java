package com.example.chapter6;

import com.example.chapter4.IntStack;

public class QuickSortNotCursive {

	static void swap(int[] a, int idx1, int idx2){
		int tmp = a[idx1]; a[idx1] = a[idx2]; a[idx2] = tmp;
	}

	static void quickSort(int[] a, int left, int right){
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);

		lstack.push(left);
		rstack.push(right);

		while (lstack.isEmpty() != true){
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left + right) / 2];

			do {
				while (a[pl] < pr) pr++;
				while (a[pr] > pl) pl--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr){
				lstack.push(left);
				rstack.push(pr);
			}
			if (pl < right){
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}

}
