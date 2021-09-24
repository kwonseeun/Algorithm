package Math;

public class MaxMin {

	public static void main(String[] args) {
		System.out.println("[Math ���а��� - �Ҽ��� �ݿø�, ���밪, max �ִ밪, min �ּҰ� Ȯ��]");

		// �ʱ� ������ �������ݴϴ�
		int i_one = 10;
		int i_two = 20;
		int i_three = -30;

		double d_value = 123.4563;

		/*
		 * [�� ��]
		 * 1. max - �ΰ��� ���ؼ� �� ū���� ���
		 * 2. min - �ΰ��� ���ؼ� �� �������� ���
		 * 3. abs - ���밪�� ���
		 * 4. round - �Ҽ����� �ݿø��ؼ� ��� (10 - �Ҽ��� 1�ڸ� ����ϴµ� �ݿø��ϰڴٴ� �ǹ�)
		 * (100 - �Ҽ��� 2�ڸ� ����ϴµ� �ݿø��ϰڴٴ� �ǹ�)
		 * (1000 - �Ҽ��� 3�ڸ� ����ϴµ� �ݿø��ϰڴٴ� �ǹ�)
		 */
		System.out.println("�ִ밪 : " + Math.max(i_one, i_two));
		System.out.println("�ּҰ� : " + Math.min(i_one, i_two));
		System.out.println("���밪 : " + Math.abs(i_three));

		System.out.println("�Ҽ��� 1�ڸ� �ݿø� : " + Math.round(d_value * 10) / 10.0);
		System.out.println("�Ҽ��� 2�ڸ� �ݿø� : " + Math.round(d_value * 100) / 100.0);
		System.out.println("�Ҽ��� 3�ڸ� �ݿø� : " + Math.round(d_value * 1000) / 1000.0);

	}

}
