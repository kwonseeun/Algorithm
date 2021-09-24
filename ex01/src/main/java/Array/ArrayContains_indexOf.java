package Array;

import java.util.ArrayList;

public class ArrayContains_indexOf {

	public static void main(String[] args) {
		System.out.println("[ArrayList contains, indexOf - 배열에 특정 값 포함 여부 확인 및 위치 확인]");

		// 초기 ArrayList 선언 및 데이터 삽입
		ArrayList list = new ArrayList();
		list.add("하나");
		list.add("셋");
		list.add("둘");

		// contains 메소드는 데이터 포함 여부를 true, false로 리턴해준다
		boolean two = list.contains("둘");
		boolean three = list.contains("셋");
		boolean four = list.contains("넷");

		System.out.println("[둘] 포함 여부 : " + two);
		System.out.println("[셋] 포함 여부 : " + three);
		System.out.println("[넷] 포함 여부 : " + four);

		if (two == true) { // 둘 - 데이터 포함 시 위치확인 실시
			int idx = list.indexOf("둘"); // indexOf 메소드는 데이터 번지수를 정수값으로 리턴해준다
			int idx2 = list.indexOf("셋");
			System.out.println("[둘] 위치 확인 : " + idx);
			System.out.println("[둘] 위치 확인 : " + idx2);
			System.out.println("[둘] 데이터 확인 : " + list.get(idx));
			System.out.println("[셋] 데이터 확인 : " + list.get(idx2));
		} else {
			System.out.println("[둘] 위치 확인 : " + "데이터가 없습니다");
		}

	}

}
