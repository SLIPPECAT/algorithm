package com.example.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {

		String[] nameArr = {"박기덕", "신승욱", "김호연", "류준영"};
		List<String> nameList = Arrays.asList(nameArr);


		// Stream 사용 전
//		// 원본 데이터가 직접 정렬됨
//		Arrays.sort(nameArr);
//		Collections.sort(nameList);
//
//		for(String str : nameArr){
//			System.out.println(str);
//		}
//		for(String str : nameList){
//			System.out.println(str);
//		}

		// Stream 사용 후
		// 원본의 데이터가 아닌 별도의 Stream을 생성함
		Stream<String> nameStream = nameList.stream();
		Stream<String> arrayStream = Arrays.stream(nameArr);

		// 복사된 데이터를 정렬하여 출력함
		nameStream.sorted().forEach(System.out::println);
		arrayStream.sorted().forEach(System.out::println);
	}
}
