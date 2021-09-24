package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimplDateFormat {

	public static void main(String[] args) {
		System.out.println("[SimpleDateFormat ��¥ ���� ��� - ���� ��¥,�ð�,���� Ȯ�� �ǽ�]");

		/*
		 * [�� ��] 1. System.currentTimeMillis() ����ؼ� long Ÿ�� ��¥ �����͸� ���� 2.
		 * SimpleDateFormat �� ����ؼ� ����ϰ����ϴ� ��¥ �� �ð�, ���� ���¸� ���� - yyyy : ���� - MM :
		 * �� - dd : ��¥ - hh : �ð� (�Ϲ�) - kk : �ð� (24�� ����) - mm : �� - ss : �� - E : ���� 3.
		 * �޼ҵ带 ȣ���ؼ� String ���ڿ� ���� return ������ ��ȯ���� ���� �� �ִ�.
		 */
		System.out.println("�Ϲ� ���� ��¥ �� �ð� : " + NowDateTime()); // �޼ҵ� ȣ��
		System.out.println("24�� ���� ��¥ �� �ð� : " + NowDateTime24()); // �޼ҵ� ȣ��

	}// ���� ����

	// ==== [�Ϲ� ���� ��¥ �� �ð� �˾ƿ��� �޼ҵ�] ====
	public static String NowDateTime() {
		// long Ÿ������ System.currentTimeMillis() �����͸� �޾ƾ� �Ѵ�
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss E����");
		String str = dayTime.format(new Date(time));
		return str; // return�� �޼ҵ� ȣ�� �� �����͸� ��ȯ.
	}

	// ==== [24�� ���� ���� ��¥ �� �ð� �˾ƿ��� �޼ҵ�] ====
	public static String NowDateTime24() {
		// long Ÿ������ System.currentTimeMillis() �����͸� �޾ƾ� �Ѵ�
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy.MM.dd kk:mm:ss E����");
		String str = dayTime.format(new Date(time));
		return str; // return�� �޼ҵ� ȣ�� �� �����͸� ��ȯ.

	}

}
