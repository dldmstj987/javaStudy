package scanner;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		/*
		 * [문제]: 음수(0보다 작은 수를)를 양수 바꾸기
		 * 키보드로 입력 받은 정수값을 양수는 그대로 출력 음수는 양수로 변환시켜 출력(scanner사용)
		 * 
		 * */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("입력한 숫자의 값은 : \t" + num + "\n 양수 입니다.");
		} else if(num < 0){
			System.out.println("입력한 숫자의 값은 : \t" + (-num) + "\n음수를 양수로 변환 시켰습니다."); //음수를 양수로 변환
		} else {
			System.out.println("입력한 숫자는 0입니다.");
		}
		scanner.close();

	}

}
