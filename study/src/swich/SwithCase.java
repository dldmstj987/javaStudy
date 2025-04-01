package swich;

public class SwithCase {

	public static void main(String[] args) {
		int ranking = 1; //ranking 값은 1
		char medalColor; //메달 색깔 변수
		
		switch (ranking) {
		case 1: medalColor = 'G'; // ranking 값이 1이면 금메달
			break;
		case 2: medalColor = 'S'; //ranking 값이 2이면 은메달
			break; 
		case 3: medalColor = 'B'; // ranking 값이 3이면 동메달
			break;
		default: 
			medalColor = 'A'; // 선수가 순위에 들지 못하면 'A'값을 반환
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
		// 1등 메달의 색깔은 G입니다.
	}
}
