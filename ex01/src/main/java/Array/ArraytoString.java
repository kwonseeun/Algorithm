package Array;

import java.util.Arrays;

public class ArraytoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[�迭 ��� ���� ��� - for �ݺ���, Arrays.toString ����� �迭 ��� ���� ���]");
		
		//�ʱ� �迭 ���� �� ������ ����
		String arr[] = {"�ϳ�","��","��","��","�ټ�"};
		
		/*[for �ݺ��� ����]
		 * 1. �迭�� 0���� ���� ������ �ϹǷ� i ���� 0������ ������ �����մϴ�
		 * 2. �迭 0�������� / �迭 ��ü ���̱��� / ��ü ����Ѵ�
		 * 3. System.out.println �� ���پ� ���� ����ϰ�,
		 *    System.out.print �� ���������� ������ ����Ѵ�
		 */
		System.out.print("for ��� : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		/*[Arrays.toString �ݺ��� ����]
		 *  1. �迭�� 0���� ���� ������ �ϹǷ� i ���� 0������ ������ �����մϴ�

			2. �迭 0�������� / �迭 ��ü ���̱��� / ��ü ����Ѵ�
			
			3. System.out.println �� ���پ� ���� ����ϰ�,
			
			   System.out.print �� ���������� ������ ����Ѵ�
			
			4. �÷��� ������ ��ũ Arrays�� ����ؼ� �����ϰ� ��ü ����� ����Ѵ�
		 */
		System.out.println("Arrays ��� : "+Arrays.toString(arr));
		
		
	}

}
