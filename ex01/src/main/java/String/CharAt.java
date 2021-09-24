package String;

public class CharAt {

	public static void main(String[] args) {
		System.out.println("[charAt 특정 위치 문자 추출 - charAt을 사용해서 한글자씩 문자열 분리하기]");

		// 초기 변수 선언 실시
		String data = "권세은";

		/*
		 * [설 명] 1. charAt(인덱스) 사용해서 특정 위치 문자열을 출력할 수 있습니다 2. 문자열은 0번부터 인덱스가 시작됩니다 
		 * /권(0)  세(1) / 은(2)
		 */
		for (int i = 0; i < data.length(); i++) { // 문자열 길이까지 반복합니다
			System.out.println(i + "번지 : " + data.charAt(i));
		}
	}

}
