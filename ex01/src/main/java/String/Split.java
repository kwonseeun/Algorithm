package String;

public class Split {

	public static void main(String[] args) {
		System.out.println("[split 문자열 분리 - 특수문자인 ,(콤마) 기준으로 문자열 분리 실시]");

		// 콤마를 포함하고 있는 초기 문자열 선언
		String data = "안녕,하세요,반갑습니다";

		// 문자열에 포함된 콤마 개수를 확인하기 위해 변수 선언
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == ',') { // 문자열.charAt 한글자씩 잘라서 ,(콤마) 인지 확인한다
				count++;
			}
		}

		// 문자열에 콤마가 포함이 되어있을 경우 split 사용해 분리한다
		if (count > 0) {
			for (int j = 0; j <= count; j++) { // 콤마가 포함된 [기준]으로 문자열을 분리시킨다
				System.out.println("콤마 : " + data.split("[,]")[j]);
			}
		} else {
			System.out.println("콤마 : " + "없습니다");
		}

	}

}
