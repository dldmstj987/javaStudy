package study_java_ifelse;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		// 퀴즈쇼
		Scanner scanner = new Scanner(System.in);
		int score = 1; // 점수에 대한 변수
		
		//1번 문제
		System.out.println("문제1: 대한민국의 수도는?");
		System.out.print("정답을 입력하세요: ");
		String answer1 = scanner.nextLine(); //키보드로 입력한 값 중 line 부분만 읽어서 String 타입 변수에 저장
		
		if(answer1.equalsIgnoreCase("서울") || answer1.equalsIgnoreCase("seoul")) { //equalsIgnoreCase: 대소문자를 구별하지 않는 메소드
			System.out.println("정답입니다!");
			score++; //점수증가
		} else {
			System.out.println("X!!! 정답은 '서울'");
		}
		
		//2번문제
		System.out.println("\n문제2: 2+5 = ? ");
		System.out.print("정답을 입력하세요: ");
		int answer2 = scanner.nextInt();
		
		if(answer2 == 7) {
			System.out.println("정답입니다!!");
			score++;
		} else {
			System.out.println("X!! 정답은 '7'");
			score--;
		}
		
		//3번 문제
		System.out.println("\n문제 3: JAVA에서 변수를 선언할 때 사용하는 키워드는?");
		System.out.println("정답을 입력하세요: ");
		scanner.nextLine(); // 빈 문자열이 자동으로 입력된 것 처럼 동작하는 걸 방지
		String answer3 = scanner.nextLine();
		
		if(answer3.equalsIgnoreCase("int") || answer3.equalsIgnoreCase("double") || answer3.equalsIgnoreCase("String") ) {
			System.out.println("정답입니다");
			score++;
		} else {
			System.out.println("X!!! 정답은 'int', 'double', 'String'");
			score--;
		}
		
		//최종점수출력
		System.out.println("\n퀴즈종료! 당신의점수는" + score + "점입니다.");
		
		scanner.close();
	}

}
