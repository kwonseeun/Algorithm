package String;

import java.util.Arrays;

public class CharacterIsDight {

	public static void main(String[] args) {
System.out.println("[Character.isDigit ���� �� ���� ���� Ȯ��]");
		
		//���� �� ���� ���θ� Ȯ���� �ʱ� ���� ����
		String data = "5��3��hi";
		
		//���ڿ��� �ѱ��ھ� �ڸ� ���·� char �迭�� �����͸� ��´�
		char arr[] = data.toCharArray();		
		System.out.println("���� : "+Arrays.toString(arr));
		
		/*[�� ��]
		 * 1. Character.isDigit �� ����� �������� �������� Ȯ��
		 * 2. true�� �� ��� �����̸�, false�� �� ��� ����
		 */
		for(int i=0; i<arr.length; i++) {
			if(Character.isDigit(arr[i]) == true) {
				System.out.println(arr[i]+" : "+"����");
			}
			else {
				System.out.println(arr[i]+" : "+"����");
			}
		}

	}

}
