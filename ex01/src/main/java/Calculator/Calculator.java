package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("[if, else�� �̿��Ͽ� ���� ���α׷� �����");
		
		/*[�� ��]
		 * 1. scanner : ����ڷκ��� Ű���� �Է��� �޽��ϴ�
		 * 2. equals : ����ڰ� �Է��� ��ȣ���� +,-,*,/ �� ������ Ȯ���մϴ�
		 * */
		
		//ù��°�� �ι�° ���� ���� ���� ���� ����
		int one = 0; 		
		int two = 0;
		
		//��Ģ���� ��ȣ�� ���� ���� ���� �ǽ�
		String sign = "";
		
		//����ڷκ��� Ű���� �Է��� �ޱ� ���� scanner ��ü ���� �ǽ�
		Scanner scan = new Scanner(System.in);
		
		//����ڷκ��� �������� ������ ��ȣ���� �Է¹޽��ϴ�
		System.out.print("ù��° �� : ");
		one = scan.nextInt();
		
		System.out.print("�ι�° �� : ");
		two = scan.nextInt();
		
		System.out.print("��Ģ�����ȣ (+,-,*,/) : ");
		sign = scan.next();
		
		//if ���� ����ؼ� ����ڰ� �Է��� ��Ģ���� ��ȣ�� �°� ���� ���� �ǽ�
		if(sign.equals("+")) {
			System.out.println(one+"+"+two+"="+(one+two));
		}
		else if(sign.equals("-")) {
			System.out.println(one+"-"+two+"="+(one-two));
		}
		else if(sign.equals("*")) {
			System.out.println(one+"*"+two+"="+(one*two));
		}
		else if(sign.equals("/")) {
			System.out.println(one+"/"+two+"="+(one/two));
		}
		else {
			System.out.println("�˼����� �������Դϴ� ... ");
		}
				
	}//���� ����

}//Ŭ���� ����

