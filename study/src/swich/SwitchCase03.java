package swich;

public class SwitchCase03 {

	public static void main(String[] args) {
		String medal = "Gold"; //메달 변수 값 Gold
		
		switch (medal) {
		case "Gold" -> System.out.println("금메달입니다.");
		case "Siver" -> System.out.println("은메달입니다.");
		case "Bronze" -> System.out.println("동메달입니다.");
		default -> System.out.println("메달이 없습니다.");
		}
	}

}
