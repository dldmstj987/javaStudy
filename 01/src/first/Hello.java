/**클래스명은 무조건 대문자로 시작
 * 패키지: 소문자
 * 패키지명은 url을 뒤집어서 고유하게 관리한다.
 * ex) com.java.yun처럼 3레벨이상 사용는 것이 좋다.
 * 
 */
package first;

public class Hello {
	public static void main(String[] args) { // 메서드 : 소문자로 시작 ~()main()는 프로그램의 시작
		// 주석: 1줄 주석 ([ctrl]+/)
		// 한줄복사: ([ctrl] + [alt] + 방향키)
		System.out.println("정수"); // "문자열" : 문자 하나하나를 열거 했다 (정수 Integer)
		System.out.println(1); //숫자 1 00000001
		System.out.println(0);
		System.out.println(-1);
		System.out.println(-1+1); //정수+정수 = 0 출력
		System.out.println("-1"+"1"); // "-11"
		
		System.out.println("문자"); //'문자1개'
		System.out.println('1'); //문자 1, 49의 2진수로 저장됨 -> 출력시 다시 문자 1로 출력
//		System.out.println("010627-369811".charAt(7));//String 클래스 객체 7번째 숫자를 출력 
		System.out.println('A'+32); // 65의 2진수 + 32의 2진수 = 97의 2진수 => 그대로 97로 출력
		System.out.println((char)('A'+32)); //(강제로형변환)
		System.out.println((int)'a'); //(int 강제형변환) 97
		
		int a = 5; //변수 a 설정
		int b = 6; //변수 b 설정
		int sub = a*b; // 곱하기
		System.out.println(sub);
		System.out.println(a*b);
	} // 프로그램의 끝

}
/*
 * 메서드 4가지 형태 
 * 1. void결과리턴X a(입력X){기능} 
 * 2. 결과리턴O a(입력X){기능} 
 * 3. void결과리턴X a(입력O){기능} 
 * 4. 결과리턴O a(입력O){기능}
 */
