package String;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[toUpperCase, toLowerCase - 전체 영어 대문자, 소문자 변경 실시]");

		// 초기 영어문자가 포함된 변수 선언 실시 (대문자, 소문자 혼용)
		String data = "F7AE-f5wn";

		/*
		 * [설 명] 1. toUpperCase - 전체 영어를 대문자로 변경해줍니다 2. toLowerCase - 전체 영어를 소문자로 변경해줍니다
		 */
		System.out.println("원본 : " + data);
		System.out.println("대문자 : " + data.toUpperCase());
		System.out.println("소문자 : " + data.toLowerCase());

	}

}
