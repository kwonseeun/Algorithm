package String;

public class SubString {

	public static void main(String[] args) {
		System.out.println("[substring ���ڿ� �ڸ��� - ���ڿ� ���� �ڸ��� �� ���ڿ� ���� �ڸ��� �ǽ�]");

		// �ʱ� ���ڿ� ���� ����
		String data = "�ȳ��ϼ���";

		/*
		 * [�� ��]
			1. ���ڿ� �ε��� : ��(0) / ��(1) / ��(2) / ��(3) / ��(4)
		 *  2. substring(���� ���� �ε���,
		 * ���� ���� �ε��� ������) 3. substring(���� ���� �ε���)
		 */
		
		String range_data = data.substring(0, 2); // 0�������� 2���� ������ ��� ��, 0���� 1���� ����ϰڴ�
		String sub_data = data.substring(2); // 2����(����)���� ��� ����ϰڴ�

		System.out.println("���� [data] : " + data);
		System.out.println("���� [range_data] : " + range_data);
		System.out.println("���� [sub_data] : " + sub_data);

	}

}
