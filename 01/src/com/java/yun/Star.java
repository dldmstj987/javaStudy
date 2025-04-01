package com.java.yun;


public class Star {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for (int i = 1; i < 10; i+=2) {
			for (int j = 9; j > i; j-=2) {
				System.out.print(" "); //괄호안 내용을 단순히 출력
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*"); //괄호안 내용을 단순히 출력 
			}
			System.out.println(); //괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
		}
	}

}
