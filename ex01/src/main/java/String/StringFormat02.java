package String;

public class StringFormat02 {

	public static void main(String[] args) {
		System.out.println("[String.format 문자열 형식 설정 - 이름,나이,시력,가진 현금 데이터를 사용해 String.farmat 정보 출력하기]");

		// 초기 사용자 정보를 담은 변수를 선언
		String name = "권세은";
		int age = 27;
		double eye = 1.532;
		int money = 10000;

		/*
		 * [설 명]
		   1. %s - 문자열을 표시하겠다는 의미
		 * 2. %d - 정수값을 표시하겠다는 의미
		 * 3. %.1f - 소수 .(점)기준 밑으로 1자리수만 출력하겠는 의미 (1.5 출력) 
		 * 4. %.2f - 소수 .(점)기준 밑으로 2자리수만 출력하겠는 의미 (1.53 출력)
		 * 5. %,d - 정수값을 화폐단위로 표시하겠다는 의미
		 */
		String info = String.format("이름:%s, 나이:%d, 시력:%.1f, 가진 현금:%,d원", name, age, eye, money);

		System.out.println("정보 - " + info);

	}

}
