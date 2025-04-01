package scanner;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = scanner.nextInt();
		int num2 = 0;

		if (num >= 0) { // 0 이상이면 그대로 저장
			num2 = num;
		} else { // 음수일 경우 Math.abs()를 사용하여 양수로 변환
			num2 = Math.abs(num);
		}

		System.out.println("입력한 정수는 > " + num);// 원래 입력한 수 출력
		System.out.println("출력할 값은 > " + num2);// 변환된 값 또는 그대로인 값을 출력

		scanner.close();
		}
	}


