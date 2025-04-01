package forex;

public class BasicFor {

	public static void main(String[] args) {
		/*-- 1. 반복문을 사용 안하면 --*/
		System.out.println("지금 이 순간 최선을...");
		System.out.println("지금 이 순간 최선을...");
		System.out.println("지금 이 순간 최선을...");
		System.out.println("지금 이 순간 최선을...");
		System.out.println("지금 이 순간 최선을...");
		
		System.out.println(); // 구분 위한 빈 줄
		
		/*
		 * 반복문
		 * for(초기화식; 조건문; 증감식){
		 *  조건문이 참이면 => 반복할 실행문 실행;
		 * } 조건문이 거짓이면 => 반복문을 빠져나옴
		 * for문만 조건문 생략 가능 => 무한 루프 (조건 생략 시 true 간주)
		 */
		
		// i를 for문 밖에서 선언하면, for문 종료 후에도 사용할 수 있음
		int i;
		for(i = 10; i >= 1; i -= 2) {
			System.out.println("지금 이 순간 최선을...");
		}
		System.out.println("거짓 = " + i); // i는 반복 끝나고 -1이 됨
	}
}
