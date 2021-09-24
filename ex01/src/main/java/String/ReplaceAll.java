package String;

public class ReplaceAll {

	public static void main(String[] args) {
	
		System.out.println("[공백 문자 제거 - replaceAll 사용해 공백 문자 제거 실시]");

        //초기 변수를 선언합니다
        String one = "h e l l o";
        System.out.println("공백제거 전 : "+one);

        /*[설 명]
        * 1. 대입 연산자 방식을 사용해서 다시 공백제거된 값을 넣는다.
        * 2. replaceAll("제거할 문자","변환할 문자")
        * 3. " " 공백을  "" 제거해준다는 의미.
        */
        one = one.replaceAll(" ",""); // 제거할문자, 변환할 문자
        System.out.println("공백제거 후 : "+one);
	}

}
