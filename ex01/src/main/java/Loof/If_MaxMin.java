package Loof;

public class If_MaxMin {

	public static void main(String[] args) {
		System.out.println("[if 조건문 - if문을 사용해 두 정수값 비교 후 최대값, 최소값 출력하기]");

		// 초기 정수값 변수 선언 및 최대값, 최소값을 담기 위한 변수 선언
		int one = 30;
		int two = 10;

		int max = 0;
		int min = 0;

		/*
		 * [설 명]
		 *  1. 비교 연산자 >= 의미 - 크거나 같은 값일 경우
		 *  2. if 조건을 검사 후 만족 시 if문 { } 블럭 내용을 수행하고, else 만족하지 않을 시 else 문 { } 블럭 내용을 수행합니다
		 */
		
		if (one >= two) { // one 정수값이 two 정수값보다 크거나 같을 경우
			max = one; // max 변수에 one 변수대입
			min = two; // min 변수에 two 변수대입
		} else {
			max = two;
			min = one;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
