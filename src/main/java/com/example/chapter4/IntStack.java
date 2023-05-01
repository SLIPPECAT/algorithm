package com.example.chapter4;

public class IntStack {
	private int[] stk;  // 스택용 배열
	private int capacity;  // 스택 용량
	private int ptr;  // 스택 포인터

	// 실행 시 예외: 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException(){};
	}

	// 실행 시 예외: 스택이 가득 참
	public class OverflowIntStackException extends  RuntimeException{
		public OverflowIntStackException(){ };
	}

	// 생성자
	IntStack(int maxlen){
		ptr= 0;
		capacity = maxlen;
		try{
			stk = new int[capacity];  // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e){  // 생성할 수 없음
			capacity = 0;
		}
	}

	public int push(int x){
		if (ptr > capacity)  // 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	public int pop(){
		if (ptr <= 0)  // 스택이 비어있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	public int peek(){
		if (ptr <= 0)  // 스택이 비어있음.
			throw new EmptyIntStackException();
		return stk[ptr -1];
	}

	public void clear(){
		ptr = 0;
	}

	// 스택에서 x를 찾아 index 반환
	public int indexOf(int x){
		for (int i = ptr-1; i >0 ; i--) {
			if(stk[i] == x)
				return i;
		}
		return -1;
	}

	// 스택의 용량을 반환
	public int getCapacity() {
		return capacity;
	}

	public int size(){
		return ptr;
	}

	public boolean isEmpty(){
		return ptr <= 0;
	}

	public boolean ifFull(){
		return ptr >= capacity;
	}

	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump(){
		if (ptr <= 0) {
			System.out.println("스택이 비었습니다.");
		}
		for (int i = 0; i <ptr; i++) {
			System.out.println(stk[i]);
		}
		System.out.println();
	}

}
