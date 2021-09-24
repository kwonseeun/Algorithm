package Array;

import java.util.ArrayList;

public class HashSet {

	public static void main(String[] args) {
		System.out.println("[HashSet 배열 중복 데이터 제거 - HashSet 사용해 ArrayList 배열 중복 데이터 제거 실시]");
		
		//초기 ArrayList 선언 및 데이터 삽입 실시
		ArrayList list = new ArrayList();
		list.add("하나");
		list.add("둘");
		list.add("하나");		
		System.out.println("원본 : "+list.toString());
		
		/*[설 명]
		 * 1. Set : 중복된 데이터를 제거해준다
		 * 2. HashSet을 사용해 ArrayList에 포함된 중복 데이터를 제거할 수 있다
		 * 3. HashSet 객체 생성 시 ArrayList 배열을 삽입해 주면된다
		 * 4. 중복 제거된 값이 뒤쪽으로 다시 정렬된다		 
		 * */		
		HashSet hashset = new HashSet();
		System.out.println("중복 제거 : "+hashset.toString());			

	}

}
