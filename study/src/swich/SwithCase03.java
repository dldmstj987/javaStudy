package swich;

public class SwithCase03 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		String message = switch(medal) {
		case "Gold" -> "금메달입니다.";
		case "Siver" -> "은메달입니다.";
		case "Bronze" -> "동메달입니다.";
		default -> "메달이 없습니다.";
		};
		System.out.println(message);
	}
}
