package String;

public class SubString {

	public static void main(String[] args) {
		System.out.println("[substring 문자열 자르기 - 문자열 범위 자르기 및 문자열 기준 자르기 실시]");

		// 초기 문자열 변수 선언
		String data = "안녕하세요";

		/*
		 * [설 명]
			1. 문자열 인덱스 : 안(0) / 녕(1) / 하(2) / 세(3) / 요(4)
		 *  2. substring(시작 범위 인덱스,
		 * 종료 범위 인덱스 전까지) 3. substring(시작 기준 인덱스)
		 */
		
		String range_data = data.substring(0, 2); // 0번지부터 2번지 전까지 출력 즉, 0번지 1번지 출력하겠다
		String sub_data = data.substring(2); // 2번지(기준)부터 모두 출력하겠다

		System.out.println("원본 [data] : " + data);
		System.out.println("범위 [range_data] : " + range_data);
		System.out.println("기준 [sub_data] : " + sub_data);

	}

}
