package String;

public class Split {

	public static void main(String[] args) {
		System.out.println("[split ���ڿ� �и� - Ư�������� ,(�޸�) �������� ���ڿ� �и� �ǽ�]");

		// �޸��� �����ϰ� �ִ� �ʱ� ���ڿ� ����
		String data = "�ȳ�,�ϼ���,�ݰ����ϴ�";

		// ���ڿ��� ���Ե� �޸� ������ Ȯ���ϱ� ���� ���� ����
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == ',') { // ���ڿ�.charAt �ѱ��ھ� �߶� ,(�޸�) ���� Ȯ���Ѵ�
				count++;
			}
		}

		// ���ڿ��� �޸��� ������ �Ǿ����� ��� split ����� �и��Ѵ�
		if (count > 0) {
			for (int j = 0; j <= count; j++) { // �޸��� ���Ե� [����]���� ���ڿ��� �и���Ų��
				System.out.println("�޸� : " + data.split("[,]")[j]);
			}
		} else {
			System.out.println("�޸� : " + "�����ϴ�");
		}

	}

}
