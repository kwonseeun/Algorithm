package String;

import java.util.StringTokenizer;

public class StringTokenizer01 {

	public static void main(String[] args) {
		String str1 = "Wellcome to The Java StringTokenizer";
		String str2 = "Wellcome%to%The%Java%StringTokenizer";
		String str3 = "Wellcome%to/The%Java*StringTokenizer";
		String str4 = "Wellcome%%to%&The&Java&StringTokenizer";

		StringTokenizer st;

		// 1. delim을 default로 설정.
		st = new StringTokenizer(str1);
		System.out.println("str1의 토큰 개수 : " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 2. delim을 '%'로 설정.
		st = new StringTokenizer(str2, "%");
		System.out.println("str2의 토큰 개수 : " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 3. delim을 '%', '/', '*'로 설정. + delim도 하나의 token으로 취급.
		st = new StringTokenizer(str3, "%/*", true);
		System.out.println("str3의 토큰 개수 : " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 4. delim을 '%'으로 설정하여 출력하다가, delim을 '&'로 재설정하고 출력.
		st = new StringTokenizer(str4, "%");
		System.out.println("str4의 토큰 개수 (delim : '%') : " + st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken("&"));
		System.out.println("str4의 토큰 개수 (delim : '&') : " + st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

	}

}
