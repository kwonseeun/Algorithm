package Cast;

public class Cast02 {

	public static void main(String[] args) {
		System.out.println("[valueOf 객체 형변환 - String, Integer, Double valueOf간 객체 형변환 실시]");

		// 초기 변수 선언 실시
		String s_value = "10";
		int i_value = 20;
		double d_value = 30.0;

		/*
		 * [설 명]
		 * 1. String.valueOf - 문자열 형태로 데이터가 저장
		 * 2. Integer.valueOf - 정수 형태로 데이터가 저장
		 * 3. Double.valueOf - 실수 형태로 데이터가 저장됩니다
		 */
		System.out.println("string [int] : " + String.valueOf(i_value));
		
		System.out.println("string [double] : " + String.valueOf(d_value));

		System.out.println("int [string] : " + Integer.valueOf(s_value));

		System.out.println("double [string] : " + Double.valueOf(s_value));
		
		System.out.println("double [int] : " + Double.valueOf(i_value));

	}

}
