package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap01 {

	public static void main(String[] args) {
		System.out.println("[HashMap �ؽ��� - HashMap����� key, value ���·� ������ ����,����,����,��ȸ �ǽ�]");

		// hashmap ��ü�� �����մϴ� - (key,value) ���¸� ���� String ������ ���� �ǽ�
		HashMap<String, String> hashmap = new HashMap<String, String>();

		/*
		 * [�� ��]
		 *  1. put - ������ �߰� �� ����մϴ� (key, value ���� ����)
		 *  2. remove - Ư�� �����͸� ���� �� (������ key �Է�) 
		 *  3. replace - Ư�� �����͸� ���� �� ���(key, ������ value �Է�)
		 *  4. getƯ�� key�� value�� ��� ����մϴ� (key) 
		 *  5. entrySet - ��ü ��Ͽ��� ���� key, value�� ����� �� �ִ�.
		 */

		// hashmap�� �����͸� �߰��մϴ�
		hashmap.put("key1", "value1");
		hashmap.put("key2", "value2");
		hashmap.put("key3", "value3");
		System.out.println("�߰� ��� : " + hashmap.toString());

		// hashmap���� Ư�� �����͸� �����մϴ�
		hashmap.remove("key2");
		System.out.println("���� ��� : " + hashmap.toString());

		// hashmap���� Ư�� �����͸� �����մϴ�
		hashmap.replace("key3", "value33");
		System.out.println("���� ��� : " + hashmap.toString());

		// hashmap���� Ư�� key�� �����͸� ����մϴ�
		System.out.println("key1 �� : " + hashmap.get("key1"));

		// hashmap���� Ư�� key ���� ���Ե��� Ȯ���մϴ�
		System.out.println("key2 ���� : " + hashmap.containsKey("key2"));

		// hashmap���� ���� key���� value���� ����մϴ�
		for (Entry<String, String> elem : hashmap.entrySet()) {
			System.out.println("Ű - " + elem.getKey() + " �� - " + elem.getValue());
		}
	}

}
