package Array;

import java.util.Arrays;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		System.out.println("[�迭 ���� - Arrays.copyOfRange ����� �迭 ���� �ǽ�]");

		// �ʱ� �迭 ���� �� ������ ����
		int one[] = { 1, 2, 3, 4, 5 };
		System.out.println("���� �迭 : " + Arrays.toString(one));

		/*
		 * [�� ��] 1. Arrays.copyOfRange(������ �迭, ���������ġ, ����������ġ) 2. one �迭�� / 0�������� /
		 * one.length �迭 ���̱��� ��ü ���縦 �����ϰڴ�
		 */
		int two[] = Arrays.copyOfRange(one, 0, one.length);
		System.out.println("���� �迭 : " + Arrays.toString(two)); //"toString" �޼���� ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
	}

}
