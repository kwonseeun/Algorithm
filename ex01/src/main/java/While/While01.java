package While;

public class While01 {

	public static void main(String[] args) {

		System.out.println("[while (true) ���ѷ��� - while true ����� Ư�� ���� ���� �� ���ѷ��� �����ϱ�]");

		// while������ ����� ���� ����
		int count = 1;

		/*
		 * [�� ��] 1. while (true) : ���ѷ���(���) ���α׷��� �ݺ������� �����Ѵ� 2. break : 'Ż��' �������� Ư�� ������
		 * ���� �� ���ѷ����� Ż���ϱ� ���� ����Ѵ�
		 */
		while (true) {
			if (count >= 5) { // if ���� count �������� 5���� ũ�ų� ���� ��� ���� ����
				System.out.println("ī��Ʈ [" + count + "]");
				System.out.println("[���α׷��� �����մϴ�]");
				break; // while true ���ѷ����� Ż���Ѵ�
			} else { // 5���� ũ�ų� ���� ���� ��� ���� ����
				System.out.println("ī��Ʈ [" + count + "]");
				count++; // ���� �����ڸ� ����� count �������� ������Ų��
			}
		}

	}

}
