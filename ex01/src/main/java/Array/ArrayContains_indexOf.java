package Array;

import java.util.ArrayList;

public class ArrayContains_indexOf {

	public static void main(String[] args) {
		System.out.println("[ArrayList contains, indexOf - �迭�� Ư�� �� ���� ���� Ȯ�� �� ��ġ Ȯ��]");

		// �ʱ� ArrayList ���� �� ������ ����
		ArrayList list = new ArrayList();
		list.add("�ϳ�");
		list.add("��");
		list.add("��");

		// contains �޼ҵ�� ������ ���� ���θ� true, false�� �������ش�
		boolean two = list.contains("��");
		boolean three = list.contains("��");
		boolean four = list.contains("��");

		System.out.println("[��] ���� ���� : " + two);
		System.out.println("[��] ���� ���� : " + three);
		System.out.println("[��] ���� ���� : " + four);

		if (two == true) { // �� - ������ ���� �� ��ġȮ�� �ǽ�
			int idx = list.indexOf("��"); // indexOf �޼ҵ�� ������ �������� ���������� �������ش�
			int idx2 = list.indexOf("��");
			System.out.println("[��] ��ġ Ȯ�� : " + idx);
			System.out.println("[��] ��ġ Ȯ�� : " + idx2);
			System.out.println("[��] ������ Ȯ�� : " + list.get(idx));
			System.out.println("[��] ������ Ȯ�� : " + list.get(idx2));
		} else {
			System.out.println("[��] ��ġ Ȯ�� : " + "�����Ͱ� �����ϴ�");
		}

	}

}
