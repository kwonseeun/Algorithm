package Loof;

public class Star {
	public static void main(String[] args) {

		System.out.println("[삼각형 별찍기 - 이중 for문을 사용해서 삼각형 모양 별찍기 실시]");
		
		/*[설 명]
		 * 1. 부모 for문 i 변수 : 삼각형을 그리기 위한 가로 행을 선언합니다
		 * 2. 자식 for문 k 변수 : 삼각형을 그리기 위한 세로 열을 선언하고,
		 *                   실제 별모양을 표시합니다
		 * 3. 예 시  :i 변수값 1일 경우 첫번째 행을 출력하고 별 하나를 표시하고 줄을 바꿉니다.
		 *         i 변수값이 2일 경우 두번째 행을 출력하고 별 두개를 표시하고 줄을 바꿉니다.                   
		 */
		for(int i=1; i<=5; i++) { //부모 for 문
			for(int k=1; k<=i; k++) { //자식 for 문
				System.out.print("*"); //* 모양으로 가로로 붙여서 출력한다
			}
			System.out.println(""); //한개 행을 수행후 줄을 바꿔서 출력해주기 위함
		}
	}
}
