package Loof;

public class If_MaxMin {

	public static void main(String[] args) {
		System.out.println("[if ���ǹ� - if���� ����� �� ������ �� �� �ִ밪, �ּҰ� ����ϱ�]");

		// �ʱ� ������ ���� ���� �� �ִ밪, �ּҰ��� ��� ���� ���� ����
		int one = 30;
		int two = 10;

		int max = 0;
		int min = 0;

		/*
		 * [�� ��]
		 *  1. �� ������ >= �ǹ� - ũ�ų� ���� ���� ���
		 *  2. if ������ �˻� �� ���� �� if�� { } �� ������ �����ϰ�, else �������� ���� �� else �� { } �� ������ �����մϴ�
		 */
		
		if (one >= two) { // one �������� two ���������� ũ�ų� ���� ���
			max = one; // max ������ one ��������
			min = two; // min ������ two ��������
		} else {
			max = two;
			min = one;
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

}
