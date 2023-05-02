package com.example.chapter4;

import com.example.chapter4.IntStack.OverflowIntStackException;

public class IntQueue {
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;

	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException(){};
	}

	public class OverflowIntQueueExeption extends RuntimeException{
		public OverflowIntQueueExeption(){};
	}

	public IntQueue(int maxlen){
		num = front = rear = 0;
		capacity = maxlen;
		try{
			que = new int[capacity];
		} catch (OutOfMemoryError e){
			capacity = 0;
		}
	}

	public int enque(int x) throws OverflowIntQueueExeption{
		if (num >= capacity)
			throw new OverflowIntQueueExeption();
		que[rear ++] = x;
		num ++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	public int deque() throws EmptyIntQueueException{
		if (num <= 0){
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	public int peek() throws EmptyIntQueueException{
		if (num <=0 )
			throw new EmptyIntQueueException();
		return que[front];
	}

	public void clear(){
		num = front = rear = 0;
	}

	public int indexOf(int x){
		for (int i = 0; i < num; i++) {
			int idx = (i+front) % capacity;
			if (que[idx] == x)
				return i;
		}
		return -1;
	}

	public int getCapacity(){
		return capacity;
	}

	public int size(){
		return num;
	}

	public boolean isEmpty(){
		return num <= 0;
	}

	public boolean isFull(){
		return num >= capacity;
	}

	// 큐 안의 모든 데이터를 프론트 -> 리어 순서로 출력
	public void dump() {
		if (num <= 0) {
			System.out.println("큐가 비었습니다.");
		}
		else {
			for (int i = 0; i < num; i++)
				System.out.println(que[(i + front) % capacity] + "");
			System.out.println();
		}
	}
}
