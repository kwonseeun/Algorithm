package Calculator;

import java.util.ArrayList;

public class Measure {

	public static void main(String[] args) {
		System.out.println("[������ϱ� - for�� ����ؼ� ������ϱ� �ǽ�]");

		// ����� ���Ϸ��� �ʱ� ���� ����
		int data = 8;

		// ��� ���� �������� �迭 ����
		ArrayList list = new ArrayList();

		/*
		 * [�� ��] 1. �����? � ���� �������� �� ����������� �ϴ� �ڿ����Դϴ�
		 */
		for (int i = 1; i <= data; i++) { // 2,3,4,5,6,7,8
			if ((data % i) == 0) { // �������� 0���� ���������� Ȯ���Ѵ�
				list.add(i);
			}
		}

		System.out.println(data + "��� : " + list.toString());
	}

}
