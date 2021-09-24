package Array;

import java.util.Arrays;

public class ArrayStream {

	public static void main(String[] args) {
	
System.out.println("[최소값(min), 최대값(max) - Arrays.stream 사용해 최소값(min), 최대값(max) 구하기]");
		
		//초기 배열 선언 및 데이터 생성 실시
		int arr[] = {1,2,3,4,5};
		
		/*[설 명]
		 * 1. Arrays.stream 을 사용해서 간편하게 최소값 및 최대값을 구할 수 있다
		 * 2. [Arrays.stream(배열).메소드.값] 의미로 데이터를 확인할 수 있다.
		 */
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);

	}

}
