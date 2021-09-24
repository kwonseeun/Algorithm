package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayasList {

	public static void main(String[] args) {
		System.out.println("[Arrays.asList : String �迭 ������ ��ü ���� �ǽ�]");

		String arr[] = { "�ϳ�", "��", "��", "��", "�ټ�" };
		System.out.println("���� : " + Arrays.toString(arr));

		/*
		 * [�� ��] 1. Arrays.asList�� ����ؼ� String �迭�� �ִ� �����͸� ��ü ������ �� �ִ� 2. ArrayList ��ü��
		 * ������ �� Arrays.asList�� ����ؼ� ��ü ���縦 �ǽ��Ѵ�
		 */
		ArrayList list = new ArrayList(Arrays.asList(arr));
		System.out.println("���� : " + list.toString());
		
		// 1. Arrays.asList�� ����ؼ� String �迭�� �ִ� �����͸� ��ü ������ �� �ִ�
		// 2. ArrayList ��ü�� ������ �� Arrays.asList�� ����ؼ� ��ü ���縦 �ǽ��Ѵ�
	}

}
