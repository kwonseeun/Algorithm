package String;

public class StringFormat {

	public static void main(String[] args) {
		System.out.println("[ȭ��(��)����ǥ�� - String.format����� ȭ����� �޸� ǥ�� �ǽ�]");

		// �ʱ� ���� ����
		int money = 10000;

		/*
		 * [�� ��] 1. String.format �� ����ؼ� ���ϴ� ������ ���ڿ��� ���� �� �ִ� 2. %,(�޸�)d - ȭ������� ��������
		 * ǥ���ϰڴٴ� �ǹ��̴�
		 */
		String format = String.format("%,d", money);

		System.out.println("���� : " + money);
		System.out.println("���� : " + format);

	}

}
