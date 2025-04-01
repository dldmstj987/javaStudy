package study_java_ifelse;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		if (age < 0 || age > 150) {
			System.out.println("잘못된 입력입니다.");
		} else if(age >= 0 && age <= 12) {
			System.out.println("어린이입니다");
		} else if(age >= 13 && age <= 18) {
			System.out.println("청소년입니다.");
		} else if(age >= 19 && age <= 64){
			System.out.println("성인입니다.");
		} else{
			System.out.println("노인입니다.");
		}
		scanner.close();
		
	}

}
