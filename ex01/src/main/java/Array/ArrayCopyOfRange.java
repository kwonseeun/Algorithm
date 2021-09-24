package Array;

import java.util.Arrays;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		System.out.println("[배열 복사 - Arrays.copyOfRange 사용해 배열 복사 실시]");

		// 초기 배열 선언 및 데이터 삽입
		int one[] = { 1, 2, 3, 4, 5 };
		System.out.println("원본 배열 : " + Arrays.toString(one));

		/*
		 * [설 명] 1. Arrays.copyOfRange(복사할 배열, 복사시작위치, 복사종료위치) 2. one 배열을 / 0번지부터 /
		 * one.length 배열 길이까지 전체 복사를 수행하겠다
		 */
		int two[] = Arrays.copyOfRange(one, 0, one.length);
		System.out.println("복사 배열 : " + Arrays.toString(two)); //"toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	}

}
