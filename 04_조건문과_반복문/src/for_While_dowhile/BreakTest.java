package for_While_dowhile;
/*
 * 1부터 1씩 증가하는 수를 더하다가 '10을 초과'하는 최초의 정수값을 알아보기
 */

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;            // 반복에 사용할 변수 i 선언
		int hap = 0;      // 누적합을 저장할 변수 hap 초기화

		// i를 1부터 시작해 1씩 증가시키며 무한 반복
		for(i = 1; true; i++) {
			hap = hap + i;  // 현재 i 값을 hap에 더함
			/*
			 * 0+1 = 1 i=1
			 * 1+2 = 3 i=2
			 * 3+3 = 6 i=3
			 * 6+4 = 10 i=4
			 * 10+5 = 15 break;
			 */

			// 누적합이 10을 초과하면 반복문 종료
			if(hap > 10) {
				break;
			}

			// 누적합이 10 이하일 경우 현재 i 값 출력
			System.out.println(i);
			
			System.out.println("----- while문 버전 -----");

			// ======= while문 버전 =======
			i = 1;
			hap = 0;

			while(true) {
				hap = hap + i;

				if(hap > 10) {
					break;
				}

				System.out.println(i);
				i++;
			}
			System.out.println("----- do-while문 버전 -----");

			// ======= do-while문 버전 =======
			i = 1;
			hap = 0;

			do {
				hap = hap + i;

				if(hap > 10) {
					break;
				}

				System.out.println(i);
				i++;
			} while(true);
		}
	}
}
	

