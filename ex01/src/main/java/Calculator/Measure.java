package Calculator;

import java.util.ArrayList;

public class Measure {

	public static void main(String[] args) {
		System.out.println("[약수구하기 - for문 사용해서 약수구하기 실시]");

		// 약수를 구하려는 초기 변수 선언
		int data = 8;

		// 약수 값을 담으려는 배열 선언
		ArrayList list = new ArrayList();

		/*
		 * [설 명] 1. 약수란? 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수입니다
		 */
		for (int i = 1; i <= data; i++) { // 2,3,4,5,6,7,8
			if ((data % i) == 0) { // 나머지가 0으로 떨어지는지 확인한다
				list.add(i);
			}
		}

		System.out.println(data + "약수 : " + list.toString());
	}

}
