package String;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[toUpperCase, toLowerCase - ��ü ���� �빮��, �ҹ��� ���� �ǽ�]");

		// �ʱ� ����ڰ� ���Ե� ���� ���� �ǽ� (�빮��, �ҹ��� ȥ��)
		String data = "F7AE-f5wn";

		/*
		 * [�� ��] 1. toUpperCase - ��ü ��� �빮�ڷ� �������ݴϴ� 2. toLowerCase - ��ü ��� �ҹ��ڷ� �������ݴϴ�
		 */
		System.out.println("���� : " + data);
		System.out.println("�빮�� : " + data.toUpperCase());
		System.out.println("�ҹ��� : " + data.toLowerCase());

	}

}
