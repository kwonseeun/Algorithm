package Concat;

public class Concat {
	public static void main(String[] args) {
		System.out.println("[���ڿ� ���� : concat, +, += ���]");

		
		// concat => ���� ���ڿ��� �ϳ��� ��ģ��.
		// �ʱ� ���� ����
		String a = "hello";
		String b = "world";

		// total ������ ����ؼ� ���� ������ �ǽ� ���� ������ ����
		String total = "";

		// '+' ������ ����ؼ� ���ڰ��� �ǽ�
		total = a + b;
		System.out.println("+ ������ : " + total); // helloworld ���ڿ��� ����Ǿ��ִ�

		// '+=' ���� ������ ����� ����ؼ� ���ڰ��� �ǽ�
		total = total + " java";
		System.out.println("+= ���Կ����� : " + total); // helloworld java ���ڿ��� ����Ǿ��ִ�

		// concat ����ؼ� ���ڰ��� �ǽ�
		System.out.println("concat : " + total.concat(" nice")); // helloworld java nice ���ڿ��� ����Ǿ��ִ�

	}// ���� ����
}
