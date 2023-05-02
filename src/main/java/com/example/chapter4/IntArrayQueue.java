package com.example.chapter4;

// Q4
public class IntArrayQueue{

	// 초기화 어떻게 해줘야 하지?
	private int[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;

	public IntArrayQueue(int maxlen){
		num = front = rear = 0;
		capacity = maxlen;
		try{
			que = new int[capacity];
		} catch (OutOfMemoryError e){
			capacity = 0;
		}

	}

	public int enQueue(int val){
		return que[num++] = val;
	}

	public int deQueue(int val){
		que[num] = val;
		for (int i = 0; i < num; i++) {
			que[i] = que[i+1];
		}
		return que[0];
	}

}
