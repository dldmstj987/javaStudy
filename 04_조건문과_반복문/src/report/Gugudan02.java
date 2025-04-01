package report;
/*
 * 25.04.01 과제
 * 2~9단 구구단 옆으로 출력 (중첩 반복문 사용o) + 몇단 출력
 * [format: 출력서식]
 * boolean 형식 [true/false]
 */

public class Gugudan02 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++) {
			System.out.println("★"+dan+"단 시작★");
			for(times=1; times<=9; times++) {
				String result = String.format("%dX%d=%-4d", dan, times, dan * times);
				System.out.print(result);
			} //가로, 세로로 출력: %dX%d=%-4d
			System.out.println(); //한 줄 띄워서 출력	
			System.out.println("---------------------------------------------------------------------------------");
		}
	}

}
/*
 * %d: 정수 출력(첫번째: dan)
 * X: 문자 X 출력
 * %d: 정수 출력(두번째 : times)
 * %-4d: 정수 출력(dan * times), 왼쪽 정렬 + 4칸 확보
 *
 */
