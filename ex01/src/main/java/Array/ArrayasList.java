package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayasList {

	public static void main(String[] args) {
		System.out.println("[Arrays.asList : String 배열 데이터 전체 복사 실시]");

		String arr[] = { "하나", "둘", "셋", "넷", "다섯" };
		System.out.println("원본 : " + Arrays.toString(arr));

		/*
		 * [설 명] 1. Arrays.asList를 사용해서 String 배열에 있는 데이터를 전체 복사할 수 있다 2. ArrayList 객체를
		 * 생성할 때 Arrays.asList를 사용해서 전체 복사를 실시한다
		 */
		ArrayList list = new ArrayList(Arrays.asList(arr));
		System.out.println("복사 : " + list.toString());
		
		// 1. Arrays.asList를 사용해서 String 배열에 있는 데이터를 전체 복사할 수 있다
		// 2. ArrayList 객체를 생성할 때 Arrays.asList를 사용해서 전체 복사를 실시한다
	}

}
