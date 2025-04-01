package while_ex;
/*--구구단 중에 홀수단만 출력--
 * 홀수만 나오게 조건: dan % 2 == 1
 * 짝수만 나오게 하는 조건: dan % 2 == 0
 * */
public class Gugudan2 {

	public static void main(String[] args) {
		int dan; //정수 dan
		int times; //정수 times
		
		for(dan = 2; dan <=9; dan++) { //초기값이 2부터 시작. 2단부터 출력
			if(dan % 2 == 1) { // 홀수단만 내놓을려면 2로 나눴을 때 나머지가 1이 되는 조건
				for(times = 1; times <=9; times++) { //1부터 9까지 곱한다
					System.out.println(dan + "X" + times + "=" + dan * times);
				} // 2X1, 2X2 ..... 9X9
				System.out.println(); //한 줄 띄워서 출력
			}
		}

	}

}
