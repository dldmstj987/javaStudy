package ifswitch;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		/*97을 그대로 받았을 때 대문자 A 출력*/
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트-6");
		System.out.print("당신이 입력한 정수에 해당하는 문자를 대문자로 표현하면(97~100)?");
		int num1 = sc.nextInt();
		char ch = (char) num1; //형변환
		
		switch(ch) {
		case 'a' -> System.out.println("입력하신 정수는"+ (char)(num1-32)+"입니다");
		case 'b' -> System.out.println("입력하신 정수는" + (char)(num1-32)+ "입니다");
		default -> System.out.println("A와 B에 해당하는 정수가 아닙니다.");
		}
		sc.close();
	}

}
