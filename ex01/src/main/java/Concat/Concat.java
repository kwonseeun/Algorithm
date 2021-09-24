package Concat;

public class Concat {
	public static void main(String[] args) {
		System.out.println("[문자열 결합 : concat, +, += 사용]");

		
		// concat => 여러 문자열을 하나로 합친다.
		// 초기 변수 선언
		String a = "hello";
		String b = "world";

		// total 변수를 사용해서 문자 결합을 실시 위해 빈값으로 선언
		String total = "";

		// '+' 연산자 사용해서 문자결합 실시
		total = a + b;
		System.out.println("+ 연산자 : " + total); // helloworld 문자열이 저장되어있다

		// '+=' 대입 연산자 방식을 사용해서 문자결합 실시
		total = total + " java";
		System.out.println("+= 대입연산자 : " + total); // helloworld java 문자열이 저장되어있다

		// concat 사용해서 문자결합 실시
		System.out.println("concat : " + total.concat(" nice")); // helloworld java nice 문자열이 저장되어있다

	}// 메인 종료
}
