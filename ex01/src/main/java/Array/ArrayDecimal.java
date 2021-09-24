package Array;

import java.util.ArrayList;

public class ArrayDecimal {

	public static void main(String[] args) {
System.out.println("[소수 구하기 - 이중 for문을 사용해 1부터 10까지 소수구하기]");
		
		//소수값을 담기위한 배열 선언
		ArrayList list = new ArrayList();
		
		//소수여부를 확인하기 위해 변수선언
		int check = 0;
		
		/*[설 명]
		 * 1. 소수란 ? 약수가 1과 자기 자신 뿐인 1보다 큰 자연수이다
		 * 2. 소수는 2부터 시작을한다
		 * 3. 부모 for문 i값 변수에 구하려는 소수 범위값을 지정한다
		 * 4. 자식 for문 k값을 사용해 부모i값과 나누기를 수행 후 정상적으로 
		 *    0값으로 나누어 떨어질 경우 check 값을 증가시킨다 
		 * 5. 소수는 1과 자기 자신만 나누어떨어져야하므로 부모 for문에서 나누어 떨어진 횟수가 1일 경우 소수로 판단한다   
		 */		
		for(int i=2; i<=10; i++) { //부모 for문     3
			for(int k=2; k<=i; k++) { //자식 for문     3 
				if(i%k == 0) { //나누기 몫이 0이면 check 값을 증가시킨다
					check ++;
				}
			}//자식 for문 종료
			
			if(check == 1) { //소수는 1과 자기 자신만 나누어떨어져야하므로 나누어 떨어진 횟수가 1일 경우 소수로 판단
				list.add(i);
				check = 0; //변수 재정의 실시 (다시 부모 for문 반복수행 위함)
			}
			else {
				check = 0; //변수 재정의 실시 (다시 부모 for문 반복수행 위함)
			}
		}//부모 for문 종료
		
		System.out.println("1부터 10까지 소수 : "+list.toString());

	}

}
