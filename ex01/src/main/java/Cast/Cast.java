package Cast;

public class Cast {

	public static void main(String[] args) {
		System.out.println("[Integer.parseInt, Integer.toString ������ ����ȯ - string to int, int to string �� ������ ����ȯ �ǽ�]");

		// �ʱ� String, int ���� ����
		String str_data = "10";
		int int_data = 20;

		// String ������ str_data�� int�� ����ȯ �ǽ�
		int int_total = int_data + Integer.parseInt(str_data);

		// int ������ int_data�� String�� ����ȯ �ǽ�
		String str_total = Integer.toString(int_data) + str_data;

		/*
		 * [�� ��] 1. int ������ (+) ��ȣ : ��Ģ���� ���� �ǽ� 2. String ������ (+) ��ȣ : ���ڿ� ������ �ǽ� 3.
		 * string to int �� ������ ����ȯ�� �����ϱ� ���ؼ��� �ݵ�� ���� ���·� �� �����Ϳ��� �մϴ� (Ư������, ����, �ѱ� ��
		 * ���ԵǸ� �ȵ�)
		 */
		System.out.println("int : " + int_total);
		System.out.println("String : " + str_total);

	}

}
