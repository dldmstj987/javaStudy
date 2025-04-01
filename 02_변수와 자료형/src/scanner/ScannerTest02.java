package scanner;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {//메서드()		
		Scanner sc = new Scanner(System.in);//sc주소.참조
		
		/** 구분자 앞까지만 읽어들임 ※구분자(엔터, SP, 탭) 무시
		 * 정수 nextInt() 
		 * 실수 nextDouble()
		 * 
		 * 단어 next()
		 *  (ex)안녕 여러분 반가워요~엔터 => "안녕" String(문자열)객체
		 */
		System.out.print("두 정수 입력 >");
		int i1 = sc.nextInt();//10
		int i2 = sc.nextInt();//3
		
		System.out.println(i1 + "+" + i2 + "=" + (i1+i2));
		System.out.println(i1 + "-" + i2 + "=" + (i1-i2));
		System.out.println(i1 + "X" + i2 + "=" + i1*i2);
		System.out.println(i1 + "/" + i2 + "=" + (double)i1/i2);//강제10.0/자동3.0=>실수3.3333...

		System.out.println(i1 + "/" + i2 + "=" + (double)(i1/i2));//3 -> 강제3.0
		
		System.out.print("두 단어 입력 >");//행복 평화 건강엔터
		String n1 = sc.next();//n1 : 주소
		String n2 = sc.next();
		System.out.println(n1 + "," + n2);//★★★주소만.자동toString()
		System.out.println(n1.toString() + "," + n2.toString());
	}

}
