package scanner_test;

import java.util.Scanner;

public class Scanner_test {

	public static void main(String[] args) {
		// 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 >");
		String sex = sc.nextLine();
		
		System.out.print("나이를 입력하세요 > ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요 >");
		double tall = sc.nextDouble();
		
		System.out.print("이름 :" + name + "성별: " + sex + "나이: " + age + "키: " + tall + name+"반갑습니다" );
	}

}
