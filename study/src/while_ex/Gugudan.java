package while_ex;

public class Gugudan {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) { //순서 1: 초기값 2로 시작해서 9까지 반복 2에서 1씩 증가한다.
			for(times =1; times <= 9; times++) { 
				System.out.println(dan + "X" + times + "=" + dan * times);
			} //내부 반복문
			System.out.println(); //한 줄 띄워서 출력	
		}
		
	}
}
