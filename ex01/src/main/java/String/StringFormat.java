package String;

public class StringFormat {

	public static void main(String[] args) {
		System.out.println("[화폐(돈)단위표시 - String.format사용해 화폐단위 콤마 표시 실시]");

		// 초기 변수 선언
		int money = 10000;

		/*
		 * [설 명] 1. String.format 을 사용해서 원하는 형태의 문자열로 만들 수 있다 2. %,(콤마)d - 화폐단위로 정수값을
		 * 표시하겠다는 의미이다
		 */
		String format = String.format("%,d", money);

		System.out.println("원본 : " + money);
		System.out.println("포맷 : " + format);

	}

}
