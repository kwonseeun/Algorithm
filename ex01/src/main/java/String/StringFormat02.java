package String;

public class StringFormat02 {

	public static void main(String[] args) {
		System.out.println("[String.format ���ڿ� ���� ���� - �̸�,����,�÷�,���� ���� �����͸� ����� String.farmat ���� ����ϱ�]");

		// �ʱ� ����� ������ ���� ������ ����
		String name = "�Ǽ���";
		int age = 27;
		double eye = 1.532;
		int money = 10000;

		/*
		 * [�� ��]
		   1. %s - ���ڿ��� ǥ���ϰڴٴ� �ǹ�
		 * 2. %d - �������� ǥ���ϰڴٴ� �ǹ�
		 * 3. %.1f - �Ҽ� .(��)���� ������ 1�ڸ����� ����ϰڴ� �ǹ� (1.5 ���) 
		 * 4. %.2f - �Ҽ� .(��)���� ������ 2�ڸ����� ����ϰڴ� �ǹ� (1.53 ���)
		 * 5. %,d - �������� ȭ������� ǥ���ϰڴٴ� �ǹ�
		 */
		String info = String.format("�̸�:%s, ����:%d, �÷�:%.1f, ���� ����:%,d��", name, age, eye, money);

		System.out.println("���� - " + info);

	}

}
