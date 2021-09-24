package Cast;

public class Cast02 {

	public static void main(String[] args) {
		System.out.println("[valueOf ��ü ����ȯ - String, Integer, Double valueOf�� ��ü ����ȯ �ǽ�]");

		// �ʱ� ���� ���� �ǽ�
		String s_value = "10";
		int i_value = 20;
		double d_value = 30.0;

		/*
		 * [�� ��]
		 * 1. String.valueOf - ���ڿ� ���·� �����Ͱ� ����
		 * 2. Integer.valueOf - ���� ���·� �����Ͱ� ����
		 * 3. Double.valueOf - �Ǽ� ���·� �����Ͱ� ����˴ϴ�
		 */
		System.out.println("string [int] : " + String.valueOf(i_value));
		
		System.out.println("string [double] : " + String.valueOf(d_value));

		System.out.println("int [string] : " + Integer.valueOf(s_value));

		System.out.println("double [string] : " + Double.valueOf(s_value));
		
		System.out.println("double [int] : " + Double.valueOf(i_value));

	}

}
