package String;

public class ReplaceAll {

	public static void main(String[] args) {
	
		System.out.println("[���� ���� ���� - replaceAll ����� ���� ���� ���� �ǽ�]");

        //�ʱ� ������ �����մϴ�
        String one = "h e l l o";
        System.out.println("�������� �� : "+one);

        /*[�� ��]
        * 1. ���� ������ ����� ����ؼ� �ٽ� �������ŵ� ���� �ִ´�.
        * 2. replaceAll("������ ����","��ȯ�� ����")
        * 3. " " ������  "" �������شٴ� �ǹ�.
        */
        one = one.replaceAll(" ",""); // �����ҹ���, ��ȯ�� ����
        System.out.println("�������� �� : "+one);
	}

}
