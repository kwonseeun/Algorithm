package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap01 {

	public static void main(String[] args) {
		System.out.println("[HashMap 해쉬맵 - HashMap사용해 key, value 형태로 데이터 저장,수정,삭제,조회 실시]");

		// hashmap 객체를 생성합니다 - (key,value) 형태를 각각 String 형으로 정의 실시
		HashMap<String, String> hashmap = new HashMap<String, String>();

		/*
		 * [설 명]
		 *  1. put - 데이터 추가 시 사용합니다 (key, value 형태 저장)
		 *  2. remove - 특정 데이터를 삭제 시 (삭제할 key 입력) 
		 *  3. replace - 특정 데이터를 수정 시 사용(key, 수정할 value 입력)
		 *  4. get특정 key값 value를 출력 사용합니다 (key) 
		 *  5. entrySet - 전체 목록에서 각각 key, value를 출력할 수 있다.
		 */

		// hashmap에 데이터를 추가합니다
		hashmap.put("key1", "value1");
		hashmap.put("key2", "value2");
		hashmap.put("key3", "value3");
		System.out.println("추가 목록 : " + hashmap.toString());

		// hashmap에서 특정 데이터를 삭제합니다
		hashmap.remove("key2");
		System.out.println("삭제 목록 : " + hashmap.toString());

		// hashmap에서 특정 데이터를 수정합니다
		hashmap.replace("key3", "value33");
		System.out.println("수정 목록 : " + hashmap.toString());

		// hashmap에서 특정 key값 데이터를 출력합니다
		System.out.println("key1 값 : " + hashmap.get("key1"));

		// hashmap에서 특정 key 값이 포함된지 확인합니다
		System.out.println("key2 포함 : " + hashmap.containsKey("key2"));

		// hashmap에서 각각 key값과 value값을 출력합니다
		for (Entry<String, String> elem : hashmap.entrySet()) {
			System.out.println("키 - " + elem.getKey() + " 값 - " + elem.getValue());
		}
	}

}
