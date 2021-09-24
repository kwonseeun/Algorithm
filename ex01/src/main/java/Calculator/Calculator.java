package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("[if, else문 이용하여 계산기 프로그램 만들기");
		
		/*[설 명]
		 * 1. scanner : 사용자로부터 키보드 입력을 받습니다
		 * 2. equals : 사용자가 입력한 부호값이 +,-,*,/ 와 같은지 확인합니다
		 * */
		
		//첫번째와 두번째 정수 값을 담을 변수 선언
		int one = 0; 		
		int two = 0;
		
		//사칙연산 부호를 담을 변수 선언 실시
		String sign = "";
		
		//사용자로부터 키보드 입력을 받기 위한 scanner 객체 선언 실시
		Scanner scan = new Scanner(System.in);
		
		//사용자로부터 정수값과 연산자 부호값을 입력받습니다
		System.out.print("첫번째 값 : ");
		one = scan.nextInt();
		
		System.out.print("두번째 값 : ");
		two = scan.nextInt();
		
		System.out.print("사칙연산부호 (+,-,*,/) : ");
		sign = scan.next();
		
		//if 문을 사용해서 사용자가 입력한 사칙연산 부호에 맞게 연산 수행 실시
		if(sign.equals("+")) {
			System.out.println(one+"+"+two+"="+(one+two));
		}
		else if(sign.equals("-")) {
			System.out.println(one+"-"+two+"="+(one-two));
		}
		else if(sign.equals("*")) {
			System.out.println(one+"*"+two+"="+(one*two));
		}
		else if(sign.equals("/")) {
			System.out.println(one+"/"+two+"="+(one/two));
		}
		else {
			System.out.println("알수없는 연산자입니다 ... ");
		}
				
	}//메인 종료

}//클래스 종료

