package String;

import java.util.Arrays;

public class CharacterIsDight {

	public static void main(String[] args) {
System.out.println("[Character.isDigit 숫자 및 문자 여부 확인]");
		
		//문자 및 숫자 여부를 확인할 초기 변수 선언
		String data = "5안3녕hi";
		
		//문자열을 한글자씩 자른 형태로 char 배열에 데이터를 담는다
		char arr[] = data.toCharArray();		
		System.out.println("원본 : "+Arrays.toString(arr));
		
		/*[설 명]
		 * 1. Character.isDigit 을 사용해 문자인지 숫자인지 확인
		 * 2. true값 일 경우 숫자이며, false값 일 경우 문자
		 */
		for(int i=0; i<arr.length; i++) {
			if(Character.isDigit(arr[i]) == true) {
				System.out.println(arr[i]+" : "+"숫자");
			}
			else {
				System.out.println(arr[i]+" : "+"문자");
			}
		}

	}

}
