package report;

import java.util.Scanner;

public class Gugudan03_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("출력할 시작 단을 입력하세요: ");
        int startDan = scanner.nextInt();

        System.out.print("출력할 마지막 단을 입력하세요: ");
        int endDan = scanner.nextInt();

        System.out.println();

        // 유효성 검사
        if (startDan < 2 || endDan > 9 || startDan > endDan) {
            System.out.println("⚠️ 2단부터 9단 사이로, 시작단 ≤ 끝단으로 입력하세요.");
        } else {
        	 // 각 단 제목(★ X단 시작 ★) 출력
            for (int dan = startDan; dan <= endDan; dan++) {
                System.out.printf("%-15s", "★ " + dan + "단 시작 ★");
            }
            System.out.println();
        	
            // 세로 출력: times가 바깥쪽, dan이 안쪽
            for (int times = 1; times <= 9; times++) {
                for (int dan = startDan; dan <= endDan; dan++) {
                	System.out.printf("%-15s", dan + "X" + times + "=" + (dan * times)); // 구구단 줄
                }
                System.out.println(); // 줄 바꿈
            }
        }

        scanner.close(); // 메모리 정리
    }
}
