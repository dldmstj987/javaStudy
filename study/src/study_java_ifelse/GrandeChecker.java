package study_java_ifelse;
import java.util.Scanner;

public class GrandeChecker {

	public static void main(String[] args) {
		/*
		 * 성적을 입력하면 등급이 나오는 if-else문
		 * scanner를 이용한다
		 * if-else문을 쓴다
		 */
		Scanner scanner = new Scanner(System.in); //사용자의 입력을 받기 위한 객체
		
		//사용자의 성적을 입력 받는 부분
		System.out.print("성적을 입력하세요: ");
		int score = scanner.nextInt(); //사용자로 부터 점수를 입력받는 역할
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수입니다. 0부터 100 사이의 값만 입력하세요");
		} else if(score >= 90) {
			System.out.println("해당학생의 점수는 A입니다. 칭찬해주세요");
		} else if(score >= 80) {
			System.out.println("해당학생의 점수는 B입니다. 나쁘지 않은 학생입니다");
		} else if(score >= 70) {
			System.out.println("해당학생의 점수는 C입니다. 애매한 학생입니다");
		} else if(score >= 60) {
			System.out.println("해당학생의 점수는 D입니다. F를 주고 싶지만 애써 참고 보내는 학생입니다.");
		} else {
			System.out.println("해당학생의 점수는 F입니다. 수업을 재수강하게 하세요");
		}
		
		//Scanner 닫기
		scanner.close();

	}

}
