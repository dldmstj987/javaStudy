package report;
/*--구구단 중 5단 출력--*/

public class Gugudan {

	public static void main(String[] args) {
		/*첫번째 방법*/
		int dan;
		int times;
		
		for(times=1; times<=9; times++) {
			for(dan = 2; dan <=9; dan++) {
				 System.out.printf("%dX%d=%-4d", dan, times, dan * times);
			} //가로, 세로로 출력: %dX%d=%-4d 가로로 출력
			System.out.println(); //한 줄 띄워서 출력	
		}
		
		/*두번째 방법*/
		int dan2;
		int times2;
		
		for(dan2 = 2; dan2 <= 9; dan2++) {
			if(dan2 == 5 || dan2 == 9) {
				for(times2 =1; times2 <= 9; times2++) {
					System.out.println(dan2 + "X" + times2 + "=" + dan2 * times2);
				}
				System.out.println();
			}
		}
		

	}

}
