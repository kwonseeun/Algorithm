package String;

public class CharAt {

	public static void main(String[] args) {
		System.out.println("[charAt Ư�� ��ġ ���� ���� - charAt�� ����ؼ� �ѱ��ھ� ���ڿ� �и��ϱ�]");

		// �ʱ� ���� ���� �ǽ�
		String data = "�Ǽ���";

		/*
		 * [�� ��] 1. charAt(�ε���) ����ؼ� Ư�� ��ġ ���ڿ��� ����� �� �ֽ��ϴ� 2. ���ڿ��� 0������ �ε����� ���۵˴ϴ� 
		 * /��(0)  ��(1) / ��(2)
		 */
		for (int i = 0; i < data.length(); i++) { // ���ڿ� ���̱��� �ݺ��մϴ�
			System.out.println(i + "���� : " + data.charAt(i));
		}
	}

}
