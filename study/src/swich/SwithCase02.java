package swich;

public class SwithCase02 {

	public static void main(String[] args) {
		String medal = "Gold"; // medal 변수 값은 Gold
		
		//swith 문 시작
		switch (medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Siver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}

	}

}
