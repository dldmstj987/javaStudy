package ifswitch;

import java.util.Scanner;

public class IfSwitch {
	//멤버변수 = 필드(field)
//	int x;
//	double pi; // = 3.14; //3.141592.....
//	String str;//null
	
	//기본생성자(생성자가 없으면 컴파일러가 컴파일 전에 자동 삽입) : 멤버변수에 기본값을 채워 객체를 생성 
	//public IfSwitch(){}

	public static void main(String[] args) {//매개변수 지역변수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력(0~100) > ");//88엔터
		int n1 = sc.nextInt();
		
		/**
		 * if문
		 * (조건문)안에 들어갈 수 있는 것 : true 또는 false 결과로 가지는 것 
		 */
		
		//단독 if문 : 서로 독립적 - 관련없다.
		if(n1 >= 90) System.out.println("A");		
		if(n1 >= 80) System.out.println("B");		
		if(n1 >= 70) System.out.println("C");		
		if(n1 >= 60) System.out.println("D");		
		if(n1 <  60) System.out.println("F");
		
		System.out.println();//구분위한 빈줄
		
		//단독 if문 : 서로 독립적 - 관련없다.
		if(n1 > 100) System.out.println("점수 범위를 벗어남. 0~100 사이 값 입력요망!");
		if(n1 >= 90 && n1 <=100) System.out.println("A");		
		if(n1 >= 80 && n1 <90) System.out.println("B");		
		if(n1 >= 70 && n1 <80) System.out.println("C");		
		if(n1 >= 60 && n1 <70) System.out.println("D");		
		if(n1 < 60 && n1 >= 0) System.out.println("F");
		if(n1 < 0) System.out.println("점수 범위를 벗어남. 0~100 사이 값 입력요망!");
		
		System.out.println();//구분위한 빈줄
		
		/**
		 * if~else if...else문 : 서로 연결된 한덩어리. 여러 조건문 중 반드시 하나만 참=>실행
		 */
		if(n1 < 0 ||  n1 > 100) System.out.println("점수 범위를 벗어남. 0~100 사이 값 입력요망!");
		else if(n1 >= 90) System.out.println("A");	//else? 0<=n1 && n1<=100	
		else if(n1 >= 80) System.out.println("B");	//else? && n1<90	
		else if(n1 >= 70) System.out.println("C");	//else? && n1 <80	
		else if(n1 >= 60) System.out.println("D");	//else? && n1 <70	
		else System.out.println("F");               //else? && n1 <60
		
		System.out.println();//구분위한 빈줄
		
		if(n1 < 0 ||  n1 > 100) System.out.println("점수 범위를 벗어남. 0~100 사이 값 입력요망!");
		else if(n1 >= 90) {
			System.out.print("A"); 
//			System.out.println("학점");	
		}
		else if(n1 >= 80) {
			System.out.print("B"); 
//			System.out.println("학점");	
		}	
		else if(n1 >= 70) {
			System.out.print("C"); 
//			System.out.println("학점");	
		}	
		else if(n1 >= 60) {
			System.out.print("D"); 
//			System.out.println("학점");	
		}	
		else {
			System.out.print("F"); 
//			System.out.println("학점");
		}    
		
		System.out.println("학점");	//참 거짓에 관계없이 무조건 실행
		
		System.out.println();//구분위한 빈줄
		
		/**
		 * 중첩 if문 : 95~100 : A+, 90~94 : A-
		 */
		if(n1 < 0 ||  n1 > 100) System.out.println("점수 범위를 벗어남. 0~100 사이 값 입력요망!");
		else if(n1 >= 90) {
			if(n1 >= 95) System.out.print("A+");
			else System.out.print("A-");//else? n1 >= 90 && n1 < 95
		}
		else if(n1 >= 80) {
			System.out.print("B"); 
		}	
		else if(n1 >= 70) {
			System.out.print("C"); 
		}	
		else if(n1 >= 60) {
			System.out.print("D"); 
		}	
		else {
			System.out.print("F"); 
		}    
		
		System.out.println("학점");	
		
		System.out.println();//구분위한 빈줄
		
		/** switch() 여러 개 중 하나만 선택하여 실행
		 * 
		 * switch() 안에 들어갈 수 있는 내용 : 정수 or '문자' or "문자열" 을 결과로 가지는 것(★주의 : 실수 안됨)
		 * case 정수리터럴 or '문자'리터럴 or "문자열"리터럴 만 가능
		 *    (예) 정수리터럴 : 3, 96+1
		 *        '문자'리터럴 : 'a'  'a'+1
		 *        "문자열"리터럴 : "a" 
		 */
		//예-1 : switch(정수)
		System.out.println("----- switch(정수) ------------------");
		switch(6+4) {
		case 9+1 :System.out.println("10입니다."); 
		         break;
		case 20 :System.out.println("20입니다."); 
		         break;
		case 30 :System.out.println("30입니다."); 
		         break;
		default :System.out.println("10,20,30 이외입니다.");//break; 생략가능 		
		}
		
		
		//예-1 : switch('문자')
		System.out.println("----- switch('문자') ------------------");
		System.out.println("테스트-1");
		switch ('a') {
		case 'a': System.out.println("문자 a입니다.");
		          break;
		case 'b': System.out.println("문자 b입니다.");
		          break;
		default:  System.out.println("문자 a, b 이외의 문자입니다.");
			      break;
		}
		System.out.println("테스트-2");
		switch ('a') {//97의 2진수
		case 97: System.out.println("문자 a입니다.");
		         break;
		case 'b': System.out.println("문자 b입니다.");
		          break;
		default:  System.out.println("문자 a, b 이외의 문자입니다.");
		          break;
		}
		
		System.out.println("테스트-3");
		System.out.print("당신이 입력한 정수에 해당하는 문자는(97~100)?");
		int num = sc.nextInt();
		switch (num) {//97
		case 'a': System.out.println("문자 a입니다.");
		         break;
		case 'b': System.out.println("문자 b입니다.");
		          break;
		default:  System.out.println("문자 a, b 이외의 문자입니다.");
		          break;
		}
		
		/**
		 * static 있는 메서드 : JVM이 해당클래스를 메모리에 올릴 때 static 영역에 올라감
		 *                  해당클래스명. 으로 접근 => 권장
		 *                  주소. 로 접근       => 경고
		 * static 없는 메서드 : new 생성자() => 객체 생성 => 주소. 로 접근
		 */
		
		System.out.println("테스트-4");
		System.out.print("당신이 입력한 정수에 해당하는 문자를 대문자로 표현하면(97~100)?");
		num = sc.nextInt();
		
		IfSwitch ifswitch = new IfSwitch();//생성자로 객체 생성
		
		//switch (ifswitch.parseChar(num)) {//97 -> 문자변환 메서드 (주소. 로 접근하면 경고)
		switch (IfSwitch.parseChar(num)) {//IfSwitch.생략가능(이유?같은 클래스 안에 있으므로...)
		case 'a': System.out.println("문자 A입니다.");
		         break;
		case 'b': System.out.println("문자 B입니다.");
		          break;
		default:  System.out.println("문자 A, B 이외의 문자입니다.");
		          break;
		}
		
		System.out.println("테스트-5");
		System.out.print("당신이 입력한 정수에 해당하는 문자를 대문자로 표현하면(97~100)?");
		num = sc.nextInt();		
		
		switch (ifswitch.parseChar2(num)) {//97 -> 문자변환 메서드
		case 'a': System.out.println("문자 A입니다.");
		         break;
		case 'b': System.out.println("문자 B입니다.");
		          break;
		default:  System.out.println("문자 A, B 이외의 문자입니다.");
		          break;
		}
		/*---------------------------------------------------------------------*/
		
		/*----주의 : 모든 case문에서 같은 실행문을 실행시켜면 switch문으로 처리안함---------------*/
		System.out.println("테스트-6");
		System.out.print("당신이 입력한 정수에 해당하는 문자를 대문자로 표현하면(97~100)?");
		num = sc.nextInt();		
		//방법-1
		System.out.println("문자 "+ (char)(num-32) +"입니다.");
		//방법-2
		System.out.println("문자 "+ (char)Character.toUpperCase(num) +"입니다.");
		
//		switch (num) {//97-32 -> 65 
//		case 'a': System.out.println("문자 "+ (char)(num-32) +"입니다.");
//		         break;
//		case 'b': System.out.println("문자 "+ Character.toUpperCase(num) +"입니다.");
//		          break;
//		default:  System.out.println("문자 A, B 이외의 문자입니다.");
//		          break;
//		}		
		
		System.out.print("문자 1개 입력(대문자 영어)");		
		String word = sc.next();//구분자 앞까지 "A"
		//sc.nextLine();//엔터까지 읽어들인 후 엔터를 버리고 나머지 문자들로 문자열 객체 생성
		
		char ch = word.charAt(0);		
		/*
		switch (ch) {//'A'
		case 'A': System.out.println(ch + "에 대한 코드값=" + (int)ch);			
			      break;
		case 'B': System.out.println(ch + "에 대한 코드값=" + (int)ch);			
	              break;		      
		default:  System.out.println(ch + "에 대한 코드값=" + (int)ch);	
			      break;
		}
		*/
		System.out.println(ch + "에 대한 코드값=" + (int)ch);	
		
		/*
		switch (word) {
		case "A": System.out.println(word + "에 대한 코드값=" + (int)word.charAt(0));			
			      break;
		case "B": System.out.println(word + "에 대한 코드값=" + (int)word.charAt(0));			
	              break;		      
		default:  System.out.println(word + "에 대한 코드값=" + (int)word.charAt(0));	
			      break;
		}
		*/
		System.out.println(word + "에 대한 코드값=" + (int)word.charAt(0));
		/*--------------------------------------------------------------------*/
		
		
		//예-3 : switch("문자열")
		System.out.println("----- switch(\"문자열\") ------------------");
		System.out.println("테스트-1 : 카페주문(1번만)");
		System.out.print("메뉴(아메리카노, 카페라떼, 카푸치노) 중에서 주문 > ");
		String order = sc.next();
		
		switch(order) {
		case "아메리카노" : //System.out.println("아메리카노를 주문하셨습니다."); break;
		case "카페라떼"  : //System.out.println("카페라떼를 주문하셨습니다."); break;
		case "카푸치노"  : //System.out.println("카푸치노를 주문하셨습니다."); break;
			            System.out.println(order + "을(를) 주문하셨습니다."); break;
		default       : System.out.println(order + "은(는) 메뉴에 없습니다."); break;
		}
		
		System.out.println("테스트-2 : 카페주문(for문 이용 3번만)");
		
		int i;
		for(i=1;i<=3;i++) {
			System.out.print("메뉴(아메리카노, 카페라떼, 카푸치노) 중에서 주문 > ");
			order = sc.next();
			
			switch(order) {
			case "아메리카노" : //System.out.println("아메리카노를 주문하셨습니다."); break;
			case "카페라떼"  : //System.out.println("카페라떼를 주문하셨습니다."); break;
			case "카푸치노"  : //System.out.println("카푸치노를 주문하셨습니다."); break;
				            System.out.println(order + "을(를) 주문하셨습니다."); break;
			default       : System.out.println(order + "은(는) 메뉴에 없습니다."); break;
			}
		}
		
		/*=== JDK 14 이후만 실행됨 ============================================================*/
		//첫번째
		System.out.print("메뉴(아메리카노, 카페라떼, 카푸치노) 중에서 주문 > ");
		order = sc.next();
		
		switch(order) {//: 대신 -> 사용 (장점:break; 없이 switch문 끝)
		case "아메리카노" -> System.out.println("아메리카노를 주문하셨습니다."); //★★break; 있으면 오류발생
		case "카페라떼"  -> System.out.println("카페라떼를 주문하셨습니다."); 
		case "카푸치노"  -> System.out.println("카푸치노를 주문하셨습니다.");			         
		default       -> System.out.println(order + "은(는) 메뉴에 없습니다."); 
		}
		
		
		switch(order) {//: 대신 -> 사용 (장점:break; 없이 switch문 끝)
		case "아메리카노","카페라떼","카푸치노"  -> System.out.println(order + "을(를) 주문하셨습니다."); 
		default                        -> System.out.println(order + "은(는) 메뉴에 없습니다."); 
		}
		
		//두번째
		System.out.print("메뉴(아메리카노, 카페라떼, 카푸치노) 중에서 주문 > ");
		order = sc.next();
		
		String orderMenu = switch(order) {
							case "아메리카노" -> "아메리카노를 주문하셨습니다."; 
							case "카페라떼"  -> "카페라떼를 주문하셨습니다."; 
							case "카푸치노"  -> "카푸치노를 주문하셨습니다.";			         
							default       -> order + "은(는) 메뉴에 없습니다."; 
							};//★★주의 ;으로 끝남
							
		System.out.println(orderMenu);
		
		//세번째 : 결과를 반환하기 위한 yield 사용하기		
		System.out.print("1~12월 중 하나만 선택하여 입력(1~12) => 그 달의 일을 출력 > ");
		int month = sc.nextInt();
		
		int day = switch(month) {
		case 1,3,5,7,8,10,11 -> 31; 
		case 2  -> 28; 
		case 4,6,9,12  -> 30;			         
		default -> {
			if (month < 1 || month > 12) {
				System.out.println("없는 달 입니다.");
			} else {
				System.out.println("알 수 없는 오류 입니다.");
			}
			yield 0; //조건에 없는 숫자를 입력하면 0을 반환
		}
	};//★★주의 ;으로 끝남
		
	System.out.println(month + "월의 날짜는" + day + "일까지 있습니다");
		
	}//main() 끝
	
	/**
	 * 메서드 오버로딩 : 메서드명은 같아도 되나 ()안의 매개변수의 타입이나 개수 달라야 함	
	 */
	static char parseChar(int num){ //정수->문자 변환하는 메서드
		return (char)num;
	}
	
	char parseChar2(int num){      //정수->문자 변환하는 메서드
		return (char)num;
	}

}//class 끝