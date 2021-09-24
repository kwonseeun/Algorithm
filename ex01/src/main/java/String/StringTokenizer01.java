package String;

import java.util.StringTokenizer;

public class StringTokenizer01 {

	public static void main(String[] args) {
		String str1 = "Wellcome to The Java StringTokenizer";
		String str2 = "Wellcome%to%The%Java%StringTokenizer";
		String str3 = "Wellcome%to/The%Java*StringTokenizer";
		String str4 = "Wellcome%%to%&The&Java&StringTokenizer";

		StringTokenizer st;

		// 1. delim�� default�� ����.
		st = new StringTokenizer(str1);
		System.out.println("str1�� ��ū ���� : " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 2. delim�� '%'�� ����.
		st = new StringTokenizer(str2, "%");
		System.out.println("str2�� ��ū ���� : " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 3. delim�� '%', '/', '*'�� ����. + delim�� �ϳ��� token���� ���.
		st = new StringTokenizer(str3, "%/*", true);
		System.out.println("str3�� ��ū ���� : " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 4. delim�� '%'���� �����Ͽ� ����ϴٰ�, delim�� '&'�� �缳���ϰ� ���.
		st = new StringTokenizer(str4, "%");
		System.out.println("str4�� ��ū ���� (delim : '%') : " + st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken("&"));
		System.out.println("str4�� ��ū ���� (delim : '&') : " + st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

	}

}
