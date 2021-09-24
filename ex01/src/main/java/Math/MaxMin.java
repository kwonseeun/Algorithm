package Math;

public class MaxMin {

	public static void main(String[] args) {
		System.out.println("[Math 수학관련 - 소수점 반올림, 절대값, max 최대값, min 최소값 확인]");

		// 초기 변수를 선언해줍니다
		int i_one = 10;
		int i_two = 20;
		int i_three = -30;

		double d_value = 123.4563;

		/*
		 * [설 명]
		 * 1. max - 두값을 비교해서 더 큰수를 출력
		 * 2. min - 두값을 비교해서 더 작은수를 출력
		 * 3. abs - 절대값을 출력
		 * 4. round - 소수값을 반올림해서 출력 (10 - 소수점 1자리 출력하는데 반올림하겠다는 의미)
		 * (100 - 소수점 2자리 출력하는데 반올림하겠다는 의미)
		 * (1000 - 소수점 3자리 출력하는데 반올림하겠다는 의미)
		 */
		System.out.println("최대값 : " + Math.max(i_one, i_two));
		System.out.println("최소값 : " + Math.min(i_one, i_two));
		System.out.println("절대값 : " + Math.abs(i_three));

		System.out.println("소수점 1자리 반올림 : " + Math.round(d_value * 10) / 10.0);
		System.out.println("소수점 2자리 반올림 : " + Math.round(d_value * 100) / 100.0);
		System.out.println("소수점 3자리 반올림 : " + Math.round(d_value * 1000) / 1000.0);

	}

}
