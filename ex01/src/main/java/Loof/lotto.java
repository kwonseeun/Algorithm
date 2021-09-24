package Loof;

import java.util.Arrays;
import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		System.out.println("[lotto �ζ� ���α׷� (���� ��ȣ ���� �� ��÷ Ȯ��) - Random(����)������ ����, while(true)�ζ� ��ȣ ����, for�� ��÷ Ȯ�� �ǽ�]");
		/*[�� ��]
		 * 1. �ζ� ��ȣ�� �� 6�� ��ȣ�� �����Ѵ�
		 * 2. 6�� ��ġ : 1�� / 5�� ��ġ : 2�� / 4�� ��ġ : 3�� / �׿� : �� ���� ���Ѵ�
		 * 3. Random ��ü�� ����ؼ� ���� ���� �������� �����Ѵ� (1 ~ 45 ���� ���� ���� ����)
		 * 4. while(true) ����ؼ� �ߺ����� ���� ������ �迭�� ����
		 * 5. for ���� ����ؼ� �ι迭 ��ġ �� ������ Ȯ���ϰ� ����� ���
		 * 6. ���� ���� - �Ϲ������� ���� for���� ����� ������ ���� �ζ� ��ȣ�� ������ �� ������,
		 *             while ���� ����ؼ� �ۼ�
		 */
		
		//�ζ� ��÷ ���� ��ȣ �迭�Դϴ� (�� 6�� �����ȣ�� ����)
		int lotto[] = {3, 5, 24, 32, 10, 9};
		System.out.println("�ζ� ��÷ ��ȣ : "+Arrays.toString(lotto));
		
		//���� �������� �����ϱ� ���� Random ��ü�� ����
		Random random = new Random();
		
		//random ���� �������� ���� �迭�� �������ݴϴ�
		int number[] = new int[6];
		Arrays.fill(number, 0); //�迭�� �ʱ� ��ü ������ 0�� ��� ����
		
		int idx = 0; //�迭 ���� ��ȣ�� �����ϱ� ���� �ε��� ������ ����
		while(true) { 
			int zero = 0; //0�� �ƴѰ��� ���������� ��� ����Ȱ����� Ȯ�� ���� ���� ����
			for(int i=0; i<number.length; i++) {
				if(number[i] == 0) { //�迭 �� ������ ��ü Ȯ�� �ϸ鼭 0 ���� ���� ��� zero ���� ����
					zero ++;
				}
			}
			//zero �������� ī��Ʈ�Ȱ� ���� ��� ���������� ���� ��� ���Ե� ���� Ȯ��
			if(zero <= 0) {				
				break; //while ���� ������ Ż��		
			}			
			else { //�迭�� ���� �������� �� �������� ���� ��� ����
				//���� ������ 1���� 45�������� ���� ������ ����
				int random_number = random.nextInt(45)+1;
				
				//�迭�� �������� ������ ���� �̹� ����Ǿ� ������ �ߺ��������� �ʱ����� �˻縦 �ǽ��մϴ�
				int check = 0;
				for(int k=0; k<number.length; k++) {
					if(number[k] == random_number) {
						check ++; //�迭 �� ������ ��ü Ȯ�� �ϸ鼭 ��ġ�ϴ� �������� ���� ��� check ���� ����
					}
				}
				
				//�̹� ����� ���� ���� ��� �迭�� �����͸� �����ŵ�ϴ�
				if(check <= 0) {
					number[idx] = random_number;
					idx ++; //������ �����ϱ� ���� �迭 �������� ������Ų �� �ٽ� while���� �ݺ��մϴ�
				}				
			}
		}//while �� ����
		
		System.out.println("����� �ζ� ��ȣ : "+Arrays.toString(number));
		
		int count = 0;
		for(int j=0; j<lotto.length; j++) { //�ζ� ���� �迭
			for(int h=0; h<number.length; h++) { //����� �ζ� ��ȣ �迭
				if(lotto[j] == number[h]) { 
					count ++; //����� �ζ� �迭 ���� �ζ� ���� �迭 ���̶� ������ ���� ��� count ����
				}
			}
		}
		
		System.out.println("���� ���� : "+count);
		
		if(count == 6) {
			System.out.println("��� : "+"1�� �Դϴ�");	
		}
		else if(count == 5) {
			System.out.println("��� : "+"2�� �Դϴ�");
		}
		else if(count == 4) {
			System.out.println("��� : "+"3�� �Դϴ�");
		}
		else {
			System.out.println("��� : "+"�� ... �Դϴ�");
		}

	}

}
