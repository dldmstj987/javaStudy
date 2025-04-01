package ifswitch;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		/*97을 그대로 받았을 때 대문자 A 출력*/
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트-6");
		System.out.print("당신이 입력한 정수에 해당하는 문자를 대문자로 표현하면(97~100)?");
		int num1 = sc.nextInt();
		char ch = (char) num1; //형변환
		 switch (ch) {
         case 'a': // 소문자 a 각각 아스키 코드 97을 입력하면 case a로 매칭
        	 System.out.println("입력하신 정수는 문자 " + Character.toUpperCase(ch) + "입니다.");
             break;
         case 'b': // 소문자 a 각각 아스키 코드 98을 입력하면 case b로 매칭
        	 System.out.println("입력하신 정수는 문자 " + Character.toUpperCase(ch) + "입니다.");
             break;
         default: // 그 외의 숫자를 입력했을 때 나오는 값
             System.out.println("문자 A, B 이외의 문자입니다.");
             break;
     }
		 sc.close();

	}

}
