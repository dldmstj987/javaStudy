package com.java.yun;

import java.util.Scanner; //설계도
import java.math.BigDecimal;
import java.lang.*; //자바커파일러가 컴파일하기 전에 자동 삽입해줌

public class UseVariable {

	public static void main(String[] args) {
		// 변수와 자료형
		/*
		 * =: 대입연산자
		 * == 같다
		 * != 다르다
		 */
		System.out.println("----- 논리형: true(참), flase(거짓) -----");
		boolean b = true; //b에 true 값을 저장
		System.out.println(b);
		
		b = false;
		System.out.println(b);
		
		if(b) System.out.println("조건이 참이면 실행");
		else System.out.println("조건이 거짓이면 실행");
		/*
		 * if(조건문) {조건문이 참이면 실행} //실행문이 1줄이면 중괄호 생략 가능
		 *	else {조건문이 거짓이면 실행}
		 *
		 *조건문: 참 또는 거짓이 결과
		 */
		
		//if else문으로 변경
		if (b == true) {
			System.out.println("조건이 참이면 실행");
		} else {
			System.out.println("조건이 거짓이면 실행");
		}
		
		//정수형
		System.out.println("----- 정수형(음수 0 양수): byte(1) -> short(2) -> int(4) 기본 -> long(8) -----");
		int i; //변수 선언
		i =7; // 변수 초기화
		System.out.println("i의 값은="+i);
		
	} //main의 끝
	
	void add1(){
		System.out.println("나는 입력도 결과도 안들려주지롱!");
	}

	int add2(){
		return 10;
	}

	void add3(int i, int i2){
		//return; //강제로 메서드 종료, 오류 발생
		System.out.println("나는 입력값은 필요하지만 결과도 안돌려주지롱!");
		//return; //강제로 메서드 종료
		
	}

	double add4(int i, double d){
		return i + d; // 정수 + 실수 = 실수
	}
	

	

} // class의 끝

/*
 * print: 콘솔에 그대로 출력
 */
