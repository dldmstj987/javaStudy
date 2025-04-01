package scanner;

import java.util.Scanner; 

public class ScannerTest {

	public static void main(String[] args) {
		// scanner 설명
		Scanner sc = new Scanner(System.in); //sc주소.잠조
		/** 구분자 앞까지만 읽어드림 ※구분자(엔터, spacebar, 탭) 무시
		 * 정수 nextInt()
		 * 실수 nextDouble()
		 * 
		 * 단어 next() -> 이름 단어 입력 등
		 * nextLine() -> 한 줄 전체 문장, 한줄 설명 등
		 */
		
		System.out.print("입력한 단어는? >");
		//int i1 = sc.nextInt(); // (ex)10 입력한 정수를 받아주는 메소드
		//int i2 = sc.nextInt(); //3
		String n1 = sc.next();
		
		//System.out.println("i1 + i2 = " + (i1+i2));
		//System.out.println("i1 - i2 = " + (i1-i2));
		//System.out.println("i1 x i2 = " + i1*i2);
		//System.out.println("i1 / i2 = " + (i1/i2));
		System.out.println("입력한 단어는?" + n1);
		
		sc.close(); //scanner 종료
	}

}
