package Array;

import java.util.Arrays;

public class ArrayStream {

	public static void main(String[] args) {
	
System.out.println("[�ּҰ�(min), �ִ밪(max) - Arrays.stream ����� �ּҰ�(min), �ִ밪(max) ���ϱ�]");
		
		//�ʱ� �迭 ���� �� ������ ���� �ǽ�
		int arr[] = {1,2,3,4,5};
		
		/*[�� ��]
		 * 1. Arrays.stream �� ����ؼ� �����ϰ� �ּҰ� �� �ִ밪�� ���� �� �ִ�
		 * 2. [Arrays.stream(�迭).�޼ҵ�.��] �ǹ̷� �����͸� Ȯ���� �� �ִ�.
		 */
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("�ּҰ� : "+min);
		System.out.println("�ִ밪 : "+max);

	}

}
