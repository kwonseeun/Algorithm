package Array;

import java.util.ArrayList;

public class HashSet {

	public static void main(String[] args) {
		System.out.println("[HashSet �迭 �ߺ� ������ ���� - HashSet ����� ArrayList �迭 �ߺ� ������ ���� �ǽ�]");
		
		//�ʱ� ArrayList ���� �� ������ ���� �ǽ�
		ArrayList list = new ArrayList();
		list.add("�ϳ�");
		list.add("��");
		list.add("�ϳ�");		
		System.out.println("���� : "+list.toString());
		
		/*[�� ��]
		 * 1. Set : �ߺ��� �����͸� �������ش�
		 * 2. HashSet�� ����� ArrayList�� ���Ե� �ߺ� �����͸� ������ �� �ִ�
		 * 3. HashSet ��ü ���� �� ArrayList �迭�� ������ �ָ�ȴ�
		 * 4. �ߺ� ���ŵ� ���� �������� �ٽ� ���ĵȴ�		 
		 * */		
		HashSet hashset = new HashSet();
		System.out.println("�ߺ� ���� : "+hashset.toString());			

	}

}
