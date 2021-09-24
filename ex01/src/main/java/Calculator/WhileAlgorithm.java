package Calculator;

public class WhileAlgorithm {

	public static void main(String[] args) {

		System.out.println("[최소공배수, 최대공약수 - while문을 사용해 최소공배수, 최대공약수 구하기 실시]");

		int one = 4; // 첫번째 정수값
		int two = 8; // 두번째 정수값

		int multiple = 0; // 최소공배수 담을 값
		int trivial = 0; // 최대공약수 담을 값

		int i = 1;

		/*
		 * [설 명] 1. 최소공배수 - 공배수 중에서 가장 작은 정수입니다 2. 최대공약수 - 공약수 중에서 가장 큰 수입니다 3. 약수 - 약수는
		 * 어떤 수를 0으로 나누어 떨어지게 하는 수 3. while문 반복 순서 - 1차 : 1 <= 4 && 1<=8 2차 : 2<=4 &&
		 * 2<=8 3차 : 3<=4 && 3<=8 5. && 논리연산자 : 모든 조건이 true를 만족해야 한다.
		 * 
		 */
		while (i <= one && i <= two) {
			if (one % i == 0 && two % i == 0) { // 두수가 모두 0으로 나누어떨어지는 경우
				trivial = i; // 최대공약수에 i값을 대입한다
			}
			i++; // i값을 증가시켜 최대 공약수값을 찾기위해 다시 while 반복문을 수행한다
		}

		multiple = (one * two) / trivial; // 최소 공배수 구하는 식입니다

		System.out.println("최소 공배수 : " + multiple);
		System.out.println("최대 공약수 : " + trivial);
		
		/**
		 * 1. 최소공배수 - 공배수 중에서 가장 작은 정수입니다
		 * 
		 * 2. 최대공약수 - 공약수 중에서 가장 큰 수입니다
		 * 
		 * 3. 약수 - 약수는 어떤 수를 0으로 나누어 떨어지게 하는 수입니다
		 * 
		 * 4. while문 반복 순서 - 1차 : 1 <= 4 && 1<=8
		 * 
		 * 2차 : 2<=4 && 2<=8
		 * 
		 * 3차 : 3<=4 && 3<=8
		 * 
		 * 5. && 논리연산자 : 모든 조건이 true를 만족해야합니다
		 */

	}

}
