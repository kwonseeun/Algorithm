package Cast;

public class Cast {

	public static void main(String[] args) {
		System.out.println("[Integer.parseInt, Integer.toString 데이터 형변환 - string to int, int to string 간 데이터 형변환 실시]");

		// 초기 String, int 변수 선언
		String str_data = "10";
		int int_data = 20;

		// String 변수인 str_data를 int로 형변환 실시
		int int_total = int_data + Integer.parseInt(str_data);

		// int 변수인 int_data를 String로 형변환 실시
		String str_total = Integer.toString(int_data) + str_data;

		/*
		 * [설 명] 1. int 형에서 (+) 기호 : 사칙연산 수행 실시 2. String 형에서 (+) 기호 : 문자열 결합을 실시 3.
		 * string to int 간 데이터 형변환을 수행하기 위해서는 반드시 숫자 형태로 된 데이터여야 합니다 (특수문자, 영문, 한글 등
		 * 포함되면 안됨)
		 */
		System.out.println("int : " + int_total);
		System.out.println("String : " + str_total);

	}

}
