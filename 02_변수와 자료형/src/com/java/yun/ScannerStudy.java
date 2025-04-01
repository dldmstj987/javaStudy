package com.java.yun;
import java.util.Scanner;

public class ScannerStudy {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);//객체를 만들어 메모리에 올리는 생성자
		
		System.out.print("숫자 입력해봐: ");
		int num1 = scanner.nextInt(); //scanner. 주소를 참조하여 nextInt()로 정수 읽어드림
		int num2 = scanner.nextInt();
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		
		scanner.close();
	}

}
