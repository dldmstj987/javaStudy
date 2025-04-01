package scanner;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("층을 입력하세요: ");
		int floor = scanner.nextInt();
		
		
		switch (floor) {
		case 1:
			System.out.println("1층입니다.");
			break;
		case 2:
			System.out.println("2층입니다");
			break;
		case 3:
			System.out.println("3층입니다");
			break;
		case 4:
			System.out.println("4층입니다.");
			break;
		case 5:
			System.out.println("5층입니다.");
			break;
		default:
			System.out.println("존재하지 않는 층입니다.");
		}
		scanner.close();
	}

}
