package Array;

import java.util.Arrays;

public class ArraytoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[배열 목록 순차 출력 - for 반복문, Arrays.toString 사용해 배열 목록 순차 출력]");
		
		//초기 배열 선언 및 데이터 생성
		String arr[] = {"하나","둘","셋","넷","다섯"};
		
		/*[for 반복문 설명]
		 * 1. 배열은 0번지 부터 시작을 하므로 i 값을 0번지로 시작을 설정합니다
		 * 2. 배열 0번지부터 / 배열 전체 길이까지 / 전체 출력한다
		 * 3. System.out.println 은 한줄씩 행을 출력하고,
		 *    System.out.print 는 순차적으로 옆으로 출력한다
		 */
		System.out.print("for 목록 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		/*[Arrays.toString 반복문 설명]
		 *  1. 배열은 0번지 부터 시작을 하므로 i 값을 0번지로 시작을 설정합니다

			2. 배열 0번지부터 / 배열 전체 길이까지 / 전체 출력한다
			
			3. System.out.println 은 한줄씩 행을 출력하고,
			
			   System.out.print 는 순차적으로 옆으로 출력한다
			
			4. 컬렉션 프레임 워크 Arrays를 사용해서 간편하게 전체 목록을 출력한다
		 */
		System.out.println("Arrays 목록 : "+Arrays.toString(arr));
		
		
	}

}
